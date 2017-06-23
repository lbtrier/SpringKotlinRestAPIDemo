package com.splititup.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SplititupapiApplication {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(SplititupapiApplication::class.java, *args)
        }
    }

}


