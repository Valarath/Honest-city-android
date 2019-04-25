package cz.honestcity.model.service.authority.api;

import cz.honestcity.model.dto.exchange.ExchangeRate;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetCentralAuthorityRateResponse {
    private ExchangeRate exchangeRate;
}
