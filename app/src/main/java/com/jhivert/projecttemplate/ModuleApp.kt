package com.jhivert.projecttemplate

import androidx.appcompat.app.AppCompatActivity
import com.jhivert.projecttemplate.navigation.MainNavigatorImpl
import com.jhivert.projecttemplate.viewmodel.MainViewModel
import com.jhivert.projecttemplate.presentation.MainActivity
import com.jhivert.projecttemplate.repository.Repository
import com.jhivert.projecttemplate.repository.RepositoryImpl
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

var moduleApp = module {
    scope(named<MainActivity>()) {
        scoped { (activity: AppCompatActivity) ->
            MainNavigatorImpl(activity)
        }
    }
    viewModel { MainViewModel(get()) }
    single { RepositoryImpl(
        get(),
        get()
    ) as Repository
    }
}