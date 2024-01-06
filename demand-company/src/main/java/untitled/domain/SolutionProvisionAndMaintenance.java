package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DemandCompanyApplication;
import untitled.domain.SolutionProvisionAndMaintenance;

@Entity
@Table(name = "SolutionProvisionAndMaintenance_table")
@Data
//<<< DDD / Aggregate Root
public class SolutionProvisionAndMaintenance {

    @PostPersist
    public void onPostPersist() {
        SolutionProvisionAndMaintenance solutionProvisionAndMaintenance = new SolutionProvisionAndMaintenance(
            this
        );
        solutionProvisionAndMaintenance.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SolutionProvisionAndMaintenanceRepository repository() {
        SolutionProvisionAndMaintenanceRepository solutionProvisionAndMaintenanceRepository = DemandCompanyApplication.applicationContext.getBean(
            SolutionProvisionAndMaintenanceRepository.class
        );
        return solutionProvisionAndMaintenanceRepository;
    }
}
//>>> DDD / Aggregate Root
