package ru.netology

data class PhotoAttachment(
    override val type: TypeAttachment = TypeAttachment.Photo,
    val photo: Photo = Photo()
) : Attachment() {

    override fun toString(): String {
        return "PhotoAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}