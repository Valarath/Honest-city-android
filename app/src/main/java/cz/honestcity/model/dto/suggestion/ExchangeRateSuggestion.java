package cz.honestcity.model.dto.suggestion;


import cz.honestcity.model.dto.exchange.ExchangeRate;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExchangeRateSuggestion extends Suggestion {
    private long exchangePointId;
    private ExchangeRate suggestedExchangeRate;

}
