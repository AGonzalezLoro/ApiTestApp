package com.example.apitestapp.data.response

import com.example.apitestapp.presentation.model.CharacterModel
import com.google.gson.annotations.SerializedName

class CharacterResponse(
    @SerializedName("id") val id:Int,
    @SerializedName("name") val name:String,
    @SerializedName("image") val image:String
){

    fun toPresentation(): CharacterModel{
        return CharacterModel(
            id, name, image
        )
    }
}