package cz.city.honest.model.service.permission;

import java.util.List;

import javax.inject.Inject;

public class SystemService {

    @Inject
    private SystemGateway gateway;

    public List<String> getPermission(){
        return gateway.getPermission();
    }

    public boolean isNetworkAvailable(){
        return gateway.isNetworkAvailable();
    }

}
