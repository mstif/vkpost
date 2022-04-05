package ru.netology

import java.util.Date

internal data class Post
internal constructor(
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Date = Date(),
    val text: String = "",
    val replayOwnerId: Int = 0,
    val replayPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: CommentPost = CommentPost(),
    val copyright: String = "",
    val likes: Like = Like(),
    val reposts: Repost = Repost(),
    val views: ViewPost = ViewPost(),
    val postType: String  = "",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val postponedId: Int = 0,
    val id: Int = 0
) {



}
