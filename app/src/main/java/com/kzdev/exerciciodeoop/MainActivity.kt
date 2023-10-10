package com.kzdev.exerciciodeoop

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kzdev.exerciciodeoop.ListName.DataContato
import com.kzdev.exerciciodeoop.databinding.ActivityMainBinding
import com.kzdev.exerciciodeoop.model.Contato

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapterContato: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Meus Contatos"

        initRecyclerView()

        addDataSource()

    }
    
    private fun addDataSource() {
        val dataContato = DataContato.createDataSet()
        this.adapterContato.setDataSet(dataContato)

    }

    private fun initRecyclerView() {

        // it é uma variavel do tipo contato
        // it foi denominado pelo kotlin
        // it é o contaro que o usuario clicar
        this.adapterContato = ContactAdapter {

            openPerfil(it)

        }

        binding.rvList.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.rvList.adapter = this.adapterContato
    }

    private fun openPerfil(contato: Contato) {

        val intent = Intent(this@MainActivity, ContactPerfilActivity::class.java)
        intent.putExtra("name", contato.name)
        intent.putExtra("data", contato.data)
        intent.putExtra("cpf", contato.cpf)
        intent.putExtra("tell", contato.tell)

        startActivity(intent)
    }
}