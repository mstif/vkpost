package ru.netology

internal  data class Like(
    val count:Int,
    val canPost:Boolean,
    val groupsCanPost:Boolean,
    val canClose:Boolean,
    val canOpen:Boolean
    )
{

}