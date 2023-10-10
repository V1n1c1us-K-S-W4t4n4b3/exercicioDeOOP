package com.kzdev.exerciciodeoop

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.kzdev.exerciciodeoop.databinding.ActivityPerfilContactBinding
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

class ContactPerfilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilContactBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = binding.txContato.text
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.callButton.setOnClickListener { call() }


        receptor()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun receptor() {


        val name = intent.getStringExtra("name")
        val data = intent.getStringExtra("data")
        val cpf = intent.getStringExtra("cpf")
        val tell = intent.getStringExtra("tell")

        binding.txContato.text = name
        binding.textDataNasc.text = data
        binding.txNumbCpf.text = cpf
        binding.txNumbTell.text = tell
        binding.textAge.text = data?.let { getString(R.string.age_placeholder, age(it)) }

    }

    fun age(nasc: String): String {

        val dFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val formatNasc = LocalDate.parse(nasc, dFormat)

        val now = LocalDate.now()

        val ageNow = ChronoUnit.YEARS.between(formatNasc, now)

        return ageNow.toString()

    }

    fun call(){
        val uriTel = Uri.parse("tel:"+ binding.txNumbTell.text.toString())

        val intent = Intent(Intent.ACTION_DIAL, uriTel)

        startActivity(intent)

    }

}