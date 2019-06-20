package cz.city.honest.dto.dto.vote;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Vote {
    private VoteType voteType;
    private long suggestionId;
    private long userId;
}
