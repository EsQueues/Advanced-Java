package javaREFLECTION_api;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {

        Class personClass = Person.class;//1 version of creating object of Class



        Class personClass3=Class.forName("Person");//2 version of creating object for Class

        Person person1=new Person();

        Class personClass2=person1.getClass();//3 version of creating(you have create new object of class Persob



        Method[] methods = personClass.getMethods();//getting all methods from class Person
        for(Method method:methods){
            System.out.println(method.getName()+" "+method.getReturnType()+" "+ Arrays.toString(method.getParameterTypes()));
        }




        Field[] fields = personClass.getDeclaredFields();//as our fields in class Person we used method "getDeclaredFields" instead of "getFields"
        for(Field field:fields){
            System.out.println(field.getName()+" "+field.getType());


        }


        Annotation[]annotations=personClass.getAnnotations();
        for(Annotation annotation:annotations){
            if(annotation instanceof Author){//is this class belongs to annotation Author(instance==пример)
                System.out.println("Yes");
            }
        }
    }
}
