package com.examples.introactivity

import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class IntroAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> IntroFragment.newInstance(Color.parseColor("#03A9F4"), position) // blue
            else -> IntroFragment.newInstance(Color.parseColor("#4CAF50"), position) // green
        }
    }

    override fun getCount(): Int {
        return 2
    }
}