package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


class Rvadapter extends RecyclerView.Adapter<Rvadapter.ViewHolder> {
    private ArrayList<Documents> getList = null;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv1;
        TextView tv2;
        ViewHolder (View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.textView1);
            tv2 = itemView.findViewById(R.id.textView2);
        }
    }

    public Rvadapter(ArrayList<Documents> list) {this.getList = list;}

    @Override
    public Rvadapter.ViewHolder onCreateViewHolder (ViewGroup parent,int viewType) {
        Context ct = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.items, parent, false);
        Rvadapter.ViewHolder vh = new Rvadapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(Rvadapter.ViewHolder holder, int position) {
        holder.tv1.setText(getList.get(position).getPlace_name());
        holder.tv2.setText(getList.get(position).getAddress_name());
    }

    @Override
    public int getItemCount() {return getList.size();}
}
