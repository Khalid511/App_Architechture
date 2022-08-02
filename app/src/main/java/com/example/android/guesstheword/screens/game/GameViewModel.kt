package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel
import android.util.Log
class GameViewModel : ViewModel() {
    init {
        Log.i("GameViewMode", "GameViewModel Created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel Destroyed!")
    }
}