package th.ac.su.discountcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ogPrice = findViewById<EditText>(R.id.ogPrice)
        var pcOff = findViewById<EditText>(R.id.pcOff)
        var checkBox = findViewById<CheckBox>(R.id.checkbox)
        var btnCal = findViewById<Button>(R.id.btnCal)
        var totalPrice = findViewById<EditText>(R.id.totalPrice)

        btnCal.setOnClickListener(){

            var inputPrice: Double = ogPrice.text.toString().toDouble()
            var inputPercent: Double = pcOff.text.toString().toDouble()

            var finalPrice = (inputPrice - (inputPrice * (inputPercent / 100)))

            if (checkBox.isChecked){
                finalPrice += ((finalPrice * 7) / 100)
            }
            totalPrice.setText(finalPrice.toString())

        }

    }

}
