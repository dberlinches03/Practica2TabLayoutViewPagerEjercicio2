package com.example.practica2tablayoutviewpagerejercicio2

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

class BookPageTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.cameraDistance = page.width * 10f

        if (position < -1) {
            page.alpha = 0f
            page.pivotX = page.width * 0.5f
            page.pivotY = page.height * 0.5f
            page.rotationX = 0f
            page.rotationY = 0f
            page.scaleX = 1f
            page.scaleY = 1f
            page.translationZ = 0f
        } else if (position <= 1) {
            page.rotationY = 0f

            page.translationZ = -abs(position) * 10f

            page.pivotX = page.width * 0.5f
            page.pivotY = 0f
            page.rotationX = 60f * position

            val scaleFactor = 0.9f + (1 - abs(position)) * 0.1f
            page.scaleX = scaleFactor
            page.scaleY = scaleFactor

            page.alpha = 1 - abs(position) * 0.3f
        } else {
            page.alpha = 0f
            page.pivotX = page.width * 0.5f
            page.pivotY = page.height * 0.5f
            page.rotationX = 0f
            page.rotationY = 0f
            page.scaleX = 1f
            page.scaleY = 1f
            page.translationZ = 0f
        }
    }
}
