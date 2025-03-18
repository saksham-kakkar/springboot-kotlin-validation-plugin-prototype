package com.example.app.service

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.stereotype.Service

@ConditionalOnMissingBean(name = ["testBean"])
@Service
class DefaultValidationService : ValidationService {
    override fun shouldVerify(): Boolean {
        return true // Default behavior
    }

    override fun validate() {
        println("Default validation logic executed.")
    }
}
