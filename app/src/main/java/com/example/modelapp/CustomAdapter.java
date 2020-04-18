package com.example.modelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<Model_class> mlist;
    Context context;

    public CustomAdapter(List<Model_class> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        ImageView image1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text);
            image1 = itemView.findViewById(R.id.image);
        }
    }
    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.modelres,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
         holder.image1.setImageResource(mlist.get(position).getImage());
         holder.text1.setText(mlist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}



