package com.aks.otrez_machine_test.retrofit;

import com.aks.otrez_machine_test.home.HomeModelGet;
import com.aks.otrez_machine_test.item_listing.ItemModelGet;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("api/GetItemGroups")
    Call<HomeModelGet> homeItemModelCall();

    @GET("")
    Call<ItemModelGet> itemModelGetCall();
}
