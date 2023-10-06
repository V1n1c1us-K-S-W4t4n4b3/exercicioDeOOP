package com.kzdev.exerciciodeoop.ListName

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class adaptDeList(private val context: Context) : RecyclerView.Adapter<adaptDeList.ListNameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListNameViewHolder {

        val itemLista = LayoutInflater.from(context).inflate()

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: ListNameViewHolder, position: Int) {

    }

    inner class ListNameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}


