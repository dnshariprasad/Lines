package hari.lines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.data.observe(this) {
            findViewById<TextView>(R.id.textTv).text = it.title
        }
        //I want data (ask ViewModel)
        findViewById<TextView>(R.id.getDataBtn).setOnClickListener {
            viewModel.getData()
        }
    }
}