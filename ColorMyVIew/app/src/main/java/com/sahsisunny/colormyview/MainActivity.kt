package com.sahsisunny.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(box1, box2, box3, box4, box5, cLayout, redbtn, greenbtn, bluebtn,clearbtn)
        for (item in clickableViews) {
            item.setOnClickListener { makeColor(it) }
        }
    }

    private fun makeColor(view: View) {
        when (view.id) {
            R.id.box1 -> view.setBackgroundColor(Color.BLUE)
            R.id.box2 -> view.setBackgroundColor(Color.RED)
            R.id.box3 -> view.setBackgroundColor(Color.GREEN)
            R.id.box4 -> view.setBackgroundColor(Color.YELLOW)
            R.id.box5 -> view.setBackgroundColor(Color.CYAN)
            R.id.redbtn -> {
                box1.setBackgroundColor(Color.RED)
                box2.setBackgroundColor(Color.RED)
                box3.setBackgroundColor(Color.RED)
                box4.setBackgroundColor(Color.RED)
                box5.setBackgroundColor(Color.RED)
            }
            R.id.greenbtn -> {
                box1.setBackgroundColor(Color.GREEN)
                box2.setBackgroundColor(Color.GREEN)
                box3.setBackgroundColor(Color.GREEN)
                box4.setBackgroundColor(Color.GREEN)
                box5.setBackgroundColor(Color.GREEN)
            }
            R.id.bluebtn -> {
                box1.setBackgroundColor(Color.BLUE)
                box2.setBackgroundColor(Color.BLUE)
                box3.setBackgroundColor(Color.BLUE)
                box4.setBackgroundColor(Color.BLUE)
                box5.setBackgroundColor(Color.BLUE)
            }
            R.id.clearbtn->{
                box1.setBackgroundColor(Color.WHITE)
                box2.setBackgroundColor(Color.WHITE)
                box3.setBackgroundColor(Color.WHITE)
                box4.setBackgroundColor(Color.WHITE)
                box5.setBackgroundColor(Color.WHITE)
                cLayout.setBackgroundColor(Color.TRANSPARENT)
            }
            else -> view.setBackgroundColor(Color.GRAY)
        }

    }
}