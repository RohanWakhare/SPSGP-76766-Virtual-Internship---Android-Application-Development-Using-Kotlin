package com.sahsisunny.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sahsisunny.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.EditIcon.setOnClickListener { editAuthorName(it) }
        binding.doneButton.setOnClickListener { setAuthorName(it) }
    }

    private fun editAuthorName(view: View) {
        binding.apply {
            enterName.visibility = View.VISIBLE
            doneButton.visibility = View.VISIBLE
            authorName.visibility = View.GONE
            EditIcon.visibility = View.GONE
            layoutName.visibility = View.GONE
        }
    }

    private fun setAuthorName(view: View) {
        binding.apply {
            // Set author name from entered text
            authorName.text = enterName.text
            layoutName.visibility = View.VISIBLE
            EditIcon.visibility = View.VISIBLE

            // Set visibility properties
            invalidateAll()
            enterName.visibility = View.GONE
            doneButton.visibility = View.GONE
            authorName.visibility = View.VISIBLE
        }

        // Hiding keyboard
        val hideKeyboard = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        hideKeyboard.hideSoftInputFromWindow(view.windowToken, 0)

    }
}