package cz.city.honest.model.service;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Inject;

import cz.city.honest.model.service.permission.SystemService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public abstract class AbstractService {

    private static final String BASE_URL = "";
    @Inject
    private SystemService systemService;

    protected boolean isNetworkAvailable(){
        return systemService.isNetworkAvailable();
    }

    protected Retrofit getBaseUrl(){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }

}
