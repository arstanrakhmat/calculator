package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var firstNumberEditText: EditText
    lateinit var secondNumberEditText: EditText

    lateinit var plusOperation: Button
    lateinit var minusOperation: Button
    lateinit var multiplyOperation: Button
    lateinit var divideOperation: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberEditText = findViewById(R.id.first_num_edit_text)
        secondNumberEditText = findViewById(R.id.second_num_edit_text)

        plusOperation = findViewById(R.id.add_button)
        minusOperation = findViewById(R.id.subtract_button)
        multiplyOperation = findViewById(R.id.multiply_button)
        divideOperation = findViewById(R.id.divide_button)

        plusOperation.setOnClickListener { addFun(it) }
        minusOperation.setOnClickListener { subtractFun(it) }
        multiplyOperation.setOnClickListener { multiplyFun(it) }
        divideOperation.setOnClickListener { divideFun(it) }
    }

    fun addFun(view : View) {

        if (firstNumberEditText.text.toString() == "" ||
            secondNumberEditText.text.toString() == "")
        {
            val text = "Please, enter the number"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        } else {

            val showResult = firstNumberEditText.text.toString().toDouble() +
                    secondNumberEditText.text.toString().toDouble()

            val intent = Intent(this, DisplayMessage::class.java)
            intent.putExtra("Result", showResult)

            startActivity(intent)
        }

        firstNumberEditText.clearFocus(); secondNumberEditText.clearFocus()
    }

    fun subtractFun(view: View) {

        if (firstNumberEditText.text.toString() == "" ||
            secondNumberEditText.text.toString() == "")
        {
            val text = "Please, enter the number"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        } else {
            val showResult = firstNumberEditText.text.toString().toDouble() -
                    secondNumberEditText.text.toString().toDouble()

            val intent = Intent(this, DisplayMessage::class.java)
            intent.putExtra("Result", showResult)

            startActivity(intent)
        }

        firstNumberEditText.clearFocus(); secondNumberEditText.clearFocus()
    }

    fun multiplyFun(view: View) {

        if (firstNumberEditText.text.toString() == "" ||
            secondNumberEditText.text.toString() == "")
        {
            val text = "Please, enter the number"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        } else {

            val showResult = firstNumberEditText.text.toString().toDouble() *
                    secondNumberEditText.text.toString().toDouble()

            val intent = Intent(this, DisplayMessage::class.java)
            intent.putExtra("Result", showResult)

            startActivity(intent)
        }

        firstNumberEditText.clearFocus(); secondNumberEditText.clearFocus()
    }

    fun divideFun(view: View) {

        if (firstNumberEditText.text.toString() == "" ||
            secondNumberEditText.text.toString() == "")
        {
            val text = "Please, enter the number"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        } else if (secondNumberEditText.text.toString().toDouble() == 0.0 ){
            val text = "Denominator can not be a zero, try again"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        } else {
            val showResult = firstNumberEditText.text.toString().toDouble() /
                    secondNumberEditText.text.toString().toDouble()

            val stringFormat = String.format("%.3f", showResult)

            val intent = Intent(this, DisplayMessage::class.java)
            intent.putExtra("Result", stringFormat.toDouble())

            startActivity(intent)
        }

        firstNumberEditText.clearFocus(); secondNumberEditText.clearFocus()
    }
}

