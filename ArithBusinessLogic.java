package com.junit.egg;
/**
 * Created by ADMIN on 7/28/17.
 */
public class ArithBusinessLogic {

    //changes here done
    //new changes
    private int a, b;
    public ArithBusinessLogic(int a, int b)
    {
    	System.out.println("ArithBusinessLogic() constructor...");
        this.a = a;
        this.b = b;
    }

    public int add()
    {
    	System.out.println("int add()");
        return a+b;
    }

    public int sub()
    {
    	System.out.println("int sub()");
        return a-b;
    }

    public int mul()
    {
    	System.out.println("int mul()");
        return a*b;
    }
}
