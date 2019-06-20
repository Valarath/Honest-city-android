package cz.city.honest.model.service.permission;

import java.util.List;

public interface SystemGateway {

    List<String> getPermission();

    boolean isNetworkAvailable();

}
