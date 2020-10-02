package com.examples.introactivity.Fragments

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.examples.introactivity.R


class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.temp)
        val sharedPref = getSharedPreferences(
            getString(R.string.preference_file_key), Context.MODE_PRIVATE
        )
        sharedPref?.let {
            with(it.edit()) {


                putInt(getString(R.string.intro), 1)
                apply()
            }
        }

    }




}
