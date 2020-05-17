package com.example.superyi.myteam.abilitybox.showteams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.superyi.myteam.R;

public class InviteActivity extends AppCompatActivity {

    private Button mbt_checked;
    private Button mbt_cancel;

    private RecyclerView rc_inviteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite);

        rc_inviteList = findViewById(R.id.rc_invite);
        rc_inviteList.setLayoutManager(new LinearLayoutManager(InviteActivity.this));
        rc_inviteList.setAdapter(new Rc_IAdapter(InviteActivity.this));

        mbt_checked = findViewById(R.id.mbt_checked);
        mbt_checked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"已发送请求",Toast.LENGTH_SHORT).show();

            }
        });
        mbt_cancel = findViewById(R.id.mbt_cancel);
        mbt_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"已取消",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
