package ru.netology

internal  data class Like(
    val count:Int = 0,
    val canPost:Boolean = false,
    val groupsCanPost:Boolean = false,
    val canClose:Boolean = false,
    val canOpen:Boolean = false
    )
