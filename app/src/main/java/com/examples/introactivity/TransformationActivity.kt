package com.examples.introactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_transformation.*

class TransformationActivity : AppCompatActivity() {

    var pagerAdapter2: MyPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformation)

        pagerAdapter2 = MyPagerAdapter(this)

        viewPager!!.adapter = pagerAdapter2

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

        }.attach()

        viewPager!!.setPageTransformer(
            ZoomOutTransformation()
        )
    }


}