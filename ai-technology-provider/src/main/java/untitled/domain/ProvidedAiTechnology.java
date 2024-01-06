package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.AiTechnologyProviderApplication;
import untitled.domain.ProvidedAiTechnology;

@Entity
@Table(name = "ProvidedAiTechnology_table")
@Data
//<<< DDD / Aggregate Root
public class ProvidedAiTechnology {

    @PostPersist
    public void onPostPersist() {
        ProvidedAiTechnology providedAiTechnology = new ProvidedAiTechnology(
            this
        );
        providedAiTechnology.publishAfterCommit();
    }

    public static ProvidedAiTechnologyRepository repository() {
        ProvidedAiTechnologyRepository providedAiTechnologyRepository = AiTechnologyProviderApplication.applicationContext.getBean(
            ProvidedAiTechnologyRepository.class
        );
        return providedAiTechnologyRepository;
    }
}
//>>> DDD / Aggregate Root
