package com.company;

class NewStudents {
    protected int id;
    protected String name;

    //constructor overloading
    public NewStudents(){
        id = 1111;
        name = "Srashti ji";
    }

    public NewStudents(String myName, int myId){
        id = myId;
        name = myName;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i){
        this.id = i;
    }
}


public class Constructor {

    public static void main(String[] args) {

//        NewStudents s = new NewStudents();

        NewStudents s = new NewStudents("Simmy", 123);

        System.out.println(s.getId());
        System.out.println(s.getName());
    }

}
