package com.sahsisunny.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    private lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val rollButton2: Button = findViewById(R.id.roll_button2)
        val combineButton: Button = findViewById(R.id.CombineButton)

        rollButton.setOnClickListener {
            rollDice()
        }
        rollButton2.setOnClickListener {
            rollDice2()
        }
        combineButton.setOnClickListener {
            combineDice()
        }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
    }

    private fun rollDice2() {
        val randomInt2 = (1..6).random()
        val diceImg = when (randomInt2) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six
        }
        diceImage2.setImageResource(diceImg)
        Toast.makeText(this, "Dice 2 Rolled, Number is $randomInt2 ", Toast.LENGTH_SHORT).show()

        val res2: TextView = findViewById(R.id.result2)
        res2.text = randomInt2.toString()

    }

    private fun rollDice() {
        val randomInt1 = (1..6).random()
        val diceImg = when (randomInt1) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six
        }
        diceImage.setImageResource(diceImg)
        Toast.makeText(this, "Dice 1 Rolled, Number is $randomInt1 ", Toast.LENGTH_SHORT).show()
        val res1: TextView = findViewById(R.id.result1)
        res1.text = randomInt1.toString()


    }

    private fun combineDice() {
        val randomInt1 = (1..6).random()
        val diceImg1 = when (randomInt1) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six
        }
        diceImage.setImageResource(diceImg1)
        val randomInt2 = (1..6).random()
        val diceImg = when (randomInt2) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six
        }
        diceImage2.setImageResource(diceImg)
        Toast.makeText(this, "Dice 1 - $randomInt1 and Dice 2 - $randomInt2", Toast.LENGTH_SHORT)
            .show()
        val res2: TextView = findViewById(R.id.result2)
        res2.text = randomInt2.toString()
        val res1: TextView = findViewById(R.id.result1)
        res1.text = randomInt1.toString()
    }
}