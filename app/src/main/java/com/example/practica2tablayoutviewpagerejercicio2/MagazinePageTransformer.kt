package com.example.practica2tablayoutviewpagerejercicio2

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

class MagazinePageTransformer : ViewPager2.PageTransformer {

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
            page.alpha = 1f
            page.rotationX = 0f
            page.translationZ = 0f

            page.pivotX = if (position < 0) page.width.toFloat() else 0f
            page.pivotY = page.height * 0.5f

            page.rotationY = 45f * position

            val scaleFactor = 0.95f + (1 - abs(position)) * 0.05f
            page.scaleX = scaleFactor
            page.scaleY = scaleFactor
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