package net.wan.android.ui.viewmodel.state

import androidx.databinding.ObservableField
import net.wan.android.R
import net.wan.android.base.BaseViewModel

class TabUserViewModel :BaseViewModel() {
    val backgroundId = R.mipmap.bg_user_banner
    val userHeader = R.mipmap.user_header


    val userNickname = ObservableField("请登录")
    val userIntegral = ObservableField("0")
    val userArticle = ObservableField("0")
    val userCollect = ObservableField("0")
}