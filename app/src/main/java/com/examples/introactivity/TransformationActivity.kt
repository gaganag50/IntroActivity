package com.examples.introactivity

import android.graphics.Color
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_transformation.*

class TransformationActivity : AppCompatActivity() {

    var pagerAdapter2: MyPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.statusBarColor = (Color.LTGRAY)

        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_transformation)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()
        pagerAdapter2 = MyPagerAdapter(this)

        viewPager!!.adapter = pagerAdapter2

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

        }.attach()

        viewPager!!.setPageTransformer(
            ZoomOutTransformation()
        )
    }


}