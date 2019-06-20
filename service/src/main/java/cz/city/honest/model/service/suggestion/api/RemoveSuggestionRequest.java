package cz.city.honest.model.service.suggestion.api;

import java.util.List;

import cz.city.honest.model.dto.suggestion.Suggestion;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RemoveSuggestionRequest {
    private List<? extends Suggestion> suggestions;
}
