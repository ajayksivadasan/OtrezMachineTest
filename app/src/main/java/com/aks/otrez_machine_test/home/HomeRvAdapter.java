package com.aks.otrez_machine_test.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aks.otrez_machine_test.R;

import java.util.ArrayList;
import java.util.List;

public class HomeRvAdapter extends RecyclerView.Adapter<HomeRvAdapter.ViewHolder> {
    List<HomeItemModel> itemModels = new ArrayList<>();
    Context context;

    HomeRvAdapter(Context context, List<HomeItemModel> itemModels) {
        this.context = context;
        this.itemModels = itemModels;
    }

    @NonNull
    @Override
    public HomeRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRvAdapter.ViewHolder holder, int position) {
        holder.tvItemName.setText(itemModels.get(position).getCGrpName());

    }

    @Override
    public int getItemCount() {
        return itemModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imItemHome;
        TextView tvItemName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imItemHome = itemView.findViewById(R.id.imItemHome);
            tvItemName = itemView.findViewById(R.id.tvItemName);
        }
    }
}
