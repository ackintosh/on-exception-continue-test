package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
@ImportResource("classpath:OnExceptionContinueTest.xml")
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
