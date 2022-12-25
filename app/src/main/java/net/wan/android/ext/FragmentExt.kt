package net.wan.android.ext

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import net.wan.android.R
import net.wan.android.util.MmkvUtil

/**
 * 作者　: hegaojian
 * 时间　: 2020/5/2
 * 描述　:
 */
fun Fragment.nav(): NavController {
    return NavHostFragment.findNavController(this)
}

fun nav(view: View): NavController {
    return Navigation.findNavController(view)
}

var lastNavTime = 0L

/**
 * 防止短时间内多次快速跳转Fragment出现的bug
 * @param resId 跳转的action Id
 * @param bundle 传递的参数
 * @param interval 多少毫秒内不可重复点击 默认0.5秒
 */
fun NavController.navigateAction(resId: Int, bundle: Bundle? = null, interval: Long = 500) {
    val currentTime = System.currentTimeMillis()
    if (currentTime >= lastNavTime + interval) {
        lastNavTime = currentTime
        try {
            navigate(resId, bundle)
        } catch (ignore: Exception) {
            //防止出现 当 fragment 中 action 的 duration设置为 0 时，连续点击两个不同的跳转会导致如下崩溃 #issue53
        }
    }
}

fun Fragment.checkLogin() {
    if (MmkvUtil.getUserInfo() != null) {
        showToast("已登录")
    } else {
        nav().navigateAction(R.id.action_userFragment_to_loginFragment)
    }
}

fun Fragment.showMessage(title: String = "温馨提示", message: String = "") {
    activity?.let {
        val dialog = AlertDialog.Builder(it)
        dialog.setMessage(message)
        dialog.setTitle(title)
        dialog.show()
    }
}

fun Fragment.showToast(msg: String) {
    activity?.let {
        Toast.makeText(it, msg, Toast.LENGTH_SHORT).show()
    }
}

fun Fragment.showToast(mgsId: Int) {
    activity?.let {
        Toast.makeText(it, mgsId, Toast.LENGTH_SHORT).show()
    }
}
