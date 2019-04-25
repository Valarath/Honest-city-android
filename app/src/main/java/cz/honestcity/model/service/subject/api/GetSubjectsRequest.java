package cz.honestcity.model.service.subject.api;

import cz.honestcity.model.dto.subject.Position;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetSubjectsRequest {
    private Position userPosition;
}
