package ru.netology

internal object WallService {
    private var posts = emptyArray<Post>()
    private var maxPostId: Int = 0

    fun add(post: Post): Post {
        maxPostId++
        val postCopy: Post = post.copy(id = maxPostId)
        posts += postCopy
        return posts.last()
    }

    fun addAttachmentToPost(attachment:Attachment,post: Post):Post{
        var attachmentsCopy = post.attachments?: emptyArray<Attachment>() + attachment
        val postCopy: Post = post.copy(attachments = attachmentsCopy)
        update(postCopy)
        return postCopy
    }
    fun displayAttachment(attachment: Attachment){
        when(attachment.type){
            TypeAttachment.Photo -> (attachment as PhotoAttachment).photo.displayPhoto()
            TypeAttachment.Video -> (attachment as VideoAttachment).video.displayVideo()
            TypeAttachment.Audio -> (attachment as AudioAttachment).audio.displayAudio()
            TypeAttachment.Doc -> (attachment as DocAttachment).doc.displayDoc()
            TypeAttachment.Link -> (attachment as LinkAttachment).link.displayLink()
        }


    }
    fun update(post: Post): Boolean {
        for ((index, itemPost) in posts.withIndex()) {
            if (itemPost.id == post.id) {
                posts[index] = post.copy(ownerId = itemPost.ownerId, date = itemPost.date)
                return true
            }
        }
        return false
    }
    fun clear(){
        maxPostId = 0
        posts = emptyArray<Post>()
    }

    fun displayPostFields(post: Post){
        println(post);
    }
}