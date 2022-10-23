package com.github.jing332.tts_server_android.utils

import android.content.Context

object SharedPrefsUtils {
    fun getWakeLock(ctx: Context): Boolean {
        val pref = ctx.getSharedPreferences("config", Context.MODE_PRIVATE)
        return pref.getBoolean("wakeLock", false)
    }

    fun setWakeLock(ctx: Context, isWakeLock: Boolean) {
        val editor = ctx.getSharedPreferences("config", Context.MODE_PRIVATE).edit()
        editor.putBoolean("wakeLock", isWakeLock)
        editor.apply()
    }

    fun setToken(ctx: Context, token: String) {
        val editor = ctx.getSharedPreferences("config", Context.MODE_PRIVATE).edit()
        editor.putString("token", token)
        editor.apply()
    }

    fun getToken(ctx: Context): String {
        val pref = ctx.getSharedPreferences("config", Context.MODE_PRIVATE)
        return pref.getString("token", "").toString()
    }

}