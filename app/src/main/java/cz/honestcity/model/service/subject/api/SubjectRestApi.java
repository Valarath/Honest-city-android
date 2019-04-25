package cz.honestcity.model.service.subject.api;



import io.reactivex.Observable;
import retrofit2.http.GET;

public interface SubjectRestApi {

    @GET("/subjects-in-area")
    Observable<GetSubjectsResponse> getSubjects(GetSubjectsRequest request);
}
