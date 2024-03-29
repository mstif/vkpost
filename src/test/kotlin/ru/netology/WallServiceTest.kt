package ru.netology

import org.junit.Assert
import org.junit.Test

class WallServiceTest {

    @Test
    fun update_Error() {
        val result = WallService.update(Post())
        Assert.assertEquals(false, result)
    }

    @Test
    fun add_Post() {
        val result = WallService.add(Post(text = "Это пост №1")).id

        //val result = WallService.update(Post())
        Assert.assertNotEquals(0, result)
    }

    @Test
    fun update_Post_exist() {
        WallService.clear()
        val post1 = WallService.add(Post(text = "Это пост №1"))
        WallService.addAttachmentToPost(PhotoAttachment(), post1)
        val post2 = WallService.add(Post(text = "Это пост №2"))
        WallService.addAttachmentToPost(AudioAttachment(), post2)
        val post3 = WallService.add(Post(text = "Это пост №3"))
        WallService.addAttachmentToPost(LinkAttachment(), post3)
        val postUpdating = post2.copy(text = "Обновляющий пост")
        val result = WallService.update(postUpdating)
        Assert.assertEquals(true, result)
    }

    @Test
    fun update_Post_notexist() {
        WallService.clear()
        val post1 = WallService.add(Post(text = "Это пост №1"))
        WallService.addAttachmentToPost(PhotoAttachment(), post1)
        val post2 = WallService.add(Post(text = "Это пост №2"))
        WallService.addAttachmentToPost(AudioAttachment(), post2)
        val post3 = WallService.add(Post(text = "Это пост №3"))
        WallService.addAttachmentToPost(LinkAttachment(), post3)
        val postUpdating = Post(text = "Обновляющий пост")
        val result = WallService.update(postUpdating)
        Assert.assertEquals(false, result)
    }

    @Test
    fun createComment_Post_Exist() {
        WallService.clear()
        val post1 = WallService.add(Post(text = "Это пост №1"))
        WallService.createComment(Comment(postId = 1, text = "Комментарий №1"))
        val res = WallService.getCommentsOfPost(post1.id)
        val result = !res.any() && res[0].text == "Комментарий №1"
        Assert.assertFalse(result)
    }

    @Test(expected = PostNotFoundExeption::class)
    fun createComment_Post_NotExist() {

        WallService.clear()
        val post1 = WallService.add(Post(text = "Это пост №1"))

        WallService.createComment(Comment(postId = 2, text = "Комментарий №1"))



    }

}