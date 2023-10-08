package com.kzdev.exerciciodeoop.ListName

import com.kzdev.exerciciodeoop.model.Contato

class DataContato {

    companion object {

        fun createDataSet(): ArrayList<Contato> {

            val list = ArrayList<Contato>()

            list.add(
                Contato(
                    "Vinicius K. S. Watanabe",
                    "03/05/1998"
                )
            )
            list.add(
                Contato(
                    "Andressa Roque", "12/07/1994"
                )
            )
            list.add(
                Contato(
                    "Lucas Febatis", "18/03/1998"
                )
            )
            list.add(
                Contato(
                    "Victor Hugo Watanabe", "09/07/2003"
                )
            )
            list.add(
                Contato(
                    "Cintia Kikugava Watanabe", "18/12/1977"
                )
            )
            list.add(
                Contato(
                    "Mauricio Kazuya Watanabe", "19/02/1976"
                )
            )
            list.add(
                Contato(
                    "joaozinho", "10/10/1010"
                )
            )
            list.add(
                Contato(
                    "Marcão", "20/02/1970"
                )
            )
            list.add(
                Contato(
                    "jesus", "25/12/0000"
                )
            )
            list.add(
                Contato(
                    "Homem Aranha", "24/09/2002"
                )
            )


            return list

        }

    }
}