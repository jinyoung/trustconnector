package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CloudServiceProviderApplication;
import untitled.domain.ProvidedCloudService;

@Entity
@Table(name = "ProvidedCloudService_table")
@Data
//<<< DDD / Aggregate Root
public class ProvidedCloudService {

    @PostPersist
    public void onPostPersist() {
        ProvidedCloudService providedCloudService = new ProvidedCloudService(
            this
        );
        providedCloudService.publishAfterCommit();
    }

    public static ProvidedCloudServiceRepository repository() {
        ProvidedCloudServiceRepository providedCloudServiceRepository = CloudServiceProviderApplication.applicationContext.getBean(
            ProvidedCloudServiceRepository.class
        );
        return providedCloudServiceRepository;
    }
}
//>>> DDD / Aggregate Root
