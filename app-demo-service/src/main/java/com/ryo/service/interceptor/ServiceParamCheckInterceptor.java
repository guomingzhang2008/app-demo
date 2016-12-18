package com.ryo.service.interceptor;

import com.ryo.framework.checker.service.CheckService;
import com.ryo.framework.util.LoggerUtil;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author houbinbin
 * @on 16/12/17
 */
@Component
@Aspect
@Log4j2
public class ServiceParamCheckInterceptor {

    @Autowired
    private CheckService checkService;

    /**
     * 所有service层公共方法
     */
    @Pointcut("execution(public * com.ryo.app.demo.service..*.*(..))")
    public void myPointcut() {
    }

    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object[] objects = point.getArgs();
        LoggerUtil.info(log, "入参:{}", objects);
        for(Object obj : objects) {
            checkService.check(obj);
        }

        Object result = point.proceed();    // result的值就是被拦截方法的返回值

        LoggerUtil.info(log, "出餐:{}", result);
        return result;
    }
}
