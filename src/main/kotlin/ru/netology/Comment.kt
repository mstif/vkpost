package ru.netology

internal data class Comment(
    val id: Int = 0,
    val fromId: Int = 0,
    val date:Int = 0,
    val text:String? = null ,
    val donat:VkDonat? = null,
    val replayToUser:Int=0,
    val replayToComment:Int=0,
    val attachments:Array<Attachment> = emptyArray(),
    val parentStack:Array<Int> = emptyArray(),
    val thread: InnerComment?=null,
    val postId:Int)