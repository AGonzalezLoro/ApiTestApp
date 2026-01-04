package com.example.apitestapp.data.response

import com.google.gson.annotations.SerializedName

data class ResponseWrapper (
    @SerializedName("links") val links:InfoResponse,
    @SerializedName("items") val items:List<CharacterResponse>
)