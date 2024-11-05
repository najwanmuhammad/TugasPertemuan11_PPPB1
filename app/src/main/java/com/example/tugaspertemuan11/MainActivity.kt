package com.example.tugaspertemuan11

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugaspertemuan11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        val imagers = listOf(
            Image(R.drawable.animals1),
            Image(R.drawable.animals2),
            Image(R.drawable.animals3),
            Image(R.drawable.animals4),
            Image(R.drawable.animals5),
            Image(R.drawable.animals6),
            Image(R.drawable.animals7),
            Image(R.drawable.animals8),
            Image(R.drawable.animals9),
        )

        binding.rvImage.layoutManager = GridLayoutManager(this, 3)
        binding.rvImage.adapter = ImageAdapter(imagers)

    }

}