package com.aks.otrez_machine_test.item_listing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aks.otrez_machine_test.R;
import com.aks.otrez_machine_test.common.CommonToasts;
import com.aks.otrez_machine_test.home.HomeListingActivity;

public class ItemListingActivity extends AppCompatActivity {
    Intent intent;
    int grpId = 0;
    String itemName;
    Context context;
    CommonToasts commonToasts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_listing);
        intent = getIntent();
        context = this;
        commonToasts = new CommonToasts(context);
        if (intent != null) {
            grpId = intent.getIntExtra("itemId", 0);
            itemName = intent.getStringExtra("itemName");
        }
        if (grpId != 0) {

        } else {
            commonToasts.setToastMessage(CommonToasts.SOMETHING_ERROR_OCCURRED);
            finish();
            finishAffinity();
            startActivity(new Intent(context, HomeListingActivity.class));
        }
    }
}