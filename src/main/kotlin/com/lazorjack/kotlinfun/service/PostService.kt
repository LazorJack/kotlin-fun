package com.lazorjack.kotlinfun.service

import com.lazorjack.kotlinfun.domain.Post
import reactor.core.publisher.Mono
import java.util.*

interface PostService {

    fun getById(id: Long): Optional<Post>

    fun create(post: Post): Post

}