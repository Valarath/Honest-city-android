package cz.honestcity.model.dto.exchange;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@Accessors(chain = true)
public class ExchangeRate {
    protected long id;
    protected Watched watched;
    protected Set<? extends Rate> rates;
}
