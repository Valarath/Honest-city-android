package cz.honestcity.model.dto.suggestion;


import cz.honestcity.model.dto.subject.Position;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NewExchangePointSuggestion extends Suggestion{
    private Position position;
}
