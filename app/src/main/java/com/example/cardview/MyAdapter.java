package com.example.cardview;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private Context context;

    private ArrayList<Model> WaterfallModelArrayList;

    public MyAdapter(Context context, ArrayList<Model> waterfallModelArrayList) {
        this.context = context;
        WaterfallModelArrayList = waterfallModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = WaterfallModelArrayList.get(position);
        holder.modelText.setText(model.getWaterfall_title());
        holder.modelImage.setImageResource(model.getWaterfall_image());

    }

    @Override
    public int getItemCount() {
        return WaterfallModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView modelImage;
        private TextView modelText;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           modelImage = itemView.findViewById(R.id.image);
           modelText= itemView.findViewById(R.id.Text);
       }
   }
}
