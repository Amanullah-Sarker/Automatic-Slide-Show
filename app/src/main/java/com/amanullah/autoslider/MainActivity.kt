package com.amanullah.autoslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amanullah.autoslider.databinding.ActivityMainBinding
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.robo_1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.robo_2, ScaleTypes.FIT))

        binding.imageSlider1.setImageList(imageList)

    }
}