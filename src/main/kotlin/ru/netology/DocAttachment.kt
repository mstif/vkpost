package ru.netology

data class DocAttachment(
    override val id: Int = 0,
    override val albumId: Int = 0,
    override val ownerId: Int = 0,
    override val userId: Int = 0
) : Attachment {
    override val type: TypeAttachment
        get() = TypeAttachment.Doc
    val doc:Doc=Doc()
    override fun toString(): String {
        return "DocAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}