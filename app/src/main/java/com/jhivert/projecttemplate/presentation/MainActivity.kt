package com.jhivert.projecttemplate.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jhivert.projecttemplate.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        if (isMainFragmentDisplayed()) {
            finish()
            return
        }
    }

    private fun isMainFragmentDisplayed(): Boolean {
        val currentFragment = supportFragmentManager.findFragmentByTag(MainFragment::class.java.simpleName)
        if (currentFragment != null && currentFragment.isVisible) {
            return true
        }
        return false
    }
}