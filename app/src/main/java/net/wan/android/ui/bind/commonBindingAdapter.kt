package net.wan.android.ui.bind

import android.webkit.WebView
import androidx.databinding.BindingAdapter

@BindingAdapter("webUrl")
fun webUrl(webView : WebView, url :String){
    if(url.isEmpty()){
        return
    }
    webView.loadUrl(url)
}