package cz.city.honest.model.service.user.api;

import java.util.List;
import java.util.Map;

import cz.city.honest.model.dto.suggestion.Suggestion;
import cz.city.honest.model.dto.user.User;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetUserSuggestionsResponse {
    private Map<Class<? extends Suggestion>,List<? extends Suggestion>> userSuggestions;
    private User user;
}
