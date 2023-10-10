package com.kzdev.exerciciodeoop.ListName

import com.kzdev.exerciciodeoop.model.Contato

class DataContato {

    companion object {

        fun createDataSet(): ArrayList<Contato> {

            val list = ArrayList<Contato>()

            list.add(
                Contato(
                    "Vinicius K. S. Watanabe", "03/05/1998", "452.858.969-91", "(48) 3907-8654"
                )
            )
            list.add(
                Contato(
                    "Andressa Roque", "12/07/1994", "692.815.089-07", "(47) 2596-7408"
                )
            )
            list.add(
                Contato(
                    "Lucas Febatis", "18/03/1998", "054.884.339-29", "(47) 2784-2684"
                )
            )
            list.add(
                Contato(
                    "Victor Hugo Watanabe", "09/07/2003", "255.755.069-83", "(48) 2633-5568"
                )
            )
            list.add(
                Contato(
                    "Cintia Kikugava Watanabe", "18/12/1977", "611.971.589-44", "(48) 2892-2313"
                )
            )
            list.add(
                Contato(
                    "Mauricio Kazuya Watanabe", "19/02/1976", "132.190.729-09", "(47) 3747-2987"
                )
            )
            list.add(
                Contato(
                    "joaozinho", "10/10/1010", "680.850.389-35", "(47) 3860-4979"
                )
            )
            list.add(
                Contato(
                    "Marcão", "20/02/1970", "850.928.529-25", "(47) 2623-4127"
                )
            )
            list.add(
                Contato(
                    "jesus", "25/12/0001", "368.968.929-51", "(48) 3989-7832"
                )
            )
            list.add(
                Contato(
                    "Homem Aranha", "24/09/2002", "594.902.189-44", "(47) 3571-6183"
                )
            )
            return list
        }
    }
}