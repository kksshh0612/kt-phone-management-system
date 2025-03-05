package ktphonemanagementsystem.infra;

import ktphonemanagementsystem.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerCenterHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerCenter>> {

    @Override
    public EntityModel<CustomerCenter> process(
        EntityModel<CustomerCenter> model
    ) {
        return model;
    }
}
