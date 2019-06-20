package cz.city.honest.dto.dto.suggestion;


import cz.city.honest.dto.dto.exchange.ExchangeRate;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExchangeRateSuggestion extends Suggestion {
    private long exchangePointId;
    private ExchangeRate suggestedExchangeRate;

}
