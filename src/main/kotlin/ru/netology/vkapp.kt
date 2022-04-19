package ru.netology

fun main() {
    var post1 = WallService.add(Post(text = "Это пост №1"))
    post1 = WallService.addAttachmentToPost(PhotoAttachment(1,1),post1)
    WallService.displayPostFields(post1)

    var post2 = WallService.add(Post(text = "Это пост №2"))
    post2 = WallService.addAttachmentToPost(VideoAttachment(2,1),post2)
    WallService.displayPostFields(post2)

    var post3 = WallService.add(Post(text = "Это пост №3"))
    post3 = WallService.addAttachmentToPost(AudioAttachment(3,1),post3)
    WallService.displayPostFields(post3)

    var post4 = WallService.add(Post(text = "Это пост №4"))
    post4 = WallService.addAttachmentToPost(DocAttachment(4,1),post4)
    WallService.displayPostFields(post4)

    var post5 = WallService.add(Post(text = "Это пост №5"))
    post5 = WallService.addAttachmentToPost(LinkAttachment(5,1),post5)
    WallService.displayPostFields(post5)
}