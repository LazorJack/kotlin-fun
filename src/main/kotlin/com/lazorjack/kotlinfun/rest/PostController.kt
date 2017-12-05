package com.lazorjack.kotlinfun.rest

import com.lazorjack.kotlinfun.domain.Post
import com.lazorjack.kotlinfun.service.PostService
import org.springframework.web.bind.annotation.*

@RestController
class PostController(val postService: PostService) {

    @GetMapping("/post/{id}")
    fun getById(@PathVariable id: Long): Post {
        return postService.getById(id)
    }

    @PostMapping("/post")
    fun create(@RequestBody post: Post): Post {
        return postService.create(post)
    }
}

