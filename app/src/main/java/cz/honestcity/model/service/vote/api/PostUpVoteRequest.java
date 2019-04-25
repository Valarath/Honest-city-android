package cz.honestcity.model.service.vote.api;

import java.util.List;

import cz.honestcity.model.dto.vote.Vote;
import lombok.Data;

@Data
public class PostUpVoteRequest {
    private List<Vote> votes;
}
