package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.SupplyCompanyApplication;
import untitled.domain.DevelopedAndProvidedSolution;

@Entity
@Table(name = "DevelopedAndProvidedSolution_table")
@Data
//<<< DDD / Aggregate Root
public class DevelopedAndProvidedSolution {

    @PostPersist
    public void onPostPersist() {
        DevelopedAndProvidedSolution developedAndProvidedSolution = new DevelopedAndProvidedSolution(
            this
        );
        developedAndProvidedSolution.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DevelopedAndProvidedSolutionRepository repository() {
        DevelopedAndProvidedSolutionRepository developedAndProvidedSolutionRepository = SupplyCompanyApplication.applicationContext.getBean(
            DevelopedAndProvidedSolutionRepository.class
        );
        return developedAndProvidedSolutionRepository;
    }
}
//>>> DDD / Aggregate Root
