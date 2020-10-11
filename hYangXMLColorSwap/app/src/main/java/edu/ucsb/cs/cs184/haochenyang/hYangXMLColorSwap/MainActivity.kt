package edu.ucsb.cs.cs184.haochenyang.hYangXMLColorSwap

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View){
        val red = Random.nextInt(256)
        val green = Random.nextInt(256)
        val blue = Random.nextInt(256)
        color_text.setTextColor(Color.argb(255, red, green, blue))
        color_text.text = "Color: " + red.toString() + "r " + green.toString() + "g " + blue.toString() + "b "
    }
}