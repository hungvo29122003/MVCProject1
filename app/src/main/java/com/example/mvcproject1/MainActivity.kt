package com.example.mvcproject1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility
import com.example.mvcproject1.controller.LoginController
import com.example.mvcproject1.databinding.ActivityMainBinding
import com.example.mvcproject1.model.User

class MainActivity : AppCompatActivity() {
    lateinit var tvMessage: TextView
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val edtEmail = binding.edtEmail
        val edtPassword = binding.edtPassword
        tvMessage = binding.tvMessage
        val btnLogin = binding.btnLogin
        val loginController = LoginController(this)
        btnLogin.setOnClickListener {
            val strEmail = edtEmail.text.toString().trim()
            val strPassword = edtPassword.text.toString().trim()

            val user = User(strEmail, strPassword)
            loginController.onClickLogin(user)

        }
    }
    fun showReult(message: String, isSuccess: Boolean){
        tvMessage.visibility = View.VISIBLE
        tvMessage.text = message
        tvMessage.setTextColor(
            if(isSuccess) Color.GREEN else Color.RED
        )
    }
}