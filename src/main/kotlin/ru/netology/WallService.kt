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

}