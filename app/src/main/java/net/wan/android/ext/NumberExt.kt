package net.wan.android.ext

import android.util.TypedValue
import net.wan.android.frame.App.Companion.appContext

fun Int.dip2px() : Int{
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), appContext.resources.displayMetrics).toInt()
}