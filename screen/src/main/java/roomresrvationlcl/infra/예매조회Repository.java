package roomresrvationlcl.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import roomresrvationlcl.domain.*;

@RepositoryRestResource(collectionResourceRel = "예매조회", path = "예매조회")
public interface 예매조회Repository
    extends PagingAndSortingRepository<예매조회, Long> {}
