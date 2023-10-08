package com.kzdev.exerciciodeoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.kzdev.exerciciodeoop.databinding.ActivityPerfilContactBinding

class ContactPerfilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = binding.txContato.text
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

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
}


