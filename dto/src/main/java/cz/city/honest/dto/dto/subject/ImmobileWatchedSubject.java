package cz.city.honest.dto.dto.subject;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ImmobileWatchedSubject extends WatchedSubject {
    private Position position;
}
