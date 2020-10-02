package com.examples.introactivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.examples.introactivity.Fragments.LaunchActivity

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState);


        val sharedPref = getSharedPreferences(
            getString(R.string.preference_file_key), Context.MODE_PRIVATE
        )
        if (sharedPref == null) {
            startActivity(Intent(this, LaunchActivity::class.java))
            finish()
        } else {
            val defaultValue = resources.getInteger(R.integer.introduction)
            val showIntroduction = sharedPref.getInt(getString(R.string.intro), defaultValue)

            if (showIntroduction == 1) {

                startActivity(Intent(this, LaunchActivity::class.java))
                finish()

            } else {
                startActivity(Intent(this, TransformationActivity::class.java))
                finish()

            }
        }

    }
}