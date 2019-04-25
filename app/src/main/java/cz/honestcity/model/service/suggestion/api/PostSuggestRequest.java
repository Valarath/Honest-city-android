package cz.honestcity.model.service.suggestion.api;

import java.util.List;

import cz.honestcity.model.dto.suggestion.Suggestion;
import lombok.Data;

@Data
public class PostSuggestRequest {
    private List<? extends Suggestion> newExchangePointSuggestions;

}
