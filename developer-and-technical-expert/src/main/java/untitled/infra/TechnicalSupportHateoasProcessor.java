package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class TechnicalSupportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TechnicalSupport>> {

    @Override
    public EntityModel<TechnicalSupport> process(
        EntityModel<TechnicalSupport> model
    ) {
        return model;
    }
}
