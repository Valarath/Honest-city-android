package cz.honestcity.model.service.user.api;

import java.util.List;
import java.util.Map;

import cz.honestcity.model.dto.suggestion.Suggestion;
import cz.honestcity.model.dto.user.User;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetUserSuggestionsResponse {
    private Map<Class<? extends Suggestion>,List<? extends Suggestion>> userSuggestions;
    private User user;
}
