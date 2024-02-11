package model;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
	Object ob;
	System.out.println("Before Advice");
	ob=arg0.proceed();
	System.out.println("After Advice");
	return ob;
	}

}
