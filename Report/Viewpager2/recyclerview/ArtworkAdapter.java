package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArtworkAdapter extends RecyclerView.Adapter<ArtworkAdapter.ViewHolder> {
    private List<Artwork> artworkList;

    public ArtworkAdapter(List<Artwork> artworkList) {
        this.artworkList = artworkList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView artworkImage;
        TextView artworkTitle;

        public ViewHolder(View view) {
            super(view);
            artworkImage = view.findViewById(R.id.artworkImage);
            artworkTitle = view.findViewById(R.id.artworkTitle);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_artwork, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Artwork artwork = artworkList.get(position);
        holder.artworkImage.setImageResource(artwork.getImageResId());
        holder.artworkTitle.setText(artwork.getTitle());
    }

    @Override
    public int getItemCount() {
        return artworkList.size();
    }
}
