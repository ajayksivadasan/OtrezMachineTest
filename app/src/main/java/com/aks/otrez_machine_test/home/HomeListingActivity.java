package com.aks.otrez_machine_test.home;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aks.otrez_machine_test.R;
import com.aks.otrez_machine_test.common.CommonToasts;
import com.aks.otrez_machine_test.retrofit.RetrofitApi;
import com.aks.otrez_machine_test.retrofit.RetrofitInterface;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeListingActivity extends AppCompatActivity {
    RecyclerView rvHomeItems;
    HomeRvAdapter rvAdapter;
    List<HomeItemModel> itemModels = new ArrayList<>();
    Context context;
    CommonToasts commonToasts;
    RetrofitApi api;
    RetrofitInterface retrofitInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_home_listing);
        initIds();
        commonToasts = new CommonToasts(context);
        retrofitInterface = RetrofitApi.getApiClient().create(RetrofitInterface.class);
        rvAdapter = new HomeRvAdapter(context, itemModels);
        rvHomeItems.setLayoutManager(new LinearLayoutManager(context));
        rvHomeItems.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        rvHomeItems.setAdapter(rvAdapter);
        Call<HomeModelGet> homeModelGetCall = retrofitInterface.homeItemModelCall();
        homeModelGetCall.enqueue(new Callback<HomeModelGet>() {
            @Override
            public void onResponse(@NotNull Call<HomeModelGet> call, @NotNull Response<HomeModelGet> response) {
                if (response.body() != null) {
                    if (response.body().getData() != null) {
                        commonToasts.setToastMessage(response.body().getMessage());
                        rvAdapter.updateAdapter(response.body().getData());
                    } else {
                        commonToasts.setToastMessage(CommonToasts.SOMETHING_ERROR_OCCURRED);
                    }
                } else {
                    commonToasts.setToastMessage(CommonToasts.SOMETHING_ERROR_OCCURRED);
                }
            }

            @Override
            public void onFailure(@NotNull Call<HomeModelGet> call, @NotNull Throwable t) {
                commonToasts.setToastMessage(CommonToasts.SOMETHING_ERROR_OCCURRED + t.getMessage());
            }
        });
    }

    private void initIds() {
        rvHomeItems = findViewById(R.id.rvHomeItems);
    }
}