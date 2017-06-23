package com.splititup.api.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by lbtrier on 20/06/17.
 */

@Entity
data class Person (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var name: String,
        var cpf: String,
        var age: Int,
        var email: String? = null) {


    private constructor() : this(-1, "", "", 0)

}
