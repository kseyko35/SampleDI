package com.kseyko.imageprocessordependencyinjection

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewPicasso= findViewById<ImageView>(R.id.imageViewPicasso)
        val imageViewGlide =findViewById<ImageView>(R.id.imageViewGlide)
        val url= "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Google_2015_logo.svg/1200px-Google_2015_logo.svg.png"

//        Picasso.get()
//            .load(url)
//            .into(imageViewPicasso)
//
//        Glide
//            .with(this)
//            .load(url)
//            .into(imageViewGlide)

//        val imageHelper = ImageHelperGlide(this)
        val imageHelper= ImageHelperPicasso()

        imageHelper.loadUrl(url,imageViewGlide)
        imageHelper.loadUrl(url,imageViewPicasso)
    }
}