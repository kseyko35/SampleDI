package com.kseyko.imageprocessordependencyinjection

import android.net.Uri
import android.widget.ImageView
import androidx.constraintlayout.widget.Placeholder
import java.net.URI


/**     Code with ❤
╔════════════════════════════╗
║   Created by Seyfi ERCAN   ║
╠════════════════════════════╣
║  seyfiercan35@hotmail.com  ║
╠════════════════════════════╣
║      14,November,2021      ║
╚════════════════════════════╝
 */
interface IImageProcess {
    fun loadUrl(url: String, targetView: ImageView)

    fun loadUri(uri: Uri, targetView: ImageView)

    fun loadUrlWithPlaceHolder(url:String , targetView: ImageView, placeholderImage: Int)

    fun loadUrlWithError(url: String, targetView: ImageView, errorImage: Int)
}