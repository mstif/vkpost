package ru.netology


data class VideoAttachment(
    override val id: Int = 0,
    override val albumId: Int = 0,
    override val ownerId: Int = 0,
    override val userId: Int = 0
) : Attachment {
    override val type: TypeAttachment
        get() = TypeAttachment.Video
    val video:Video=Video()
    override fun toString(): String {
        return "VideoAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}