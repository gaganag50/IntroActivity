package com.examples.introactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.examples.introactivity.Fragments.PlaceholderFragment


class MyPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment =
        PlaceholderFragment.newInstance(
            position
        )

}