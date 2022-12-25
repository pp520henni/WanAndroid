package net.wan.android.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentLoginBinding
import net.wan.android.databinding.FragmentTabHomeBinding
import net.wan.android.ui.viewmodel.state.TabHomeViewModel

class TabHomeFragment : Fragment() {
//class TabHomeFragment : BaseFragment<FragmentTabHomeBinding, TabHomeViewModel>() {
override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View {
    return FragmentTabHomeBinding.inflate(inflater, container, false).root
}
}