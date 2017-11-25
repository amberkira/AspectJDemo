package com.example.sleepeanuty.ascpectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by sleepeanuty on 2017/11/25.
 */

@Aspect
public class AspectJTest {
    static final String TAG = "ASPECTJ is Here";

    /**
     * execution ()内部String写法很简单  第一个*其实代表的是该方法返回参数类型 *就是任意参数都行
     * 后面就是清晰的包名加上方法名当然也能用*适配符，（..）代表任意参数个数，任意参数类型
     * @param joinPoint
     * @throws Throwable
     */
    @Before("execution (* android.app.Activity.on**(..))")
    public void AspectJInject(JoinPoint joinPoint) throws Throwable{
        StringBuilder sb = new StringBuilder();
        sb.append("Kind: "+joinPoint.getKind()+"\r\n");
        sb.append("SoucreLocation: "+joinPoint.getSourceLocation().getWithinType().getCanonicalName()+"\r\n");
        sb.append("Signatures: "+joinPoint.getSignature().toString()+"\r\n");
        Log.e(TAG,sb.toString());
    }
    @Pointcut(value = "call(void MainActivity.callTest())")
    public void dothing(){
        Log.e("dothing","dothing");///该方法内部逻辑不会调用
    }


    @Before("dothing()")
    public void replace() throws Throwable{
        Log.e("replace","replace");
    }
}
