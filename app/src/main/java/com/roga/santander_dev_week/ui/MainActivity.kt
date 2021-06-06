package com.roga.santander_dev_week.ui

import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.roga.santander_dev_weekweek.R

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.buscarContaCliente().observe(this, { result ->
            findViewById<TextView>(R.id.tv_numero_conta_corrente).text = result.numero
            findViewById<TextView>(R.id.tv_numero_agencia).text = result.agencia
            findViewById<TextView>(R.id.tv_valor_saldo).text = result.saldo
            findViewById<TextView>(R.id.tv_valor_saldo_limite).text = result.limite
            findViewById<TextView>(R.id.tv_cliente).text = result.cliente.nome
            findViewById<TextView>(R.id.tv_numero_cartao).text = result.cartao.numeroCartao
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater //infla o toolbar para ser usado assim que abre a ctivity.
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }
}