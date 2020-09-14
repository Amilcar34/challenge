package reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class InvocationHandlerChallenge implements InvocationHandler {
  
  private final List proxied;
  
  InvocationHandlerChallenge(List proxied) {
	this.proxied = proxied;
  }
  
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
	if (method.getName().startsWith("remove")) {
	  return false;
	}
	
	if (method.getName().startsWith("" + (char) 99) || method.getName().startsWith("" + (char) 101)) {
	  return false;
	}
	
	return method.invoke(proxied, args);
  }
  
  public static void main(String... doYourBest){
//	var proxy = (List) Proxy.newProxyInstance(InvocationHandlerChallenge.class.getClassLoader(),
	
	List proxy = (List) Proxy.newProxyInstance(InvocationHandlerChallenge.class.getClassLoader(),
		new Class[] { List.class }, new InvocationHandlerChallenge(new ArrayList()));
	
	proxy.add("Barney");
	proxy.add("Homer");
	proxy.add("Moe");
	proxy.remove("Homer");
	proxy.remove("Moe");
	proxy.add(proxy.contains("Homer")); // Line 38
	proxy.add(proxy.equals(proxy));
	
	System.out.println(proxy);
  }
  
}

/**
 * Lo primero que hay que analizar en el código es que estamos usando la interfaz InvocationHandler. Echar un vistazo:
 * 
 * public class InvocationHandlerChallenge implements InvocationHandler {
 * 
 *
 * Esta es una interfaz de reflexión que permite interceptar un método. El objeto por el que se interceptarán los métodos es:
 * 
 * private final List proxied;
 *
 * InvocationHandlerChallenge(List proxied) { this.proxied = proxied; }
 */
