package com.livedataviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.livedataviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: TestViewModel
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        //home +1
        binding.textviewHomescore.text = viewModel.getCurrentCount().toString()
        binding.homeincreament.setOnClickListener{
            binding.textviewHomescore.text =viewModel.getUpdateCount().toString()
        }
        //home -1
        binding.textviewHomescore.text = viewModel.getCurrentCount().toString()
        binding.homedecreament.setOnClickListener{
            binding.textviewHomescore.text =viewModel.getReducedCount().toString()
        }
        //away +1
        binding.textviewAwayscore.text = viewModel.getCurrentAwayCount().toString()
        binding.awayincreament.setOnClickListener{
            binding.textviewAwayscore.text =viewModel.getUpdateAwayCount().toString()
        }
        //away -1
        binding.textviewAwayscore.text = viewModel.getCurrentAwayCount().toString()
        binding.awaydecreament.setOnClickListener{
            binding.textviewAwayscore.text =viewModel.getReducedAwayCount().toString()
        }
        //reset away score
        //reset home score and  away score
        binding.textviewHomescore.text = viewModel.getCurrentCount().toString()
        binding.textviewAwayscore.text = viewModel.getCurrentCount().toString()
        binding.clearscore.setOnClickListener{
            binding.textviewHomescore.text =viewModel.resetScore().toString()
            binding.textviewAwayscore.text =viewModel.resetScore().toString()
        }



    }
}