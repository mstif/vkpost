package ru.netology

abstract class Attachment(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0
) {
    abstract val type: TypeAttachment
}