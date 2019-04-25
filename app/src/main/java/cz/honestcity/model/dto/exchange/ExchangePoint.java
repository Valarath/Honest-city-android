package cz.honestcity.model.dto.exchange;

import cz.honestcity.model.dto.subject.ImmobileWatchedSubject;
import cz.honestcity.model.dto.suggestion.ExchangeRateSuggestion;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ExchangePoint extends ImmobileWatchedSubject {
    private ExchangeRate exchangePointRate;
    private List<ExchangeRateSuggestion> exchangeRateSuggestions;
}
