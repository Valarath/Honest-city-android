package cz.honestcity.model.dto.exchange;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExchangeRateValues {
    protected double buy;
}
