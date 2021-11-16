package br.com.levisaturnino.iti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PaymentDoneActivity : AppCompatActivity(R.layout.activity_payment_done) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val amountTextView = findViewById<TextView>(R.id.payment_done_divide_amount_text)

        amountTextView.text =
            getString(R.string.payment_done_amount,"R$ 1,00","Matheus Vidal Branding")


















    }

}