package com.jhivert.projecttemplate.navigation

import androidx.appcompat.app.AppCompatActivity
import com.jhivert.projecttemplate.R
import com.jhivert.projecttemplate.presentation.MainFragment

class MainNavigatorImpl(activity: AppCompatActivity):
    MainNavigator {

    private val rootContainer = R.id.rootContainer
    private val fragmentManager = activity.supportFragmentManager

    override fun moveToMainFragment() {
        val mainFragment = MainFragment.newInstance()
        fragmentManager
            .beginTransaction()
            .replace(rootContainer, mainFragment)
            .commit()
    }
}