package com.example.superyi.myteam.abilitybox.showteams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.superyi.myteam.R;

public class ShowTeamsActivity extends AppCompatActivity {
    private RecyclerView mRc_Teams;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_teams);
        mRc_Teams = findViewById(R.id.rc_teams);
        mRc_Teams.setLayoutManager(new LinearLayoutManager(ShowTeamsActivity.this));
        mRc_Teams.setAdapter(new Rc_STAdapter(ShowTeamsActivity.this));


    }
}
