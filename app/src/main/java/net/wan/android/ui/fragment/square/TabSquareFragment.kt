package net.wan.android.ui.fragment.square

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentLoginBinding
import net.wan.android.databinding.FragmentTabSquareBinding
import net.wan.android.ui.viewmodel.state.TabSquareViewModel

//class TabSquareFragment : BaseFragment<FragmentTabSquareBinding, TabSquareViewModel>() {
class TabSquareFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentTabSquareBinding.inflate(inflater, container, false).root
    }
}