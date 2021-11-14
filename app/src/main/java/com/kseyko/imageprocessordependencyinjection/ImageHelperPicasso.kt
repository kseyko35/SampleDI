package com.kseyko.imageprocessordependencyinjection

import android.net.Uri
import android.widget.ImageView
import com.squareup.picasso.Picasso


/**     Code with ❤
╔════════════════════════════╗
║   Created by Seyfi ERCAN   ║
╠════════════════════════════╣
║  seyfiercan35@hotmail.com  ║
╠════════════════════════════╣
║      14,November,2021      ║
╚════════════════════════════╝
 */
class ImageHelperPicasso : IImageProcess {

    private val picassoInstance = Picasso.get()

    override fun loadUrl(url: String, targetView: ImageView) {
        picassoInstance.load(url).into(targetView)
    }

    override fun loadUri(uri: Uri, targetView: ImageView) {
        picassoInstance.load(uri).into(targetView)
    }

    override fun loadUrlWithPlaceHolder(url: String, targetView: ImageView, placeholderImage: Int) {
        picassoInstance.load(url).placeholder(R.mipmap.ic_launcher).into(targetView)
    }

    override fun loadUrlWithError(url: String, targetView: ImageView, errorImage: Int) {
        picassoInstance.load(url).error(R.mipmap.ic_launcher).into(targetView)
    }
}