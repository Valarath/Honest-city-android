package cz.city.honest.dto.dto.suggestion;


import cz.city.honest.dto.dto.subject.Position;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NewExchangePointSuggestion extends Suggestion{
    private Position position;
}
