package com.example.ejercicio4recycledviewasignaturas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


val courses = listOf(
    Curso("1º DAM", listOf(Asignatura("Programación"), Asignatura("Bases de Datos"), Asignatura("Redes"))),
    Curso("2º DAM", listOf(Asignatura("Desarrollo Web"), Asignatura("Seguridad"), Asignatura("Empresas")))
)

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewCourses: RecyclerView = findViewById(R.id.reciclerViewCursos)
        recyclerViewCourses.layoutManager = LinearLayoutManager(this)
        recyclerViewCourses.adapter = CursoAdapter(courses) { course ->
            showSubjectsDialog(course)
        }
    }

    private fun showSubjectsDialog(curso: Curso) {
        val subjects = curso.asignaturas.map { it.nombre }.toTypedArray()

        AlertDialog.Builder(this)
            .setTitle("Asignaturas de ${curso.nombre}")
            .setItems(subjects) { _, _ ->
                // Acción al hacer clic en una asignatura (puedes implementar algo aquí)
            }
            .setPositiveButton("Aceptar") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}