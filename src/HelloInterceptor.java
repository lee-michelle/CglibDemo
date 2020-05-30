import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("begin time -----> " + System.currentTimeMillis());
		Object o1 = methodProxy.invokeSuper(o, objects);
		System.out.println("end time -----> " + System.currentTimeMillis());
		return o1;
	}
}
