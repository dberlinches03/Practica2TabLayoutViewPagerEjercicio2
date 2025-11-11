package com.example.practica2tablayoutviewpagerejercicio2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GalleryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val galleryItems = listOf(
            GalleryItem(R.drawable.image1, "Card 1"),
            GalleryItem(R.drawable.image2, "Card 2"),
            GalleryItem(R.drawable.image3, "Card 3"),
            GalleryItem(R.drawable.image4, "Card 4"),
            GalleryItem(R.drawable.image5, "Card 5"),
            GalleryItem(R.drawable.image6, "Card 6"),
            GalleryItem(R.drawable.image7, "Card 7"),
            GalleryItem(R.drawable.image8, "Card 8"),
            GalleryItem(R.drawable.image9, "Card 9")
        )

        val recyclerView: RecyclerView = view.findViewById(R.id.gallery_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = GalleryAdapter(galleryItems)

        return view
    }
}