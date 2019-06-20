package cz.city.honest.model.service.authority;


import cz.city.honest.model.dto.exchange.ExchangeRate;
import cz.city.honest.model.service.AbstractService;
import cz.city.honest.model.service.authority.api.AuthorityRestApi;
import io.reactivex.Observable;

public class AuthorityDataManager extends AbstractService {

    private AuthorityRestApi restApi;

    public Observable<ExchangeRate> getCentralAuthorityRate(){
        if(isNetworkAvailable())
            return performCall();
        return null;
    }

    private Observable<ExchangeRate> performCall() {
        restApi = getBaseUrl().create(AuthorityRestApi.class);
        return restApi.getSubjects().flatMap(mapper -> Observable.fromArray(mapper.getExchangeRate()));
    }


}
