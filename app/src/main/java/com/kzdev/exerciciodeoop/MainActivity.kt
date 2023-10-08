package com.kzdev.exerciciodeoop

import android.R
import android.content.Intent
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

        supportActionBar?.title = "Meus Contatos"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        initRecyclerView()

        addDataSource()

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

    private fun addDataSource() {
        val dataContato = DataContato.createDataSet()
        this.adapterContato.setDataSet(dataContato)
    }

    private fun initRecyclerView() {

        this.adapterContato = ContactAdapter {
            openPerfil()

        }

        binding.rvList.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.rvList.adapter = this.adapterContato
    }

    private fun openPerfil() {
        val intent = Intent(this@MainActivity, ContactPerfilActivity::class.java)
        startActivity(intent)
    }
}