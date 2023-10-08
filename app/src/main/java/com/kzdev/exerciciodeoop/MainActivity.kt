package com.kzdev.exerciciodeoop

import android.R
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kzdev.exerciciodeoop.ListName.DataContato
import com.kzdev.exerciciodeoop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var adapterContato: ContactAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        initRecyclerView()

        addDataSource()

    }

    private fun addDataSource() {
        val dataContato = DataContato.createDataSet()
        this.adapterContato.setDataSet(dataContato)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initRecyclerView() {

        this.adapterContato = ContactAdapter()


        binding.rvList.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.rvList.adapter = this.adapterContato



    }


}