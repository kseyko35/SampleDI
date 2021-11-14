package com.kseyko.imageprocessordependencyinjection.dependencyInjectionSample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kseyko.imageprocessordependencyinjection.R


/**     Code with ❤
╔════════════════════════════╗
║   Created by Seyfi ERCAN   ║
╠════════════════════════════╣
║  seyfiercan35@hotmail.com  ║
╠════════════════════════════╣
║      14,November,2021      ║
╚════════════════════════════╝
 */
class Cafe ( private val personnel: Personnel) {

    fun getProduct(name:String): Product{
        return personnel.prepareProduct(name)
    }
}

class Barmen : Personnel {
    override fun prepareProduct(name: String): Product {
        return Product(name)
    }
//    fun prepareProduct(name: String): Product {
//        return Product(name)
//    }

}


class Cooker : Personnel {
    override fun prepareProduct(name: String): Product {
        return Product(name)
    }
//    fun prepareProduct(name: String): Product {
//        return Product(name)
//    }

}


class Product(name: String) {

}

interface Personnel {
    fun prepareProduct(name: String):Product
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cooker = Cooker()
        var cafe = Cafe(cooker)
        cafe.getProduct("Imam Bayildi")

        val barmen = Barmen()
        cafe = Cafe(barmen)
        cafe.getProduct("Mojito")

    }
}