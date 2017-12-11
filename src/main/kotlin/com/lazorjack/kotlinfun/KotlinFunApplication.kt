package com.lazorjack.kotlinfun

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinFunApplication

fun main(args: Array<String>) {
    runApplication<KotlinFunApplication>(*args)
}
