package cz.city.honest.persmission;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.List;

import javax.inject.Inject;

import cz.city.honest.model.service.permission.SystemGateway;

public class AndroidSystemGateway implements SystemGateway {

    @Inject
    private Context context;

    @Override
    public List<String> getPermission() {
        return null;
    }

    @Override
    public boolean isNetworkAvailable() {
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }
}
