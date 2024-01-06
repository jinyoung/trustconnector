package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DeveloperAndTechnicalExpertApplication;
import untitled.domain.SolutionDevelopment;

@Entity
@Table(name = "SolutionDevelopment_table")
@Data
//<<< DDD / Aggregate Root
public class SolutionDevelopment {

    @PostPersist
    public void onPostPersist() {
        SolutionDevelopment solutionDevelopment = new SolutionDevelopment(this);
        solutionDevelopment.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SolutionDevelopmentRepository repository() {
        SolutionDevelopmentRepository solutionDevelopmentRepository = DeveloperAndTechnicalExpertApplication.applicationContext.getBean(
            SolutionDevelopmentRepository.class
        );
        return solutionDevelopmentRepository;
    }
}
//>>> DDD / Aggregate Root
