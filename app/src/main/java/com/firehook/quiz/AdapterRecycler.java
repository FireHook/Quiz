package com.firehook.quiz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class AdapterRecycler  extends RecyclerView.Adapter<AdapterRecycler.MyViewHolder>{

    private List<Category> categoryList = null;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title;
        public ProgressBar progress;
        public TextView lastResult;
        public ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.cardTitle);
            progress = (ProgressBar) itemView.findViewById(R.id.progressBar);
            lastResult = (TextView) itemView.findViewById(R.id.cardResult);
            image = (ImageView) itemView.findViewById(R.id.cardImage);
        }
    }

    public AdapterRecycler(List<Category>categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public AdapterRecycler.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdapterRecycler.MyViewHolder holder, int position) {
        Category c = categoryList.get(position);
        holder.title.setText(c.getTitle());
        holder.progress.setProgress(c.getProgress());
        holder.lastResult.setText(c.getLastResult());
        Picasso.get().load(c.getImageUrl()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
