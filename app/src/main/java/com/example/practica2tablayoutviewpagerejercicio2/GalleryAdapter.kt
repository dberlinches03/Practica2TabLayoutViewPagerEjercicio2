package com.example.practica2tablayoutviewpagerejercicio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GalleryAdapter(private val galleryItems: List<GalleryItem>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val galleryImage: ImageView = view.findViewById(R.id.gallery_image)
        val galleryTitle: TextView = view.findViewById(R.id.gallery_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.gallery_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = galleryItems[position]
        holder.galleryImage.setImageResource(item.imageResource)
        holder.galleryTitle.text = item.title
    }

    override fun getItemCount() = galleryItems.size
}