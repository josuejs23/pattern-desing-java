package org.josue;

import org.josue.singleton.DBSinglestonConection;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Testing the Singleton Pattern");
        for (int i = 0; i < 10; i++) {
            DBSinglestonConection conn = DBSinglestonConection.getInstance();
            System.out.println("connn = " + conn);
        }
    }
}