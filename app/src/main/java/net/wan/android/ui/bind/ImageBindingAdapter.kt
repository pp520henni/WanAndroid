package net.wan.android.ui.bind

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imageUrl")
fun imageUrl(view: ImageView, url: String) {
    if(url.isEmpty()){
        return
    }
    Glide.with(view.context.applicationContext)
        .load(url)
        .into(view)
}

@BindingAdapter("imageUrl")
fun imageUrl(view: ImageView, resId: Int) {
    if(resId <= 0){
        return
    }
    Glide.with(view.context.applicationContext)
        .load(resId)
        .into(view)
}

@BindingAdapter("userHeader")
fun userHeader(view : ImageView, resId: Int){
    val options = RequestOptions()
        .circleCrop()
    Glide.with(view.context.applicationContext)
        .load(resId)
        .apply(options)
        .into(view)
}