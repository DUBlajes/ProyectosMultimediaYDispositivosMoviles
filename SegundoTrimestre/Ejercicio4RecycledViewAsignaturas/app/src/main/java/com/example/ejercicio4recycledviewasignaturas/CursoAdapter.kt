package com.example.ejercicio4recycledviewasignaturas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CursoAdapter(private val cursos: List<Curso>, private val onCourseClickListener: (Curso) -> Unit) :
    RecyclerView.Adapter<CursoAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_curso, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curso = cursos[position]

        // Aquí es donde debes obtener el TextView dentro de la vista item_course.xml
        val courseTextView: TextView = holder.itemView.findViewById(R.id.courseNameTextView)

        // Ahora, establece el texto en el TextView
        courseTextView.text = curso.nombre

        // Asigna el clic al itemView (puede seguir usándolo si es necesario)
        holder.itemView.setOnClickListener { onCourseClickListener(curso) }
    }

    override fun getItemCount(): Int = cursos.size
    }