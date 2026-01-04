package com.example.apitestapp.data.response

import com.google.gson.annotations.SerializedName

class InfoResponse(
    @SerializedName("previous") val previus:String?,
    @SerializedName("next") val next:String?
)