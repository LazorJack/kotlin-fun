package com.lazorjack.kotlinfun.rest

import com.lazorjack.kotlinfun.domain.Post
import com.lazorjack.kotlinfun.service.PostService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.util.*

@RestController
class PostController(val postService: PostService) {

    @GetMapping("/post/{id}")
    fun getById(@PathVariable id: Long): Optional<Post> = postService.getById(id)


    @PostMapping("/post")
    fun create(@RequestBody post: Post): Post = postService.create(post)

}

