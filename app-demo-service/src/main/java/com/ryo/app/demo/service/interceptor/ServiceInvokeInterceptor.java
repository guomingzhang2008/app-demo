package com.ryo.app.demo.service.interceptor;

import com.ryo.framework.business.util.InterceptorUtil;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author houbinbin
 * @since 16/11/12
 * Service 层方法调动次数统计拦截器
 */
@Component
@Aspect
@Log4j2
public class ServiceInvokeInterceptor {

    /**
     * 时间消耗超过1S的存放到数据库中
     */
    private static Long COST_TIME_LIMIT = 1000L;

    /**
     * 用于计算时间
     */
    private Long startTime;
    private Long endTime;

    /**
     * 所有service层公共方法
     */
    @Pointcut("execution(public * com.ryo.app.demo.service..*.*(..))")
    public void myPointcut() {
    }

    @Before("myPointcut()")
    public void before(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        //add 调用次数

        String info = InterceptorUtil.printJoinPoint(joinPoint);
        log.info(info);
    }

    @After("myPointcut()")
    public void after(JoinPoint joinPoint) {
        endTime = System.currentTimeMillis();
        Long costTime = endTime-startTime;
        log.info("cost time: {}", costTime);

        //计算时间
        if(costTime >= COST_TIME_LIMIT) {
            //保存方法的耗时,超过1S的保存到数据库
        }
    }


    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();    // result的值就是被拦截方法的返回值
        return result;
    }

}
