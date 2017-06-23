package com.splititup.api.rest

import com.splititup.api.model.Person
import com.splititup.api.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by lbtrier on 20/06/17.
 */

@RestController
class PersonController {

    val counter = AtomicLong()

    @Autowired
    lateinit var repository: PersonRepository

    @RequestMapping("/save")
    fun save() : String {

        repository.save(Person(counter.incrementAndGet(), "Leonardo", "0", 27))
        repository.save(Person(counter.incrementAndGet(), "Maria Luiza", "0", 32))
        repository.save(Person(counter.incrementAndGet(), "Marina", "0", 4))
        repository.save(Person(counter.incrementAndGet(), "Teste", "0", 20))
        repository.save(Person(counter.incrementAndGet(), "Maria Teste", "0", 21))

        println("Everything is ok")

        return "Done"
    }

    @RequestMapping("/findall")
    fun findAll(): Iterable<Person> = repository.findAll()

    @RequestMapping("/findbyid/{id}")
    fun findById(@PathVariable id: Long): Person? = repository.findOne(id)

    @RequestMapping("findbyname/{name}")
    fun findByName(@PathVariable name: String): Iterable<Person> = repository.findByName(name)

    @RequestMapping("/person/{name}")
    fun person(@RequestParam(value = "name", defaultValue = "NomePessoa") name : String): Person {
        return Person(counter.incrementAndGet(), "Hello, $name", "", 0)
    }
}
