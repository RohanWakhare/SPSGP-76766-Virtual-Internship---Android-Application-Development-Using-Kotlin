package com.sahsisunny.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        // Create new Dice object with 6b sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // update the screen with the dice roll
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResources = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Update the correct image view
        diceImage.setImageResource(drawableResources)

        // update the content descri[tion
        diceImage.contentDescription = diceRoll.toString()
    }
}

/**
 * CLass for roll the dice and return random number.
 */
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}