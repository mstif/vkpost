package ru.netology

import java.util.Date

internal data class Post
internal constructor(
    val id: Long,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val date: Date,
    val text: String,
    val replayOwnerId: Long,
    val replayPostId: Long,
    val friendsOnly: Boolean,
    val comments: CommentPost,
    val copyright: String,
    val likes: Like,
    val reposts: Repost,
    val views: ViewPost,
    val postType: String,
    val signerId: Long,
    val canPin: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val postponedId: Long
) {



}
