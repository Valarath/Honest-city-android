package cz.honestcity.model.dto.exchange;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class ExchangePointRateValues extends ExchangeRateValues{
    private double sell;
}
