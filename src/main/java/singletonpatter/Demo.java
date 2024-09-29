package singletonpatter;

import java.lang.reflect.Constructor;

public class Demo {

        public static void main(String[] args) {
            Logger logger = Logger.getInstance();
            Logger logger2 = Logger.getInstance();

            // prints: true
            System.out.println(logger == logger2);

            // use reflection to break singleton
//             Logger logger3 = Logger.getInstance();
//             Logger logger4 = null;
//             try {
//                 Constructor[] constructors = Logger.class.getDeclaredConstructors();
//                 Constructor constructor = constructors[0];
//                 constructor.setAccessible(true);
//                 logger4 = (Logger) constructor.newInstance();
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//             System.out.println(logger3 == logger4);

        }
}
