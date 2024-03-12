package com.fellipehfa.controller

import com.fellipehfa.model.Greeting
import com.fellipehfa.model.Person
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/api")
class GreetingController {
    val counter: AtomicLong = AtomicLong()
    val persons: MutableList<Person> = mutableListOf()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String?): Greeting {
       return Greeting(counter.incrementAndGet(), "Hello, $name!")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody person: Person): Person {
        persons.add(person)
        return person
    }
}