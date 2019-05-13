package com.tk.spring.aop.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author WeiLi
 **/
@Slf4j
@Aspect
@Component
public class LogInterceptor {
    //标注切入点，即标有@TKLog的类
    @Pointcut("@within(com.tk.spring.aop.annotation.TKLog)")
    public void pointcut() {
    }

    //当标有@TKLog的类中的方法被调用前后，该方法会被执行
    @Around("pointcut()")
    public void doExecute(ProceedingJoinPoint point) throws Throwable {
        log.info("方法即将执行：" + point.getSignature().getName());
        Object result = point.proceed();
        log.info("方法执行结束：" + result.toString());
    }
}
