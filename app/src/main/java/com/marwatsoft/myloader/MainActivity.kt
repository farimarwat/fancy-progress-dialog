package com.marwatsoft.myloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.marwatsoft.progressdialog.FancyProgressDialog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialog = FancyProgressDialog.Builder(this)
            .setLoader(FancyProgressDialog.LOADER_08)
            .setMessage("Loading...")
            .build()
        dialog.show()

    }
}