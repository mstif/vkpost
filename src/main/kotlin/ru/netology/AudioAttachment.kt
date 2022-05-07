package ru.netology

class AudioAttachment(
    override val type: TypeAttachment = TypeAttachment.Audio,
    val audio: Audio = Audio()
) : Attachment() {

    override fun toString(): String {
        return "AudioAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}