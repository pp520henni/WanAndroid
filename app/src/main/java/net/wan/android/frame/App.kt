package net.wan.android.frame

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.tencent.mmkv.MMKV
import net.wan.android.ui.viewmodel.state.ApplicationViewModel

val applicationViewModel : ApplicationViewModel by lazy { App.applicationInstance }

class App : Application(), ViewModelStoreOwner {
    private lateinit var mAppViewModelStore: ViewModelStore
    companion object{
        lateinit var instance: App
        lateinit var applicationInstance: ApplicationViewModel
        lateinit var appContext : Context
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        appContext = applicationContext
        val rootDir: String = MMKV.initialize(this)
        println("mmkv root: $rootDir")
        mAppViewModelStore = ViewModelStore()
        applicationInstance = ViewModelProvider(this).get(ApplicationViewModel::class.java)
//        checkUser()
    }

    override fun getViewModelStore(): ViewModelStore {
        return mAppViewModelStore
    }
}

@GlideModule
class MyAppGlideModule : AppGlideModule()