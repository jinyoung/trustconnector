package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.SupplyCompanyApplication;
import untitled.domain.TechnicalSupport;

@Entity
@Table(name = "TechnicalSupport_table")
@Data
//<<< DDD / Aggregate Root
public class TechnicalSupport {

    @PostPersist
    public void onPostPersist() {
        TechnicalSupport technicalSupport = new TechnicalSupport(this);
        technicalSupport.publishAfterCommit();
    }

    public static TechnicalSupportRepository repository() {
        TechnicalSupportRepository technicalSupportRepository = SupplyCompanyApplication.applicationContext.getBean(
            TechnicalSupportRepository.class
        );
        return technicalSupportRepository;
    }
}
//>>> DDD / Aggregate Root
