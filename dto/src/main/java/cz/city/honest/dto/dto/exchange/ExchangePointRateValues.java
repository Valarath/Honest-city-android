package cz.city.honest.dto.dto.exchange;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class ExchangePointRateValues extends ExchangeRateValues{
    private double sell;
}
