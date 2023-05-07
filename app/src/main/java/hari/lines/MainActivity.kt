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

        //create view model
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.line.observe(this) {
            findViewById<TextView>(R.id.textTv).text = it.title
        }
        //I want data (asking ViewModel)
        findViewById<TextView>(R.id.getDataBtn).setOnClickListener {
            viewModel.getLines()
        }
    }
}