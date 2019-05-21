package com.example.attitudewallpaper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.attitudewallpaper.Api_Response.CategoryResponse;
import com.squareup.picasso.Picasso;

import retrofit2.Response;

import static com.example.attitudewallpaper.APIManager.APIConfig.BASE_URL;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    Response<CategoryResponse> response;
    Context context;

    public CustomAdapter(Response<CategoryResponse> response, Context context) {
        this.response = response;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.category_id.setText(response.body().getImageList().get(position).getCategoryId());
        Picasso.with(context).load(BASE_URL + response.body().getImageList().get(position).getImage()).into(holder.image_lists);

    }

    @Override
    public int getItemCount() {
        return response.body().getImageList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView category_id;
        ImageView image_lists;
        public ViewHolder(View itemView) {
            super(itemView);
            category_id = (TextView)itemView.findViewById(R.id.category_id);
            image_lists = (ImageView)itemView.findViewById(R.id.image);
        }
    }
}
