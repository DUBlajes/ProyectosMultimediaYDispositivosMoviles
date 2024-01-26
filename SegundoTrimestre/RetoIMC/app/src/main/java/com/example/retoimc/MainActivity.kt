package com.example.retoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private var hombreSeleccionado:Boolean=true
    private var mujerSeleccionado:Boolean=false
    private var pesoActual:Int=50
    private var edadActual:Int=18
    private var alturaActual:Int=120



    private lateinit var cardViewHombre:CardView
    private lateinit var cardViewMujer:CardView
    private lateinit var tvAltura:TextView
    private lateinit var rsAltura:RangeSlider
    private lateinit var btnMenosPeso:FloatingActionButton
    private lateinit var btnMasPeso:FloatingActionButton
    private lateinit var tvPesoNumero:TextView
    private lateinit var btnMenosEdad:FloatingActionButton
    private lateinit var btnMasEdad:FloatingActionButton
    private lateinit var tvEdadNumero:TextView
    private lateinit var btnCalcular:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponent()
        initListeners()
        initUI()
    }



    private fun initComponent(){
        cardViewHombre=findViewById(R.id.cardView1)
        cardViewMujer=findViewById(R.id.cardView2)
        tvAltura=findViewById<TextView>(R.id.tvAltura)
        rsAltura=findViewById(R.id.rsAltura)
        btnMenosPeso=findViewById(R.id.btnMenor)
        btnMasPeso=findViewById(R.id.btnMayor)
        tvPesoNumero=findViewById(R.id.tvPesoNumero)
        btnMenosEdad=findViewById(R.id.btnIzquierda)
        btnMasEdad=findViewById(R.id.btnDerecha)
        tvEdadNumero=findViewById(R.id.tvEdadNumero)
        btnCalcular=findViewById(R.id.botonCalcular)

    }

    private fun initListeners(){
        cardViewHombre.setOnClickListener {
            cambiarGenero()
            setGenderColor()
        }
        cardViewMujer.setOnClickListener {
            cambiarGenero()
            setGenderColor()}

        rsAltura.addOnChangeListener { _, value, _ ->

            val formatearDecimal=DecimalFormat("#.##")
            alturaActual=formatearDecimal.format(value).toInt()
            tvAltura.text="$alturaActual cms"
        }
        btnMenosPeso.setOnClickListener {
            pesoActual-=1
            establecerPeso()
        }
        btnMasPeso.setOnClickListener {
            pesoActual+=1
            establecerPeso()
        }

        btnMenosEdad.setOnClickListener {
            edadActual-=1
            establecerEdad()
        }
        btnMasEdad.setOnClickListener {
            edadActual+=1
            establecerEdad()
        }

        btnCalcular.setOnClickListener {
            val resultado= calcularIMC()
            irAResultado(resultado)
        }

    }

    private fun irAResultado(resultado:Double){
        
    }

    private fun calcularIMC():Double{
        val df=DecimalFormat("#.##")
        val imc=pesoActual/(alturaActual.toDouble()/100*alturaActual.toDouble()/100)
        return df.format(imc).toDouble()


    }
    private fun establecerPeso(){
        tvPesoNumero.text="$pesoActual kgs"
    }

    private fun establecerEdad(){
        tvEdadNumero.text="$edadActual años"
    }


    private fun cambiarGenero(){
        hombreSeleccionado=!hombreSeleccionado
        mujerSeleccionado=!mujerSeleccionado
    }

    private fun setGenderColor(){

        cardViewHombre.setCardBackgroundColor(getBackgroundColor(hombreSeleccionado))
        cardViewMujer.setCardBackgroundColor(getBackgroundColor(mujerSeleccionado))
    }

    private fun getBackgroundColor(isSelectedComponent:Boolean):Int{

        val colorReference=if(isSelectedComponent){
            R.color.green
        }else{
            R.color.grey
        }
        return ContextCompat.getColor(this,colorReference)
    }

    private fun initUI() {
        setGenderColor()
        establecerPeso()
        establecerEdad()
    }


}