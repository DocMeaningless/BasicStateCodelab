package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * WellnessScreen represents the whole screen, which will have two sections,
 * the water counter and the list of wellness tasks
 */
@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
//    WaterCounter(modifier)
//    StatefulCounter(modifier = modifier)
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}