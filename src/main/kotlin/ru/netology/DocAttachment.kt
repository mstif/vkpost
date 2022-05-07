package ru.netology

class DocAttachment(
    override val type: TypeAttachment = TypeAttachment.Doc,
    val doc: Doc = Doc()
) : Attachment() {

    override fun toString(): String {
        return "DocAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}