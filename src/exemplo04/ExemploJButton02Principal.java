/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo04;

import java.awt.EventQueue;

/**
 *
 * @author Gus
 */
public class ExemploJButton02Principal {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploJButton02();
            }
            });
    }
}
