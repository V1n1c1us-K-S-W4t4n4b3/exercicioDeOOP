package com.kzdev.exerciciodeoop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kzdev.exerciciodeoop.model.Contato


class ContactAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    // variavel privada que atribui o arrayList das informaçoes digitadas para utilizar junto ao modelo
    private var items: List<Contato> = ArrayList()

    //
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContatoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contact, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {

            is ContatoViewHolder -> {
                holder.bind(items[position])
            }
        }

    }


    // funçao de resgate dos valores adiquiridos e passados para o arreylist
    override fun getItemCount(): Int {
        return items.size

    }

    fun setDataSet(contato: List<Contato>) {
        this.items = contato
    }

    //implementação do ViewHolder
    class ContatoViewHolder constructor(
        itemView: View

        //tipo Que o adapter esta esperando
    ) : RecyclerView.ViewHolder(itemView) {

        // variaveis privadas q sao atribuidas os itens view do XML
        private val contatoName = itemView.findViewById<TextView>(R.id.tx_contato)
        private val contatoData = itemView.findViewById<TextView>(R.id.text_data_nasc)
        private val contatoText = itemView.findViewById<TextView>(R.id.tx_nasc)


        // função bind que atribui o formato das informaçoes de acordo com o modelo contato
        fun bind(contato: Contato) {
            contatoName.text = contato.name
            contatoData.text = contato.data
            contatoText.setText(R.string.text_nasc)
        }

    }
}