package com.hvk.universitylistapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import cafe.adriel.voyager.core.screen.Screen

object HomeScreen : Screen {
    private fun readResolve(): Any = HomeScreen

    @Composable
    override fun Content() {
        val context = LocalContext.current
        val institutions = remember { readJsonFromRaw(context) }
        val countries = institutions.map { it.country }.distinct()

        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            InstitutionList(
                countries,
                Modifier.padding(innerPadding)
            )
        }
    }
}