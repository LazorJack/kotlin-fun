package com.lazorjack.kotlinfun.repository

import com.lazorjack.kotlinfun.domain.Post
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository


interface PostRepository : CrudRepository<Post, Long> {

}
