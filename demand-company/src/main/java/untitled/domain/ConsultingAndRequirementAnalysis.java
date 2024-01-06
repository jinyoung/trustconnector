package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DemandCompanyApplication;
import untitled.domain.ConsultingAndRequirementsAnalysis;

@Entity
@Table(name = "ConsultingAndRequirementAnalysis_table")
@Data
//<<< DDD / Aggregate Root
public class ConsultingAndRequirementAnalysis {

    @PostPersist
    public void onPostPersist() {
        ConsultingAndRequirementsAnalysis consultingAndRequirementsAnalysis = new ConsultingAndRequirementsAnalysis(
            this
        );
        consultingAndRequirementsAnalysis.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ConsultingAndRequirementAnalysisRepository repository() {
        ConsultingAndRequirementAnalysisRepository consultingAndRequirementAnalysisRepository = DemandCompanyApplication.applicationContext.getBean(
            ConsultingAndRequirementAnalysisRepository.class
        );
        return consultingAndRequirementAnalysisRepository;
    }
}
//>>> DDD / Aggregate Root
