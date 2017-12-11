package com.lazorjack.kotlinfun.domain

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Getter
@Setter
@NoArgsConstructor
data class Post(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        val name: String = "",
        val description: String = ""
) {}

