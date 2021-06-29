package com.example.shotaberelidzedavaleba5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(com.example.shotaberelidzedavaleba5.aspect.Println)")
    public void log(JoinPoint joinPoint){
        System.out.println("არგუმენტები" + Arrays.toString(joinPoint.getArgs()));
    }
}