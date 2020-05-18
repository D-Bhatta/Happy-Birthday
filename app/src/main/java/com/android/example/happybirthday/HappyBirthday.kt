package com.android.example.happybirthday

import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation

class HappyBirthday : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy_birthday)
        val layout_view = findViewById<View>(R.id.happy_birthday_layout)
        val animDrawable = layout_view.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(2000)
        animDrawable.start()
    }
}
