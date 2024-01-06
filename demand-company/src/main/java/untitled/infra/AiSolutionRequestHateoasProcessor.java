package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class AiSolutionRequestHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AiSolutionRequest>> {

    @Override
    public EntityModel<AiSolutionRequest> process(
        EntityModel<AiSolutionRequest> model
    ) {
        return model;
    }
}
