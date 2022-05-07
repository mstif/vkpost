package ru.netology


class VideoAttachment(
    override val type: TypeAttachment = TypeAttachment.Video,
    val video: Video = Video()

) : Attachment() {

    override fun toString(): String {
        return "VideoAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}