package net.wan.android.ui.viewmodel.state

import net.wan.android.base.BaseViewModel
import net.wan.android.library.observable.StringObservable

class OpenWebViewModel : BaseViewModel() {
    val openUrl = StringObservable("https://www.wanandroid.com")
}