package com.roga.santander_dev_week.local

import com.roga.santander_dev_week.data.Cartao
import com.roga.santander_dev_week.data.Cliente
import com.roga.santander_dev_week.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente( "Igor")
        val finalCartao = Cartao("8453")
        return Conta(
            "01000696-0",
            "3324",
            "2.450,80",
            "18.450,80",
            cliente,
            finalCartao
        );
    }
}