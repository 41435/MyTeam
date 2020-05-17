package com.example.superyi.myteam.abilitybox.showteams;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.superyi.myteam.R;

public class Rc_IAdapter extends RecyclerView.Adapter<Rc_IAdapter.InviteListHolder> {
    private Context mContext;
    public Rc_IAdapter(Context context){
        this.mContext=context;
    }
    @NonNull
    @Override
    public InviteListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new InviteListHolder(LayoutInflater.from(mContext).inflate(R.layout.invitelistitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InviteListHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 14;
    }

    class InviteListHolder extends RecyclerView.ViewHolder {

        private LinearLayout linearLayout;

        public InviteListHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.item_backgroud_invite);

        }

    }
}
