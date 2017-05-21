package ua.training.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * Created by allugard on 21.05.17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String phoneName = "Meizu M3 note";
        double weight = 900.;
        int internalMemory = 8;
        boolean camera = true;
        int processorCores = 4;
        double processorFrequency = 1.9;
        int ram = 2;
//        Phone smartphone = new Smartphone("Meizu M3 note", 900., 8, true, 4, 1.9, 2);
        String name = "ua.training.reflection.Smartphone";
        Class clazz = Class.forName(name);

        Object obj =  clazz.getConstructor(String.class, double.class, int.class, boolean.class, int.class, double.class, int.class).newInstance(phoneName, weight, internalMemory, camera, processorCores, processorFrequency, ram);

        System.out.println("Class name:" + clazz);
        System.out.println();

        System.out.println("Invoked method");
        for( Method m : clazz.getMethods() ){
            if( m.isAnnotationPresent(CallMe.class)){
                Object object = m.invoke(obj);
            }
        }

        System.out.println();

        System.out.println("Constructors with parameters");
        for (Constructor constructor : clazz.getConstructors()) {
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.print("Constructor with parameters {");
            for (Class paramType : paramTypes) {
                System.out.print( paramType.getName() + " ");
            }
            System.out.println("}");
        }

        System.out.println();

        System.out.println("Methods");
        for(Method m : clazz.getMethods()){
            System.out.print("Annoteted by ");
            for (Annotation annotation: m.getDeclaredAnnotations()){
                System.out.print(annotation + " ");
            }
            System.out.println();
            System.out.println( Modifier.toString( m.getModifiers() ) + " "
                    + m.getReturnType() + " " + m.getName() );
        }

        System.out.println();

        System.out.println("Fields:");
        for(Field field: clazz.getDeclaredFields()){
            System.out.println(Modifier.toString(field.getModifiers()) + " "
                    + field.getType() + " " + field.getName());
        }

        System.out.println();

        System.out.println("Implemented interfaces");
        for (Class c :clazz.getInterfaces() ) {
            System.out.println(c);
        }

        System.out.println();

        System.out.println("Class modifiers:" + " " + Modifier.toString(clazz.getModifiers()));

        System.out.println();

        System.out.println("Package: " + clazz.getPackage()+ "\nSimple name: " + clazz.getSimpleName() + "\nCanonical name " + clazz.getCanonicalName());

        System.out.println();

        System.out.println("Superclass: " + clazz.getSuperclass());

        System.out.println();

        System.out.println("Class annotation:");
        for (Annotation annotation: clazz.getDeclaredAnnotations()){
            System.out.println(annotation);
        }

    }
}
