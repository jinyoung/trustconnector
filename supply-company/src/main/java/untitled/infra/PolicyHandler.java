package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    DevelopedAndProvidedSolutionRepository developedAndProvidedSolutionRepository;

    @Autowired
    CustomerRequirementAnalysisRepository customerRequirementAnalysisRepository;

    @Autowired
    TechnologyUpdateAndMaintenanceRepository technologyUpdateAndMaintenanceRepository;

    @Autowired
    TechnicalSupportRepository technicalSupportRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RequestedAiSolution'"
    )
    public void wheneverRequestedAiSolution_SolutionRequestedPolicy(
        @Payload RequestedAiSolution requestedAiSolution
    ) {
        RequestedAiSolution event = requestedAiSolution;
        System.out.println(
            "\n\n##### listener SolutionRequestedPolicy : " +
            requestedAiSolution +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ConsultingAndRequirementsAnalysis'"
    )
    public void wheneverConsultingAndRequirementsAnalysis_ConsultingRequestedPolicy(
        @Payload ConsultingAndRequirementsAnalysis consultingAndRequirementsAnalysis
    ) {
        ConsultingAndRequirementsAnalysis event =
            consultingAndRequirementsAnalysis;
        System.out.println(
            "\n\n##### listener ConsultingRequestedPolicy : " +
            consultingAndRequirementsAnalysis +
            "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
