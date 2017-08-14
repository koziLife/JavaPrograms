package com.meryemalay;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = "+ publicVar + ": PrivateVar " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int var2 = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * this.varOne);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " +innerClass.varThree);
    }

    public class InnerClass{
        public int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is "+ varOne+"varThree is " + varOne);
        }

        public void timesTwo(){
            System.out.println("varOne is still available here " + varOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}
