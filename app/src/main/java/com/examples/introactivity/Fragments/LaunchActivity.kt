package com.examples.introactivity.Fragments

import android.content.Context
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.examples.introactivity.R


class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TMessages)
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)

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
