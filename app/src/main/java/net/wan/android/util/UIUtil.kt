package net.wan.android.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import net.wan.android.frame.App.Companion.appContext


object UIUtil {
    const val TEST_GROUP = "s8Z1zw82z55Uh1zo7xCtSgvCuqsaDEia"
    const val ACTION_BAR_HEIGHT = 42

    fun getStatusBarHeight() : Int{
        val resourceId: Int = appContext.resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) {
            appContext.resources.getDimensionPixelSize(resourceId)
        } else 0
    }

    fun getActionBarHeight(){

    }

    /****************
     *
     * 发起添加群流程。群号：测试专用(770587245) 的 key 为： s8Z1zw82z55Uh1zo7xCtSgvCuqsaDEia
     * 调用 joinQQGroup(s8Z1zw82z55Uh1zo7xCtSgvCuqsaDEia) 即可发起手Q客户端申请加群 测试专用(770587245)
     *
     * @param key 由官网生成的key
     * @return 返回true表示呼起手Q成功，返回false表示呼起失败
     */
    fun joinQQGroup(context: Context, key: String): Boolean {
        val intent = Intent()
        intent.data =
            Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3D$key")
        // 此Flag可根据具体产品需要自定义，如设置，则在加群界面按返回，返回手Q主界面，不设置，按返回会返回到呼起产品界面    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        return try {
            context.startActivity(intent)
            true
        } catch (e: java.lang.Exception) {
            // 未安装手Q或安装的版本不支持
            ToastUtil.showToast("未安装手Q或安装的版本不支持")
            false
        }
    }

}