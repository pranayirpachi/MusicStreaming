package com.example.music_player.Models

data class CategoryModel(
    val name : String,
    val coverUrl : String,
    val songs : List<String>
){
    constructor() : this("","", listOf())
}
