import java.util.logging.Logger;
public class SingletonEager {
    private static final Logger log = Logger.getLogger(SingletonEager.class.getName());
    private static SingletonEager sc = null;
    private SingletonEager(){}
    public static SingletonEager getInstance(){
        if ( sc == null ){
            synchronized (SingletonEager.class){
                if(sc==null){
                    sc = new SingletonEager();
                }
            }
        }
        return sc;
    }
    public void printMessage(){
        log.info("We are using singleton.");
    }
}

