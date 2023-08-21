package org.josue.singleton;

public class DBSinglestonConection {

    private static DBSinglestonConection singletonConnection;
    private DBSinglestonConection(){
        System.out.println("Singleton instance");
    }

    public static  DBSinglestonConection getInstance(){
        if(singletonConnection == null){
            singletonConnection = new DBSinglestonConection();
        }
        return singletonConnection;
    }

}
