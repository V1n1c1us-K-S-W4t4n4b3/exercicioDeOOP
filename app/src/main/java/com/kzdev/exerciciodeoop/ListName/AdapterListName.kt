package com.kzdev.exerciciodeoop.ListName

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kzdev.exerciciodeoop.R
import com.kzdev.exerciciodeoop.model.Contato

class AdaptDeContato(private val context: Context, private val contatoList: MutableList<Contato>) :
    RecyclerView.Adapter<AdaptDeContato.ContatoViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdaptDeContato.ContatoViewHolder {
        val itemList = LayoutInflater.from(context).inflate(R.layout.contatos, parent, false)
        val holder = ContatoViewHolder(itemList)
        return holder

    }

    override fun onBindViewHolder(holder: AdaptDeContato.ContatoViewHolder, position: Int) {
        holder.nome.text = contatoList[position].name
        holder.data.text = contatoList[position].data
        holder.nasc.setText(R.string.text_nasc)

    }

    override fun getItemCount(): Int = contatoList.size

    inner class ContatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nome = itemView.findViewById<TextView>(R.id.tx_contato)
        val data = itemView.findViewById<TextView>(R.id.text_data_nasc)
        val nasc = itemView.findViewById<TextView>(R.id.tx_nasc)

    }
}