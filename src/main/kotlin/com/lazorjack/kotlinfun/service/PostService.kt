package com.lazorjack.kotlinfun.service

import com.lazorjack.kotlinfun.domain.Post
import com.lazorjack.kotlinfun.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val postRepository: PostRepository) {

    fun getById(id: Long): Post {
        return postRepository.findOne(id)
    }

    fun create(post: Post): Post {
        return postRepository.save(post)
    }

}