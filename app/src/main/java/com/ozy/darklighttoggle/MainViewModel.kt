package com.ozy.darklighttoggle

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {

    private val _colorMode = MutableStateFlow<ColorMode>(ColorMode.Light(R.drawable.sun))
    val colorMode = _colorMode.asStateFlow()

    fun toggleMode() {
        _colorMode.update {
            when(it) {
                is ColorMode.Light -> ColorMode.Dark(R.drawable.night)
                is ColorMode.Dark ->  ColorMode.Light(R.drawable.sun)
            }
        }
    }

}