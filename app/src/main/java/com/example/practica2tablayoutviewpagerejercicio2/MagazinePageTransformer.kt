package com.example.practica2tablayoutviewpagerejercicio2

import android.view.View
import androidx.viewpager2.widget.ViewPager2

class MagazinePageTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.cameraDistance = page.width * 10f

        if (position < -1) {
            page.alpha = 0f
        } else if (position <= 1) {
            page.alpha = 1f


            page.pivotX = if (position < 0) page.width.toFloat() else 0f
            page.pivotY = page.height * 0.5f


            page.rotationY = 45f * position


            val scaleFactor = 0.95f + (1 - Math.abs(position)) * 0.05f
            page.scaleX = scaleFactor
            page.scaleY = scaleFactor
        } else {
            page.alpha = 0f
        }
    }
}