package cz.honestcity.model.dto.suggestion;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class ClosedExchangePointSuggestion extends Suggestion {
    private long exchangePointId;
}
