package com.company;

class Students {
    protected int id;
    protected String name;

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


public class GetterSetter {
    public static void main(String[] args) {
        System.out.println("Check details: ");

        Students st = new Students();

        st.setName("Srashti Sharma");
        System.out.println(st.getName());

        st.setId(10101);
        System.out.println(st.getId());
    }
}
