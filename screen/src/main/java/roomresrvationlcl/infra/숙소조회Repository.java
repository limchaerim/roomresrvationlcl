package roomresrvationlcl.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import roomresrvationlcl.domain.*;

@RepositoryRestResource(collectionResourceRel = "숙소조회", path = "숙소조회")
public interface 숙소조회Repository
    extends PagingAndSortingRepository<숙소조회, Long> {}
