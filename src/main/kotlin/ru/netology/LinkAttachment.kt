package ru.netology


class LinkAttachment(
    override val type: TypeAttachment = TypeAttachment.Link,
    val link: Link = Link()
) : Attachment() {

    override fun toString(): String {
        return "LinkAttachment(id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, type=$type)"
    }
}