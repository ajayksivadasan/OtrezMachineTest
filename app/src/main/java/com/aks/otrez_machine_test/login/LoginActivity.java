package com.aks.otrez_machine_test.login;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.aks.otrez_machine_test.R;
import com.aks.otrez_machine_test.retrofit.RetrofitInterface;

public class LoginActivity extends AppCompatActivity {
    EditText etUsrName;
    EditText etPassword;
    Button btLogin;
    RetrofitInterface apiInterface;
    Context context;
    TextView tvNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}