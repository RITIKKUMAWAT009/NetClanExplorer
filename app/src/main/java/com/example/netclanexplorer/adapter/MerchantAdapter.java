package com.example.netclanexplorer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorer.Constants;
import com.example.netclanexplorer.R;
import com.example.netclanexplorer.model.PersonalItem;

import java.util.List;

public class MerchantAdapter extends RecyclerView.Adapter<MerchantAdapter.ViewHolder> {
  private   List<PersonalItem> data;
   private Context context;
          public   MerchantAdapter(Context context,List<PersonalItem>data){
        this.data=data;
        this.context=context;
            }
    @NonNull
    @Override
    public MerchantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycle_view_merchant,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MerchantAdapter.ViewHolder holder, int position) {
        PersonalItem personalItem = data.get(position);
        String charOfFirstAndSurname = Constants.getCharOfFirstAndSurname(personalItem.getUserName());
        holder.tvUserName.setText(personalItem.getUserName());
        holder.tvUserLogo.setText(charOfFirstAndSurname);
        holder.tvLocation.setText(personalItem.getLocation());
        holder.tvDistance.setText(personalItem.getDistance());
        holder.tvMsgToCommunity.setText(personalItem.getMsgToCommunity());
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvUserName, tvLocation, tvUserLogo, tvMsgToCommunity, tvTag, tvDistance;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUserName = itemView.findViewById(R.id.tvUserName);
            tvLocation = itemView.findViewById(R.id.tvLocation);
            tvDistance = itemView.findViewById(R.id.tvDistance);
            tvTag = itemView.findViewById(R.id.tvTag);
            tvUserLogo = itemView.findViewById(R.id.tvUserLogo);
            tvMsgToCommunity = itemView.findViewById(R.id.tvMsgToCommunity);
        }
    }
}
