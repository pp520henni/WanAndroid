package net.wan.android.ui.fragment.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentOpenWebBinding
import net.wan.android.ui.viewmodel.state.OpenWebViewModel

class OpenWebFragment : BaseFragment<OpenWebViewModel, FragmentOpenWebBinding>() {
    override fun initView() {
        initToolbar(binding.actionBar as Toolbar)
    }

}