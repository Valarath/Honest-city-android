package cz.honestcity.model.service.authority.api;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface AuthorityRestApi {

    @GET("/subjects-in-area")
    Observable<GetCentralAuthorityRateResponse> getSubjects();
}
