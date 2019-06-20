package cz.city.honest.model.service.user.api;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface UserRestApi {

    @GET("/user-suggestions")
    Observable<GetUserSuggestionsResponse> getUserSuggestions(GetUserSuggestionsRequest request);
}
