package ru.netology

import java.util.Date

internal data class Post
internal constructor(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Date,
    val text: String,
    val replayOwnerId: Int,
    val replayPostId: Int,
    val friendsOnly: Boolean,
    val comments: CommentPost,
    val copyright: String,
    val likes: Like,
    val reposts: Repost,
    val views: ViewPost,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val postponedId: Int
) {



}
