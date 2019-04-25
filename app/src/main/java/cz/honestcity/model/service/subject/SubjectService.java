package cz.honestcity.model.service.subject;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import cz.honestcity.model.dto.subject.Position;
import cz.honestcity.model.dto.subject.WatchedSubject;
import cz.honestcity.model.service.AbstractService;
import cz.honestcity.model.service.subject.api.GetSubjectsRequest;
import cz.honestcity.model.service.subject.api.SubjectRestApi;
import cz.honestcity.model.service.subject.database.SubjectDatabaseGateway;
import io.reactivex.Observable;

public class SubjectService extends AbstractService {

    private SubjectRestApi restApi;

    @Inject
    private SubjectDatabaseGateway subjectDatabaseGateway;

    public Observable<Map<Class<? extends WatchedSubject>, List<? extends WatchedSubject>>> getSubjects(Position userPosition){
        if(isNetworkAvailable())
            return performCall(userPosition);
        return subjectDatabaseGateway.getSubjects();
    }

    private Observable<Map<Class<? extends WatchedSubject>, List<? extends WatchedSubject>>> performCall(Position userPosition) {
        restApi = getBaseUrl().create(SubjectRestApi.class);
        return restApi.getSubjects(new GetSubjectsRequest().setUserPosition(userPosition))
                .flatMap(mapper -> Observable.fromArray(mapper.getSubjects()));
    }


}
