package net.wan.android.util

import android.os.Looper
import android.widget.Toast
import net.wan.android.frame.App
import net.wan.android.frame.App.Companion.appContext

object ToastUtil {

    var toast: Toast? = null

    /**
     * Toast的显示
     *
     * @param message Toast文本
     */
    fun showToast(message: String?) {
        try {
            if (toast != null) {
                toast!!.setText(message)
            } else {
                toast = Toast.makeText(appContext, message, Toast.LENGTH_SHORT)
            }
            toast!!.show()
        } catch (e: Exception) {
            //解决在子线程中调用Toast的异常情况处理
            Looper.prepare()
            Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show()
            Looper.loop()
        }
    }

    /**
     * Toast
     *
     * @param stringResId 要显示的内容资源ID
     */
    fun showToastResId(stringResId: Int) {
        showToast(appContext.resources.getString(stringResId))
    }
}