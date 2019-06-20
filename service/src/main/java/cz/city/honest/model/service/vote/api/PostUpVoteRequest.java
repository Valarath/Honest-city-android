package cz.city.honest.model.service.vote.api;

import java.util.List;

import cz.city.honest.dto.dto.vote.Vote;
import lombok.Data;

@Data
public class PostUpVoteRequest {
    private List<Vote> votes;
}
