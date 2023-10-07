package com.kzdev.exerciciodeoop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kzdev.exerciciodeoop.ListName.AdaptDeContato
import com.kzdev.exerciciodeoop.databinding.ActivityMainBinding
import com.kzdev.exerciciodeoop.model.Contato

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rVList = binding.rVList
        rVList.layoutManager = LinearLayoutManager(this)
        rVList.setHasFixedSize(true)
        val listContatoes: MutableList<Contato> = mutableListOf()
        val adapterContatos = AdaptDeContato(this, listContatoes)
        rVList.adapter = adapterContatos

        val contato1 = Contato("Vincicius K. S. Watanabe", "03/05/1998")
        listContatoes.add(contato1)
        val contato2 = Contato("Andressa Roque", "12/07/1994")
        listContatoes.add(contato2)
        val contato3 = Contato("Lucas Febatis", "18/03/1998")
        listContatoes.add(contato3)
        val contato4 = Contato("Victor Hugo Watanabe", "09/07/2003")
        listContatoes.add(contato4)
        val contato5 = Contato("Cintia Kikugava Watanabe", "18/12/1977")
        listContatoes.add(contato5)
        val contato6 = Contato("Mauricio Kazuya Watanabe", "19/02/1976")
        listContatoes.add(contato6)
        val contato7 = Contato("joaozinho", "10/10/1010")
        listContatoes.add(contato7)
        val contato8 = Contato("Marcão", "20/02/1970")
        listContatoes.add(contato8)
        val contato9 = Contato("jesus", "25/12/0000")
        listContatoes.add(contato9)
        val contato10 = Contato("Homem Aranha", "24/09/2002")
        listContatoes.add(contato10)



    }
}