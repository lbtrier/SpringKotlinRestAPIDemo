package com.splititup.api.repository

import com.splititup.api.model.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by lbtrier on 22/06/17.
 */

@Repository
interface PersonRepository : CrudRepository<Person, Long> {

    fun findByName(name: String): Iterable<Person>

}
