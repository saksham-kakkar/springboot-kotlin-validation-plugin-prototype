package com.example.app.service

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class ValidationAspect(private val validationService: ValidationService) {

    @Pointcut("@annotation(com.example.app.service.ValidateRequest)")
    fun validatePointcut() {}

    @Around("validatePointcut()")
    fun aroundAdvice(joinPoint: ProceedingJoinPoint): Any? {
        if (validationService.shouldVerify()) {
            validationService.validate()
        }
        return joinPoint.proceed() // Continue execution
    }
}
