package cz.honestcity.model.service.suggestion.api;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SuggestionRestApi {

    @POST("/suggest")
    void suggest(@Body PostSuggestRequest request);

    @POST("/remove")
    void remove(@Body RemoveSuggestionRequest request);
}
