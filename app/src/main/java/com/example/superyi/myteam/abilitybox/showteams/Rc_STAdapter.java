package com.example.superyi.myteam.abilitybox.showteams;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superyi.myteam.R;

public class Rc_STAdapter extends RecyclerView.Adapter <Rc_STAdapter.Rc_STViewHolder>{
    private Context mContext;
    public Rc_STAdapter(Context context){
        this.mContext = context;
    }
    @NonNull
    @Override
    public Rc_STAdapter.Rc_STViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new Rc_STViewHolder(LayoutInflater.from(mContext).inflate(R.layout.teamitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Rc_STAdapter.Rc_STViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class Rc_STViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout linearLayout;
        private Button button_is;
        private Button button_iv;

        public Rc_STViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.teamItem);
            button_is = itemView.findViewById(R.id.team_inside);
            button_is.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });


            button_iv = itemView.findViewById(R.id.team_invite);
            button_iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext,InviteActivity.class);
                   mContext.startActivity(intent);
                }
            });


        }
    }
}
