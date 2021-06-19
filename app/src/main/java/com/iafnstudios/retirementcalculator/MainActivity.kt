package com.iafnstudios.retirementcalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "5b9628e0-09c9-46a7-9f9b-3807e7f445ab",
            Analytics::class.java, Crashes::class.java
        )
    }
}