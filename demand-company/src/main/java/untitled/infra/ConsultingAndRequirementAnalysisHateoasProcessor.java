package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class ConsultingAndRequirementAnalysisHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<ConsultingAndRequirementAnalysis>> {

    @Override
    public EntityModel<ConsultingAndRequirementAnalysis> process(
        EntityModel<ConsultingAndRequirementAnalysis> model
    ) {
        return model;
    }
}
