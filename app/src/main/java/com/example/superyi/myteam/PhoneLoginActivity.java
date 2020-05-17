package com.example.superyi.myteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.superyi.myteam.abilitybox.TeamMasterActivity;

public class PhoneLoginActivity extends AppCompatActivity {
    private TextView tv_id;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);
        tv_id = findViewById(R.id.ExchangeLogin2);
        tv_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneLoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneLoginActivity.this, TeamMasterActivity.class);
                startActivity(intent);
            }
        });
    }
}
