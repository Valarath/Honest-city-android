package cz.city.honest.model.service.subject.database;

import java.util.List;
import java.util.Map;

import cz.city.honest.dto.dto.subject.WatchedSubject;
import io.reactivex.Observable;

public class SubjectDatabaseGateway {

    public Observable<Map<Class<? extends WatchedSubject>, List<? extends WatchedSubject>>> getSubjects(){
        return null;
    }

    public void save(Map<Class<? extends WatchedSubject>, List<? extends WatchedSubject>> body) {

    }
}
