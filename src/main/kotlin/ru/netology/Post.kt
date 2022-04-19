package ru.netology

import java.util.Date

internal data class Post
internal constructor(
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int? = null,
    val date: Date = Date(),
    val text: String = "",
    val replayOwnerId: Int = 0,
    val replayPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: CommentPost? = CommentPost(),
    val copyright: String  = "",
    val likes: Like? = Like(),
    val reposts: Repost? = Repost(),
    val views: ViewPost? = ViewPost(),
    val postType: String  = "",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val postponedId: Int = 0,
    val postSource:PostSourse? = null,
    val geo:Geo?=null,
    val copyHistory:Array<Post>? = null,
    val attachments:Array<Attachment>? = null,
    val id: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = ownerId
        result = 31 * result + fromId
        result = 31 * result + date.hashCode()
        result = 31 * result + text.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Post(ownerId=$ownerId, fromId=$fromId, createdBy=$createdBy, date=$date," +
                " text='$text', replayOwnerId=$replayOwnerId, replayPostId=$replayPostId, " +
                "friendsOnly=$friendsOnly, comments=$comments, copyright='$copyright', " +
                "likes=$likes, reposts=$reposts, views=$views, postType='$postType'," +
                " signerId=$signerId, canPin=$canPin, canEdit=$canEdit, isPinned=$isPinned," +
                " markedAsAds=$markedAsAds, postponedId=$postponedId, postSource=$postSource," +
                " geo=$geo, copyHistory=${copyHistory?.contentToString()},attachments=${attachments?.contentToString()}, id=$id)"
    }
}
