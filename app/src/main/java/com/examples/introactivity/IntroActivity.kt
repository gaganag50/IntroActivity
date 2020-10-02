package com.examples.introactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


class IntroActivity : AppCompatActivity() {
    private var mViewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_layout)
        mViewPager = findViewById(R.id.viewpager)

        // Set an Adapter on the ViewPager
        mViewPager!!.adapter = IntroAdapter(supportFragmentManager)

        // Set a PageTransformer
        mViewPager!!.setPageTransformer(false, IntroPageTransformer())
    }
}