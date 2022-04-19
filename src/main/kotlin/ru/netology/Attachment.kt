package ru.netology

interface Attachment {
    val type: TypeAttachment
    val id: Int
    val albumId: Int
    val ownerId: Int
    val userId: Int

}
