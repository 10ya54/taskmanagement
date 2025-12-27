package com.example.taskmanagement.app.web.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@Order(1)
public class ControllerLogAspect {

    @Around("@within(org.springframework.stereotype.Controller) && " + "within(com.example.taskmanagement..*)")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        log.info("Controller開始: {}", pjp.getSignature());
        try {
            Object result = pjp.proceed();
            log.info("Controller終了: {}", pjp.getSignature());
            return result;
        } catch (Exception e) {
            log.error("Controller異常終了: {}", pjp.getSignature(), e);
            throw e;
        }
    }
}
