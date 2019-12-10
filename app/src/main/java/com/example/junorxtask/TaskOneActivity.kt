package com.example.junorxtask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TaskOneActivity : AppCompatActivity() {


    /**
     * Реализуйте следующее поведение:
     * При вводе любых слов в act_main_query_et, если 2 секунды не было изменений, показывается прогресс.
     * после прогресса через 3 секунды в act_main_answers_tv в столбик выводятся все слова из act_main_query_et разделенные пробелом и прогресс скрывается
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_task_one)
    }
}