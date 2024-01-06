package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class ProvidedAiTechnologyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ProvidedAiTechnology>> {

    @Override
    public EntityModel<ProvidedAiTechnology> process(
        EntityModel<ProvidedAiTechnology> model
    ) {
        return model;
    }
}
