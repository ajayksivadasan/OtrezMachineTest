package com.aks.otrez_machine_test.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.aks.otrez_machine_test.R;
import com.aks.otrez_machine_test.registration.RegistrationActivity;

public class LoginActivity extends AppCompatActivity {
    EditText etUsrName;
    EditText etPassword;
    Button btLogin;
    Context context;
    TextView tvNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initIds();
        setClickListeners();
    }

    private void setClickListeners() {
        tvNewUser.setOnClickListener(v -> startActivity(new Intent(context, RegistrationActivity.class)));
    }

    private void initIds() {
        etUsrName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        tvNewUser = findViewById(R.id.tvNewUser);
    }
}