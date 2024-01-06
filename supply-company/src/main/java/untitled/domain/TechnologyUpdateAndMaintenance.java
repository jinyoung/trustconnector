package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.SupplyCompanyApplication;
import untitled.domain.TechnologyUpdateAndMaintenance;

@Entity
@Table(name = "TechnologyUpdateAndMaintenance_table")
@Data
//<<< DDD / Aggregate Root
public class TechnologyUpdateAndMaintenance {

    @PostPersist
    public void onPostPersist() {
        TechnologyUpdateAndMaintenance technologyUpdateAndMaintenance = new TechnologyUpdateAndMaintenance(
            this
        );
        technologyUpdateAndMaintenance.publishAfterCommit();
    }

    public static TechnologyUpdateAndMaintenanceRepository repository() {
        TechnologyUpdateAndMaintenanceRepository technologyUpdateAndMaintenanceRepository = SupplyCompanyApplication.applicationContext.getBean(
            TechnologyUpdateAndMaintenanceRepository.class
        );
        return technologyUpdateAndMaintenanceRepository;
    }
}
//>>> DDD / Aggregate Root
