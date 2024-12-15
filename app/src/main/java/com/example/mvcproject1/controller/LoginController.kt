package com.example.mvcproject1.controller

import android.content.res.Resources
import android.graphics.Color
import com.example.mvcproject1.MainActivity
import com.example.mvcproject1.model.User

class LoginController(var view : MainActivity) {
    fun onClickLogin(user: User){
        if (user.invalidEmail()&&user.isvalidPassword()){
            view.showReult("Login Success", true)
        } else{
            view.showReult("Email or password is invalid", false)
        }
    }
}