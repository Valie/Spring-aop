package com.tk.spring.aop.annotation;

import java.lang.annotation.*;

/**
 * @Description TODO
 * @Author WeiLi
 **/
@Documented
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TKLog {

}
