package roomresrvationlcl.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import roomresrvationlcl.domain.*;

@Component
public class AccommodationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Accommodation>> {

    @Override
    public EntityModel<Accommodation> process(
        EntityModel<Accommodation> model
    ) {
        return model;
    }
}
