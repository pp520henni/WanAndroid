package net.wan.android.ext

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import net.wan.android.ui.fragment.discover.TabDiscoverFragment
import net.wan.android.ui.fragment.home.TabHomeFragment
import net.wan.android.ui.fragment.project.TabProjectFragment
import net.wan.android.ui.fragment.square.TabSquareFragment
import net.wan.android.ui.fragment.user.TabUserFragment

/**
 * 初始化ViewPager2
 */
fun ViewPager2.initViewPager(fragment: Fragment): ViewPager2 {
    isUserInputEnabled = false
    offscreenPageLimit = 5
    adapter = object : FragmentStateAdapter(fragment) {
        override fun createFragment(position: Int): Fragment {
            when (position) {
                0 -> {
                    return TabHomeFragment()
                }
                1 -> {
                    return TabProjectFragment()
                }
                2 -> {
                    return TabSquareFragment()
                }
                3 -> {
                    return TabDiscoverFragment()
                }
                4 -> {
                    return TabUserFragment()
                }
                else -> {
                    return TabHomeFragment()
                }
            }
        }

        override fun getItemCount() = 5
    }
    return this
}