package com.example.junorxtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        act_main_task_one_btn.setOnClickListener { startActivity(Intent(this,TaskOneActivity::class.java)) }
        act_main_task_two_btn.setOnClickListener { startActivity(Intent(this,TaskTwoActivity::class.java)) }

    }
}
