package com.rakuten.rmc.sample.client

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rakuten.rmc.iam.InAppMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.run_iam_api).setOnClickListener {
            InAppMessaging().testMethodIam(this)
        }
    }
}