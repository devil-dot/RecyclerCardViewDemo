package com.kmtstudio.myrecyclercardviewdemo10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    private int[] img;
    private String[] title, desc;

    public MyAdapter(Context context, int[] img, String[] title, String[] desc) {
        this.context = context;
        this.img = img;
        this.title = title;
        this.desc = desc;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.sample_view,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(img[position]);

        holder.t1.setText(title[position]);
        holder.t2.setText(desc[position]);

    }

    @Override
    public int getItemCount() {
        return desc.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView t1, t2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imgViewID);

            t1 = itemView.findViewById(R.id.titleTxtID);
            t2 = itemView.findViewById(R.id.descTxtID);

        }
    }
}
