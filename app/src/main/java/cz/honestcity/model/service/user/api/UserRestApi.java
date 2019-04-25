package cz.honestcity.model.service.user.api;

import retrofit2.http.GET;

public interface UserRestApi {

    @GET("/user-suggestions")
    GetUserSuggestionsResponse getUserSuggestions(GetUserSuggestionsRequest request);
}
