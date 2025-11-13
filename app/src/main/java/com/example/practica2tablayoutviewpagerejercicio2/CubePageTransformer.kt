package com.example.practica2tablayoutviewpagerejercicio2

import android.view.View
import androidx.viewpager2.widget.ViewPager2

class CubePageTransformer : ViewPager2.PageTransformer {
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
            page.scaleX = 1f
            page.scaleY = 1f
            page.translationZ = 0f

            if (position < 0) {
                page.pivotX = page.width.toFloat()
                page.pivotY = page.height * 0.5f
                page.rotationY = 90f * position
            } else {
                page.pivotX = 0f
                page.pivotY = page.height * 0.5f
                page.rotationY = 90f * position
            }
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
