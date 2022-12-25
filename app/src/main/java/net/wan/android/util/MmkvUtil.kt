package net.wan.android.util

import android.os.Parcelable
import com.tencent.mmkv.MMKV
import net.wan.android.data.UserInfo


object MmkvUtil {
    const val USER_INFO = "userInfo"
    fun getUserInfo(): UserInfo? {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeParcelable(USER_INFO, UserInfo::class.java)
    }

    fun setUserInfo(user: UserInfo) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(USER_INFO, user)
    }

    fun setString(key: String, value: String) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setBoolean(key: String, value: Boolean) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setInt(key: String, value: Int) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setFloat(key: String, value: Float) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setLong(key: String, value: Long) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setDouble(key: String, value: Double) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setByteArray(key: String, value: ByteArray) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setSet(key: String, value: Set<String>) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun setParcelable(key: String, value: Parcelable) {
        val kv = MMKV.mmkvWithID("Wan")
        kv.encode(key, value)
    }

    fun getBoolean(key: String): Boolean {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeBool(key)
    }

    fun getString(key: String): String? {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeString(key)
    }

    fun getInt(key: String): Int {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeInt(key)
    }

    fun getFloat(key: String): Float {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeFloat(key)
    }

    fun getDouble(key: String): Double {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeDouble(key)
    }

    fun getLong(key: String): Long {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeLong(key)
    }

    fun getParcelable(key: String, clazz: Class<Parcelable>): Parcelable? {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeParcelable(key, clazz)
    }

    fun getByteArray(key: String): ByteArray? {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeBytes(key)
    }

    fun getSet(key: String): Set<String>? {
        val kv = MMKV.mmkvWithID("Wan")
        return kv.decodeStringSet(key)
    }


}