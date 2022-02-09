package uz.shokirov.translate_app.utils

import android.content.Context
import java.util.*

class LanguageManagerKotlin(private val ct: Context) {
    fun updateResource(code: String?) {
        val locale = Locale(code)
        Locale.setDefault(locale)
        val resources = ct.resources
        val configuration = resources.configuration
        configuration.locale = locale
        resources.updateConfiguration(configuration, resources.displayMetrics)
    }
}