package ru.netology

internal data class InnerComment(
    val count: Int,
    val items: Array<Comment>,
    val canPost: Boolean = true,
    val showReplayButton: Boolean = true,
    val groupsCanPost: Boolean = false
)
