package com.example.mvcproject1.model

import android.text.TextUtils

data class User(var email: String, var password: String) {
    fun invalidEmail() : Boolean{
        return !TextUtils.isEmpty(email)&&android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    fun isvalidPassword(): Boolean{
        return !TextUtils.isEmpty(password)&&password.length >= 6
    }
}