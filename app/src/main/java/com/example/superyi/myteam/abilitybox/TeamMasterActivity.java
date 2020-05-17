package com.example.superyi.myteam.abilitybox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.superyi.myteam.R;
import com.example.superyi.myteam.abilitybox.createteams.CreateTeamActivity;
import com.example.superyi.myteam.abilitybox.showteams.ShowTeamsActivity;

public class TeamMasterActivity extends AppCompatActivity {
    private Button mBtnBox_MyTeam;
    private Button mBtnBox_CreateTeam;
    private Button mBtnBox_publish;
    private Button mBtnBox_TeamMessage;
    private Button mBtnBox;
    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_master);

        mBtnBox_CreateTeam = findViewById(R.id.BtnBox_CreateTeam);
        mBtnBox_MyTeam = findViewById(R.id.BtnBox_MyTeam);
        mBtnBox_publish = findViewById(R.id.BtnBox_publish);
        mBtnBox_TeamMessage = findViewById(R.id.BtnBox_TeamMessage);

        mBtnBox_MyTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(TeamMasterActivity.this, ShowTeamsActivity.class);
                startActivity(intent);
            }
        });

        mBtnBox_CreateTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(TeamMasterActivity.this, CreateTeamActivity.class);
                startActivity(intent);
            }
        });
    }
}
