package com.example.abdallahsarayrah.imageviewtutorialh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayImages = ArrayList<Int>()
        arrayImages.add(R.mipmap.ic_launcher_image1)
        arrayImages.add(R.mipmap.ic_launcher_image2)
        arrayImages.add(R.mipmap.ic_launcher_image3)

        button.setOnClickListener {
            imageView.setImageResource(arrayImages[2])
        }
    }
}
