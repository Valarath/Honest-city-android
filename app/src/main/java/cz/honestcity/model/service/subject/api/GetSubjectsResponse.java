package cz.honestcity.model.service.subject.api;

import cz.honestcity.model.dto.subject.WatchedSubject;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GetSubjectsResponse {
    private Map<Class<? extends WatchedSubject>, List<? extends WatchedSubject>> subjects;
}
