package ktphonemanagementsystem.domain;

import ktphonemanagementsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "customerCenters",
    path = "customerCenters"
)
public interface CustomerCenterRepository
    extends PagingAndSortingRepository<CustomerCenter, Long> {}
