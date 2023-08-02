package javaREFLECTION_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionTest2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner sc=new Scanner(System.in);
        Class classObject1 = Class.forName(sc.next());
        Class classObject2 = Class.forName(sc.next());
        String methodName = sc.next();

        Method m = classObject1.getMethod(methodName, classObject2);//parametr of this method is second object

        Object o1 = classObject1.newInstance();

        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1,"String value");

        System.out.println(o1);
        //input: Person java.lang.String setName
        //in class "Person" there found method 'setName'
    }
}
