package com.example.app.service

import org.springframework.stereotype.Service

@Service("testBean")
class CustomValidationService : DefaultValidationService() {
    override fun shouldVerify(): Boolean {
        return super.shouldVerify() // Enable validation
    }

    override fun validate() {
        super.validate()
        println("Custom validation logic executed.")
    }
}
