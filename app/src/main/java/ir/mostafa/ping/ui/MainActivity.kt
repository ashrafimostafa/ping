package ir.mostafa.ping.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.mostafa.ping.databinding.ActivityMainBinding
import ir.mostafa.ping.utility.clickWithDebounce

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            mainAnimation.apply {

            }

            mainAnimation.clickWithDebounce {
                mainAnimation.playAnimation()
            }

        }

    }
}