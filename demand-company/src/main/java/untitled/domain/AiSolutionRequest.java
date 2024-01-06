package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DemandCompanyApplication;
import untitled.domain.RequestedAiSolution;

@Entity
@Table(name = "AiSolutionRequest_table")
@Data
//<<< DDD / Aggregate Root
public class AiSolutionRequest {

    @PostPersist
    public void onPostPersist() {
        RequestedAiSolution requestedAiSolution = new RequestedAiSolution(this);
        requestedAiSolution.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AiSolutionRequestRepository repository() {
        AiSolutionRequestRepository aiSolutionRequestRepository = DemandCompanyApplication.applicationContext.getBean(
            AiSolutionRequestRepository.class
        );
        return aiSolutionRequestRepository;
    }
}
//>>> DDD / Aggregate Root
