package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class MarketingAndSalesActivitiesHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<MarketingAndSalesActivities>> {

    @Override
    public EntityModel<MarketingAndSalesActivities> process(
        EntityModel<MarketingAndSalesActivities> model
    ) {
        return model;
    }
}
