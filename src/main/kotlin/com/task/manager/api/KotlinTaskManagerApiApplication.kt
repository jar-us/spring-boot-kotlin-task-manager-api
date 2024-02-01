package com.task.manager.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTaskManagerApiApplication

fun main(args: Array<String>) {
    runApplication<KotlinTaskManagerApiApplication>(*args)
}
