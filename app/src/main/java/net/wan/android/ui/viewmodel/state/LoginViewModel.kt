package net.wan.android.ui.viewmodel.state

import androidx.databinding.ObservableField
import net.wan.android.base.BaseViewModel
import net.wan.android.library.observable.StringObservable

class LoginViewModel : BaseViewModel(){
    val account = StringObservable()
    val password = StringObservable()
}