package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.MarketingAndSalesExpertApplication;
import untitled.domain.MarketingAndSalesActivities;

@Entity
@Table(name = "MarketingAndSalesActivities_table")
@Data
//<<< DDD / Aggregate Root
public class MarketingAndSalesActivities {

    @PostPersist
    public void onPostPersist() {
        MarketingAndSalesActivities marketingAndSalesActivities = new MarketingAndSalesActivities(
            this
        );
        marketingAndSalesActivities.publishAfterCommit();
    }

    public static MarketingAndSalesActivitiesRepository repository() {
        MarketingAndSalesActivitiesRepository marketingAndSalesActivitiesRepository = MarketingAndSalesExpertApplication.applicationContext.getBean(
            MarketingAndSalesActivitiesRepository.class
        );
        return marketingAndSalesActivitiesRepository;
    }
}
//>>> DDD / Aggregate Root
