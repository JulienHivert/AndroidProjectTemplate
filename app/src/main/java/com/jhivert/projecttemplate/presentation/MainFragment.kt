package com.jhivert.projecttemplate.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jhivert.projecttemplate.viewmodel.MainViewModel
import com.jhivert.projecttemplate.R
import org.koin.android.viewmodel.ext.android.sharedViewModel

class MainFragment: Fragment() {

    private val mainViewModel: MainViewModel by sharedViewModel()

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
