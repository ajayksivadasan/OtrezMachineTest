package com.aks.otrez_machine_test.retrofit;

import com.aks.otrez_machine_test.home.HomeModelGet;

import retrofit2.Call;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("api/GetItemGroups")
    Call<HomeModelGet> homeItemModelCall();
}
