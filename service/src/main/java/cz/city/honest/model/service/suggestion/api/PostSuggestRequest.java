package cz.city.honest.model.service.suggestion.api;

import java.util.List;

import cz.city.honest.model.dto.suggestion.Suggestion;
import lombok.Data;

@Data
public class PostSuggestRequest {
    private List<? extends Suggestion> newExchangePointSuggestions;

}
