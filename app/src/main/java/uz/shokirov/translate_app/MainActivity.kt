package uz.shokirov.translate_app

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.shokirov.translate_app.databinding.ActivityMainBinding
import uz.shokirov.translate_app.utils.LanguageManager


class MainActivity : AppCompatActivity() {
    lateinit var context: Context
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //startActivity(Intent(this,MainActivity2::class.java))
        val lang = LanguageManager(this)
        binding.btnHindi.setOnClickListener {
            lang.updateResource("uz")
            recreate()
        }
        binding.btnEnglish.setOnClickListener {
            lang.updateResource("en")
            recreate()
        }


    }
}