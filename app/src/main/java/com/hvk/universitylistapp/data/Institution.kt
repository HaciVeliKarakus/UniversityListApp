package com.hvk.universitylistapp.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Institution(
    @SerialName("web_pages")
    val webPages: List<String>,
    val name: String,
    @SerialName("alpha_two_code")
    val code: String,
    @SerialName("state-province")
    val stateProvince: String?,
    val domains: List<String>,
    val country: String
)
