package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.SupplyCompanyApplication;
import untitled.domain.CustomerRequirementAnalysis;

@Entity
@Table(name = "CustomerRequirementAnalysis_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerRequirementAnalysis {

    @PostPersist
    public void onPostPersist() {
        CustomerRequirementAnalysis customerRequirementAnalysis = new CustomerRequirementAnalysis(
            this
        );
        customerRequirementAnalysis.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerRequirementAnalysisRepository repository() {
        CustomerRequirementAnalysisRepository customerRequirementAnalysisRepository = SupplyCompanyApplication.applicationContext.getBean(
            CustomerRequirementAnalysisRepository.class
        );
        return customerRequirementAnalysisRepository;
    }
}
//>>> DDD / Aggregate Root
