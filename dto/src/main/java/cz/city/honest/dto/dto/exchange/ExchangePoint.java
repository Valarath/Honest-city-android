package cz.city.honest.dto.dto.exchange;

import java.util.List;

import cz.city.honest.dto.dto.subject.ImmobileWatchedSubject;
import cz.city.honest.dto.dto.suggestion.ExchangeRateSuggestion;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExchangePoint extends ImmobileWatchedSubject {
    private ExchangeRate exchangePointRate;
    private List<ExchangeRateSuggestion> exchangeRateSuggestions;
}
