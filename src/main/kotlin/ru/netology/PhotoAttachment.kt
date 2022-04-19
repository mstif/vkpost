package ru.netology

data class PhotoAttachment(
    override val id: Int = 0,
    override val albumId: Int = 0,
    override val ownerId: Int = 0,
    override val userId: Int = 0
) : Attachment {
    override val type: TypeAttachment
        get() = TypeAttachment.Photo
    val photo:Photo=Photo()
    override fun toString(): String {
        return "PhotoAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}