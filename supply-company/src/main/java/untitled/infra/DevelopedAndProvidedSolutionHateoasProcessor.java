package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class DevelopedAndProvidedSolutionHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<DevelopedAndProvidedSolution>> {

    @Override
    public EntityModel<DevelopedAndProvidedSolution> process(
        EntityModel<DevelopedAndProvidedSolution> model
    ) {
        return model;
    }
}
