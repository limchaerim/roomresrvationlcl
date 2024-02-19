package roomresrvationlcl.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import roomresrvationlcl.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRepository
    extends PagingAndSortingRepository<Payment, Long> {}
