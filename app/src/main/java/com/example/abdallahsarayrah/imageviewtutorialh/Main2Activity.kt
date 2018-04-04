package com.example.abdallahsarayrah.imageviewtutorialh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var arrayImages = ArrayList<Int>()
        arrayImages.add(R.mipmap.ic_launcher_image1)
        arrayImages.add(R.mipmap.ic_launcher_image2)
        arrayImages.add(R.mipmap.ic_launcher_image3)

        var indexImage = 1

        buttonChangeImage.setOnClickListener {
            if (indexImage == 3) indexImage = 0
            imageView2.setImageResource(arrayImages[indexImage])
            indexImage++
        }
    }
}
