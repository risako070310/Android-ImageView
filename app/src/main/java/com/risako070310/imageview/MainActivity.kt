package com.risako070310.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://pbs.twimg.com/media/E0Edd90VUAMlB8p?format=jpg&name=small"
        imageView.load(url)
    }
}