package net.wan.android.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.wan.android.R
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentMainBinding
import net.wan.android.ext.init
import net.wan.android.ext.initViewPager
import net.wan.android.ext.interceptLongClick
import net.wan.android.ui.viewmodel.state.MainViewModel

//class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.fragmentContainer.initViewPager(this)
        binding.bottomNavigation.init {
            when (it) {
                R.id.homeFragment -> binding.fragmentContainer.setCurrentItem(0, false)
                R.id.projectFragment -> binding.fragmentContainer.setCurrentItem(1, false)
                R.id.squareFragment -> binding.fragmentContainer.setCurrentItem(2, false)
                R.id.findFragment -> binding.fragmentContainer.setCurrentItem(3, false)
                R.id.userFragment -> binding.fragmentContainer.setCurrentItem(4, false)
            }
        }
        binding.bottomNavigation.interceptLongClick(R.id.homeFragment,R.id.projectFragment,R.id.squareFragment,R.id.findFragment,R.id.userFragment)
    }
}