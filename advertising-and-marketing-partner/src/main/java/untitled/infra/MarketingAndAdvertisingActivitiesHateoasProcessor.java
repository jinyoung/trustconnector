package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class MarketingAndAdvertisingActivitiesHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<MarketingAndAdvertisingActivities>> {

    @Override
    public EntityModel<MarketingAndAdvertisingActivities> process(
        EntityModel<MarketingAndAdvertisingActivities> model
    ) {
        return model;
    }
}
