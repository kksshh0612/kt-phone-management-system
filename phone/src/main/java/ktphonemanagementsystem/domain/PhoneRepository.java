package ktphonemanagementsystem.domain;

import ktphonemanagementsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "phones", path = "phones")
public interface PhoneRepository
    extends PagingAndSortingRepository<Phone, Long> {}
