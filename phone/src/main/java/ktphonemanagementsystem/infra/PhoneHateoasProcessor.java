package ktphonemanagementsystem.infra;

import ktphonemanagementsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class PhoneHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Phone>> {

    @Override
    public EntityModel<Phone> process(EntityModel<Phone> model) {
        return model;
    }
}
