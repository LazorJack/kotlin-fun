package com.lazorjack.kotlinfun.repository

import com.lazorjack.kotlinfun.domain.Post
import org.springframework.data.repository.CrudRepository


interface PostRepository : CrudRepository<Post, Long> {

}
