package ru.netology

data class AudioAttachment(
    override val id: Int = 0,
    override val albumId: Int = 0,
    override val ownerId: Int = 0,
    override val userId: Int = 0
) : Attachment {
    override val type: TypeAttachment
        get() = TypeAttachment.Audio
    val audio:Audio=Audio()
    override fun toString(): String {
        return "AudioAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}