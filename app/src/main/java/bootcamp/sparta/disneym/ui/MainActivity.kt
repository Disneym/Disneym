package bootcamp.sparta.disneym.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bootcamp.sparta.disneym.R
import bootcamp.sparta.disneym.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        fun newIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }

    private fun initView() = with(binding) {
    }
}