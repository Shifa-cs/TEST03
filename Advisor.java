
package com.mycompany.test03;

public class Advisor {
    
    private String advisorName;

    Advisor(String name) {
        this.advisorName = name;
    }

    void giveAdvice() {
        System.out.println("Advisor " + advisorName + ": Maintain balance in credits!");
    }
}
    

