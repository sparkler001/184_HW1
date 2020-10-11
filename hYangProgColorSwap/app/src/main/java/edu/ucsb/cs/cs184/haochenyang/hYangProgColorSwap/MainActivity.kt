package edu.ucsb.cs.cs184.haochenyang.hYangProgColorSwap

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import kotlin.random.Random

lateinit var tv : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myLayout = LinearLayout(this)
        myLayout.orientation = LinearLayout.VERTICAL
        myLayout.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
        myLayout.gravity = Gravity.CENTER_HORIZONTAL

        tv = TextView(this)
        tv.text = "Tap to Change Color"
        tv.textSize = 29.0f
        tv.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)

        val myButton = Button(this)
        myButton.text = "TAP ME!"
        myButton.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        myButton.setOnClickListener{ onClick(myButton) }

        myLayout.addView(tv)
        myLayout.addView(myButton)

        setContentView(myLayout)
    }

    private fun onClick(view: View){
        var red = Random.nextInt(256)
        var green = Random.nextInt(256)
        var blue = Random.nextInt(256)
        tv.setTextColor(Color.argb(255, red, green, blue))
        tv.text = "COLOR: ${red}r ${green}g ${blue}b"
    }
}