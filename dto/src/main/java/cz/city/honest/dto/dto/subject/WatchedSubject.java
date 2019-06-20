package cz.city.honest.dto.dto.subject;


import java.time.LocalDate;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class WatchedSubject {
    private long id;
    private LocalDate watchedTo;
    private HonestyStatus honestyStatus;
}
