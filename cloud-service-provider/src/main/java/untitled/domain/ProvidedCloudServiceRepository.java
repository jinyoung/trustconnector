package untitled.domain;

import untitled.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="providedCloudServices", path="providedCloudServices")
public interface ProvidedCloudServiceRepository extends PagingAndSortingRepository<ProvidedCloudService, >{
}