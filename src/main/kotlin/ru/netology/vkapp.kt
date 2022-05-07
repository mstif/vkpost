package ru.netology

fun main() {
    var post1 = WallService.add(Post(text = "Это пост №1"))
    post1 = WallService.addAttachmentToPost(PhotoAttachment(),post1)
    WallService.displayPostFields(post1)

    var post2 = WallService.add(Post(text = "Это пост №2"))
    post2 = WallService.addAttachmentToPost(VideoAttachment(),post2)
    WallService.displayPostFields(post2)

    var post3 = WallService.add(Post(text = "Это пост №3"))
    post3 = WallService.addAttachmentToPost(AudioAttachment(),post3)
    WallService.displayPostFields(post3)

    var post4 = WallService.add(Post(text = "Это пост №4"))
    post4 = WallService.addAttachmentToPost(DocAttachment(),post4)
    WallService.displayPostFields(post4)

    var post5 = WallService.add(Post(text = "Это пост №5"))
    post5 = WallService.addAttachmentToPost(LinkAttachment(),post5)
    WallService.displayPostFields(post5)
}