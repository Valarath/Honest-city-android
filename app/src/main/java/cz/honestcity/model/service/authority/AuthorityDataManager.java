package cz.honestcity.model.service.authority;


import cz.honestcity.model.dto.exchange.ExchangeRate;
import cz.honestcity.model.service.AbstractService;
import cz.honestcity.model.service.authority.api.AuthorityRestApi;
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
