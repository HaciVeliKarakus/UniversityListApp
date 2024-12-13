package com.hvk.universitylistapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hvk.universitylistapp.data.Institution

@Composable
fun InstitutionList(institutions: List<String>, modifier: Modifier) {

    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(institutions) { institution ->
            InstitutionItem(institution)
        }
    }
}

@Composable
fun InstitutionItem(institution: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
            Text(
                institution,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun Preview() {
    val list = List(10) {
        Institution(
            webPages = listOf("domain1", "domain2"),
            name = "Eliza Flores",
            code = "at",
            stateProvince = null,
            domains = listOf(),
            country = "Ethiopia"

        )
    }
    InstitutionList(listOf(), Modifier)
}