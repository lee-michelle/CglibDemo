import net.sf.cglib.proxy.Enhancer;

public class Main {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CGsubject.class);
		enhancer.setCallback(new HelloInterceptor());
		CGsubject cGsubject = (CGsubject) enhancer.create();
		cGsubject.sayHello();
	}

}
