package com.lazorjack.kotlinfun.service

import com.lazorjack.kotlinfun.domain.Post
import com.lazorjack.kotlinfun.repository.PostRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.*

@Service
class PostServiceImpl(val postRepository: PostRepository) : PostService {

    override fun getById(id: Long): Optional<Post> = postRepository.findById(id)

    override fun create(post: Post): Post = postRepository.save(post)

}