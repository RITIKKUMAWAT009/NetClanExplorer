package com.example.netclanexplorer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorer.R;
import com.example.netclanexplorer.model.PersonalItem;
import java.util.List;
public class PersonalAdapter extends RecyclerView.Adapter<PersonalAdapter.PersonalViewHolder > {
   private final List<PersonalItem> data;
   private final Context context;

    public PersonalAdapter(List<PersonalItem> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public PersonalAdapter.PersonalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_view_personal,parent,false);
        return new PersonalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonalAdapter.PersonalViewHolder holder, int position) {
        PersonalItem personalItem=data.get(position);
holder.tvUserName.setText(personalItem.getUserName());
holder.tvTag.setText(personalItem.getTag());
holder.tvUserLogo.setText(personalItem.getUserLogo());
holder.tvLocation.setText(personalItem.getLocation());
holder.tvDistance.setText(personalItem.getDistance());
holder.tvMsgToCommunity.setText(personalItem.getMsgToCommunity());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class PersonalViewHolder extends RecyclerView.ViewHolder {
        TextView tvUserName,tvLocation,tvUserLogo,tvMsgToCommunity,tvTag,tvDistance;
        public PersonalViewHolder(@NonNull View itemView) {
            super(itemView);
        tvUserName=itemView.findViewById(R.id.tvUserName);
        tvLocation=itemView.findViewById(R.id.tvLocation);
        tvDistance=itemView.findViewById(R.id.tvDistance);
        tvTag=itemView.findViewById(R.id.tvTag);
        tvUserLogo=itemView.findViewById(R.id.tvUserLogo);
        tvMsgToCommunity=itemView.findViewById(R.id.tvMsgToCommunity);
        }
    }
}
