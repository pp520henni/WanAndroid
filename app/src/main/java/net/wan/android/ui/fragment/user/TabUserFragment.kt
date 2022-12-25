package net.wan.android.ui.fragment.user

import androidx.databinding.library.baseAdapters.BR
import net.wan.android.R
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentTabUserBinding
import net.wan.android.ext.checkLogin
import net.wan.android.ext.nav
import net.wan.android.ext.navigateAction
import net.wan.android.ui.viewmodel.state.TabUserViewModel
import net.wan.android.util.UIUtil

class TabUserFragment : BaseFragment<TabUserViewModel, FragmentTabUserBinding>() {

    inner class ProxyClick {
        fun clickHeader() {
            checkLogin()
        }
        fun login() {
            nav().navigateAction(R.id.action_userFragment_to_loginFragment)
        }

        fun setting(){
            nav().navigateAction(R.id.action_userFragment_to_settingFragment)
        }

        fun addTODO(){
        }

        fun onAbout(){
            activity?.let {
                UIUtil.joinQQGroup(it, UIUtil.TEST_GROUP)
            }
        }

        fun onOpen(){
            nav().navigateAction(R.id.action_userFragment_to_openWebFragment)
        }
    }

    override fun initView() {
        setVariable(BR.click, ProxyClick())
    }
}