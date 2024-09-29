package singletonpatter;

public class Logger {

    // lazy loading
    private static Logger logger = null;

    // eager loading
    // private static Logger logger = new Logger();

    private Logger() {
        // protect from reflection
        if(logger != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }


    public static Logger getInstance() {

        // lazy loading
//        if(logger == null) {
//            logger = new Logger();
//        }
//        return logger;

        // eager loading
        // return logger;

        // make it thread safe
         synchronized (Logger.class) {
             if(logger == null) {
                 logger = new Logger();
             }
         }
         return logger;
    }

}
