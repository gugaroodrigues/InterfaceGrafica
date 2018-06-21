package exemplo07;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Gustavo
 */
public class ExemploJRadioButton01Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ExemploJRadioButton01();

                
            }
        });
    }
}
