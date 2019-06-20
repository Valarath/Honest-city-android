package cz.city.honest.dto.dto.exchange;

import java.util.Set;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExchangeRate {
    protected long id;
    protected Watched watched;
    protected Set<? extends Rate> rates;
}
