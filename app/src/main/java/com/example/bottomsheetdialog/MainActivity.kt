package com.example.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2: Button =findViewById(R.id.button2)
        button2.setOnClickListener(){
            var dialog:BottomSheetDialog= BottomSheetDialog(this)
            val layoutInflater:LayoutInflater=LayoutInflater.from(this)
            val view: View =layoutInflater.inflate(R.layout.bottom_nav_dialog,null)
            dialog.setContentView(view)
            val button:Button=view.findViewById(R.id.button)
            button.setOnClickListener(){
                dialog.dismiss()
            }
            dialog.show()
            dialog.setCancelable(false)
        }

    }
}