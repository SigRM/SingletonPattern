package logic;

public class University {
    private String name;
    private int yearFoundation;
    //Private instance of the initial clase in null
    private static University university1=null;


    private University() {  //Private constructor
        name = "New York University";
        yearFoundation = 1831;
    }

    //If do not exist the instance but
    //if it actually exists return the existing one.
    //only the first time that you call or invoke the method the instance is created, 
    //the netx times it returns the instance that already exits.
    public static University getInstance(){
        if(university1==null){
            university1= new University();
        }
        return university1;
        
    }
    public String toString() {
        String hilera = name + " - " + yearFoundation;
        return hilera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getyearFoundation() {
        return yearFoundation;
    }

    public void setyearFoundation(int yearFoundation) {
        this.yearFoundation = yearFoundation;
    }

}
