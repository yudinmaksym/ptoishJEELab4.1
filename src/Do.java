
import java.lang.reflect.Proxy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class Do {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
 
	Testable testproxy = (Testable) Proxy.newProxyInstance(Test1.class.getClassLoader(), 
							   Test1.class.getInterfaces(),
							   new InvocationHandlerClass(test1));
        Testable testproxy2 = (Testable) Proxy.newProxyInstance(Test2.class.getClassLoader(), 
							   Test2.class.getInterfaces(),
							   new InvocationHandlerClass(test2));
 
        testproxy.test();
        testproxy2.test();
        }
}
