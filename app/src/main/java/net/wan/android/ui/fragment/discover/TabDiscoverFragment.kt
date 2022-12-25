package net.wan.android.ui.fragment.discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentLoginBinding
import net.wan.android.databinding.FragmentTabDiscoverBinding
import net.wan.android.ui.viewmodel.state.TabDiscoverViewModel

//class TabDiscoverFragment : BaseFragment<FragmentTabDiscoverBinding, TabDiscoverViewModel>() {
class TabDiscoverFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentTabDiscoverBinding.inflate(inflater, container, false).root
    }
}