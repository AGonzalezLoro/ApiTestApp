package com.example.apitestapp.data.response

import com.example.apitestapp.presentation.model.CharacterModel
import com.google.gson.annotations.SerializedName

class CharacterResponse(
    @SerializedName("id") val id:Int,
    @SerializedName("name") val name:String,
    @SerializedName("image") val image:String,
    @SerializedName("description") val description:String,
    @SerializedName("race") val race:String,
    @SerializedName("ki") val ki:String
){

    fun toPresentation(): CharacterModel{
        return CharacterModel(
            id, name, image, description, race, ki
        )
    }
}