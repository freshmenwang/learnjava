package MethodTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		try {
			Class c = Class.forName("java.lang.String");
			str.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + " {\n");
			Method[] methods = c.getMethods();
			for(Method method : methods){
				str.append("\t" + Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getSimpleName() +" "+ method.getName() + " (" );
				Class[] paramters = method.getParameterTypes();
				for(int i = 0;i < paramters.length;i++){
					if(i == paramters.length - 1){
						str.append(paramters[i].getSimpleName());
						break;
					}
					str.append(paramters[i].getSimpleName() + " , ");
				}
				str.append(")\n");
			}
			str.append("}");
			System.out.println(str);
			Class ct = User.class;
			Method m = ct.getDeclaredMethod("login", String.class,String.class);
			Object t = m.invoke(ct.newInstance(), "wjz","123");
			System.out.println(t);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
