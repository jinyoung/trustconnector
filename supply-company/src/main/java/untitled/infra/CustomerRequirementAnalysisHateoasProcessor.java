package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CustomerRequirementAnalysisHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<CustomerRequirementAnalysis>> {

    @Override
    public EntityModel<CustomerRequirementAnalysis> process(
        EntityModel<CustomerRequirementAnalysis> model
    ) {
        return model;
    }
}
