package cz.city.honest.model.service.subject.api;

import cz.city.honest.dto.dto.subject.Position;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetSubjectsRequest {
    private Position userPosition;
}
