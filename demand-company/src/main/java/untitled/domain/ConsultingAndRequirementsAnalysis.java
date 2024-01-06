package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ConsultingAndRequirementsAnalysis extends AbstractEvent {

    public ConsultingAndRequirementsAnalysis(
        ConsultingAndRequirementAnalysis aggregate
    ) {
        super(aggregate);
    }

    public ConsultingAndRequirementsAnalysis() {
        super();
    }
}
//>>> DDD / Domain Event
