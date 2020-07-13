import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
    private static final Logger logger = LogManager.getLogger(MyClass.class);

    public static void main(String[] args) {
        logger.info("Hello, info!");
        logger.error("Hello, error!");
        logger.warn("Hello, warn!");
        logger.fatal("Hello, fatal!");
    }


}
