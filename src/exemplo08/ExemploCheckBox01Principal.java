package exemplo08;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Gustavo
 */
public class ExemploCheckBox01Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new ExemploCheckBox01();
            }
        });
    }
}
