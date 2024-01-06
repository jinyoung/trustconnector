package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class SolutionProvisionAndMaintenanceHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<SolutionProvisionAndMaintenance>> {

    @Override
    public EntityModel<SolutionProvisionAndMaintenance> process(
        EntityModel<SolutionProvisionAndMaintenance> model
    ) {
        return model;
    }
}
