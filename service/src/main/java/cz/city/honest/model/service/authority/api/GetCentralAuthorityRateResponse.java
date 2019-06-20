package cz.city.honest.model.service.authority.api;

import cz.city.honest.model.dto.exchange.ExchangeRate;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetCentralAuthorityRateResponse {
    private ExchangeRate exchangeRate;
}
