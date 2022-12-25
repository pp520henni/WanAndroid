package net.wan.android.ui.fragment.project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentLoginBinding
import net.wan.android.databinding.FragmentTabProjectBinding
import net.wan.android.ui.viewmodel.state.TabProjectViewModel

//class TabProjectFragment : BaseFragment<FragmentTabProjectBinding, TabProjectViewModel>() {
class TabProjectFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentTabProjectBinding.inflate(inflater, container, false).root
    }
}