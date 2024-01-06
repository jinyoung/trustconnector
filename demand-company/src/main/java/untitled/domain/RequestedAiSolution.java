package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RequestedAiSolution extends AbstractEvent {

    public RequestedAiSolution(AiSolutionRequest aggregate) {
        super(aggregate);
    }

    public RequestedAiSolution() {
        super();
    }
}
//>>> DDD / Domain Event
