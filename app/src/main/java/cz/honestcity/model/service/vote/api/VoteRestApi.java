package cz.honestcity.model.service.vote.api;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface VoteRestApi {

    @POST("/up-vote")
    void upVote(@Body PostUpVoteRequest request);
}
