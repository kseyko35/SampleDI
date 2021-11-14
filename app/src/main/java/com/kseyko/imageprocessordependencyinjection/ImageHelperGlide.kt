package com.kseyko.imageprocessordependencyinjection

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide


/**     Code with ❤
╔════════════════════════════╗
║   Created by Seyfi ERCAN   ║
╠════════════════════════════╣
║  seyfiercan35@hotmail.com  ║
╠════════════════════════════╣
║      14,November,2021      ║
╚════════════════════════════╝
 */
class ImageHelperGlide(context: Context) : IImageProcess {

    private val glideInstance = Glide.with(context)

    override fun loadUrl(url: String, targetView: ImageView) {
        glideInstance.load(url).into(targetView)

    }

    override fun loadUri(uri: Uri, targetView: ImageView) {
        glideInstance.load(uri).into(targetView)
    }

    override fun loadUrlWithPlaceHolder(url: String, targetView: ImageView, placeholderImage: Int) {
        glideInstance.load(url).placeholder(R.mipmap.ic_launcher).into(targetView)
    }

    override fun loadUrlWithError(url: String, targetView: ImageView, errorImage: Int) {
        glideInstance.load(url).error(R.mipmap.ic_launcher).into(targetView)
    }
}