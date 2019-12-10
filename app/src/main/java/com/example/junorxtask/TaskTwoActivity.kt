package com.example.junorxtask

import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Pattern

class TaskTwoActivity : AppCompatActivity() {

    /**
     *Реализовать следующее поведение:
     * Кнопка act_task_two_login_btn становиться активной только если:
     * текст из act_task_two_email_et проходит проверку isEmailValid
     * и текст из act_task_two_password_et проходит проверку isPasswordValid
     *
     * Дополнительно: показывать ошибку в случае если поле не проходит проверку
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_task_two)
    }

    private fun isEmailValid(email: CharSequence): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches()

    private fun isPasswordValid(password: CharSequence): Boolean =
        Pattern.compile("\\w{4,}").matcher(password).matches()
}