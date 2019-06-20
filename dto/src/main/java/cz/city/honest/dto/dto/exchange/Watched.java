package cz.city.honest.dto.dto.exchange;

import java.time.LocalDate;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Watched {
    private LocalDate from;
    private LocalDate to;
}
