package ru.netology


data class LinkAttachment(
    override val id: Int = 0,
    override val albumId: Int = 0,
    override val ownerId: Int = 0,
    override val userId: Int = 0
) : Attachment {
    override val type: TypeAttachment
        get() = TypeAttachment.Link
    val link:Link=Link()
    override fun toString(): String {
        return "LinkAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}