/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class InvocationHandlerClass implements java.lang.reflect.InvocationHandler {

	private Object obj;
 
	public InvocationHandlerClass(Object f1){ obj = f1; }
 
	public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args)  
		throws Throwable {
		System.out.println("InvocationHandlerClass invoke : " + method.getName());
		return method.invoke(obj, args) ;
	}


}
