package com.example.trivialapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.trivialapp.viewmodel.PreguntasView

class PreguntasViewModelFactory(private val dificultad :String) :ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PreguntasView::class.java)) {
            return PreguntasView(dificultad) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}