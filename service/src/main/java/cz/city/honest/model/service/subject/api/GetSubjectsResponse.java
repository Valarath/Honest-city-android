package cz.city.honest.model.service.subject.api;

import java.util.List;
import java.util.Map;

import cz.city.honest.model.dto.subject.WatchedSubject;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetSubjectsResponse {
    private Map<Class<? extends WatchedSubject>, List<? extends WatchedSubject>> subjects;
}
