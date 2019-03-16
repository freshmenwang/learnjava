package FieldTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Employee.class;
		Field[] fs = c.getDeclaredFields();
		try {
			Field fd = c.getDeclaredField("name");
			fd.setAccessible(true);
			Object o = c.newInstance();
			fd.set(o, "wjz");
			System.out.println(fd.get(o));
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuffer s = new StringBuffer();
		s.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
		for(Field f : fs){
			s.append("\t"+Modifier.toString(c.getModifiers())+" "+f.getType().getSimpleName()+" "+f.getName()+" ;\n");
		}
		s.append("}");
		System.out.println(s);
	}

}
