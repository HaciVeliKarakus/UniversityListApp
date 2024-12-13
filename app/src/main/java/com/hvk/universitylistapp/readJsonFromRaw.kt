package com.hvk.universitylistapp

import android.content.Context
import com.hvk.universitylistapp.data.Institution
import kotlinx.serialization.json.Json

fun readJsonFromRaw(context: Context): List<Institution> {
    val inputStream = context.resources.openRawResource(R.raw.world_universities_and_domains)
    val jsonString = inputStream.bufferedReader().use { it.readText() }
    return Json.decodeFromString(jsonString) 
}
