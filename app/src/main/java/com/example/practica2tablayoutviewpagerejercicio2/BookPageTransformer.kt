package com.example.practica2tablayoutviewpagerejercicio2

import android.view.View
import androidx.viewpager2.widget.ViewPager2

class BookPageTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.cameraDistance = page.width * 10f

        if (position < -1) {
            page.alpha = 0f
        } else if (position <= 1) {
            page.alpha = 1f

            page.pivotX = page.width * 0.5f
            page.pivotY = 0f

            page.rotationX = 60f * position

            val scaleFactor = 0.9f + (1 - Math.abs(position)) * 0.1f
            page.scaleX = scaleFactor
            page.scaleY = scaleFactor


            page.alpha = 1 - Math.abs(position) * 0.3f
        } else {
            page.alpha = 0f
        }
    }
}