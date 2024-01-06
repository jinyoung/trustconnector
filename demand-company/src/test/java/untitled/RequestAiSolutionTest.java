package untitled;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.MimeTypeUtils;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RequestAiSolutionTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(
        CommandTest.class
    );

    @Autowired
    private KafkaProcessor processor;

    @Autowired
    private MessageCollector messageCollector;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    public AISolutionRequestRepository repository;

    @Test
    @SuppressWarnings("unchecked")
    public void test0() {
        //given:
        AISolutionRequest existingEntity = new AISolutionRequest();

        existingEntity.setName("projectId");
        existingEntity.setValue("1");

        repository.save(existingEntity);

        //when:

        try {
            AISolutionRequest newEntity = new AISolutionRequest();

            newEntity.setName("projectId");
            newEntity.setValue("1");

            repository.save(newEntity);

            //then:

            Message<String> received = (Message<String>) messageCollector
                .forChannel(processor.outboundTopic())
                .poll();

            assertNotNull("Resulted event must be published", received);

            RequestedAISolution outputEvent = objectMapper.readValue(
                received.getPayload(),
                RequestedAISolution.class
            );

            LOGGER.info("Response received: {}", received.getPayload());

            assertEquals(outputEvent.getName(), "projectId");
            assertEquals(outputEvent.getValue(), "1");
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            assertTrue("exception", false);
        }
    }
}
