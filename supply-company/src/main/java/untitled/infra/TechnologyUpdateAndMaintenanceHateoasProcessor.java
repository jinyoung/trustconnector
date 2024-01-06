package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class TechnologyUpdateAndMaintenanceHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<TechnologyUpdateAndMaintenance>> {

    @Override
    public EntityModel<TechnologyUpdateAndMaintenance> process(
        EntityModel<TechnologyUpdateAndMaintenance> model
    ) {
        return model;
    }
}
