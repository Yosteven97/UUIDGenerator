package com.example.uuidgenerator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    private var uuid: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * UUID represents a 128-bit value.
         * The methods of this class are for manipulating the Leach-Salz variant
         */

        //https://developer.android.com/reference/java/util/UUID
        uuid = UUID.randomUUID().toString()
        textViewUUID.text = uuid
    }
}
