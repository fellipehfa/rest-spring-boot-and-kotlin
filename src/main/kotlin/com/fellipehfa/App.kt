package com.fellipehfa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class App {
	fun hello() = "Hello, World!"
}

fun main(args: Array<String>) {
	runApplication<App>(*args)
}
