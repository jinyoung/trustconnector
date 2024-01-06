package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class SolutionDevelopmentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SolutionDevelopment>> {

    @Override
    public EntityModel<SolutionDevelopment> process(
        EntityModel<SolutionDevelopment> model
    ) {
        return model;
    }
}
