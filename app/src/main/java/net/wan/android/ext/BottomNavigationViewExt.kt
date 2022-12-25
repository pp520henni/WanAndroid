package net.wan.android.ext

import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView

fun BottomNavigationView.init(navigationItemSelectedAction: (Int) -> Unit): BottomNavigationView {
    //itemIconTintList =  //设置应用于我们菜单项图标的色调。
    setOnItemSelectedListener {
        navigationItemSelectedAction.invoke(it.itemId)
        true
    }
    return this
}

/**
 * 取消长按显示文本
 */
fun BottomNavigationView.interceptLongClick(vararg ids: Int) {
    val bottomNavigationMenuView: ViewGroup = (this.getChildAt(0) as ViewGroup)
    for (index in ids.indices) {
        bottomNavigationMenuView.getChildAt(index).findViewById<View>(ids[index])
            .setOnLongClickListener {
                true
            }
    }
}