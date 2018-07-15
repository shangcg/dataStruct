package n1807;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

public class ConnectionDriver {
	
	static class ConnectionHandler implements InvocationHandler{

		@Override
		public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
			if (paramMethod.getName().equals("commit")) {
				TimeUnit.MILLISECONDS.sleep(100);
			}
			return null;
		}
	}
	
	public static final Connection createConnection(){
		return (Connection) Proxy.newProxyInstance(ConnectionDriver.class.getClassLoader(), new Class<?>[]{Connection.class}, new ConnectionHandler());
		
	}

}
