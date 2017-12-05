package com.lazorjack.kotlinfun

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinFunApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinFunApplication::class.java, *args)
}
