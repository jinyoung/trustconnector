package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.AdvertisingAndMarketingPartnerApplication;
import untitled.domain.MarketingAndAdvertisingActivities;

@Entity
@Table(name = "MarketingAndAdvertisingActivities_table")
@Data
//<<< DDD / Aggregate Root
public class MarketingAndAdvertisingActivities {

    @PostPersist
    public void onPostPersist() {
        MarketingAndAdvertisingActivities marketingAndAdvertisingActivities = new MarketingAndAdvertisingActivities(
            this
        );
        marketingAndAdvertisingActivities.publishAfterCommit();
    }

    public static MarketingAndAdvertisingActivitiesRepository repository() {
        MarketingAndAdvertisingActivitiesRepository marketingAndAdvertisingActivitiesRepository = AdvertisingAndMarketingPartnerApplication.applicationContext.getBean(
            MarketingAndAdvertisingActivitiesRepository.class
        );
        return marketingAndAdvertisingActivitiesRepository;
    }
}
//>>> DDD / Aggregate Root
