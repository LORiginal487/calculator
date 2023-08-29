/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorPCK;

/**
 *
 * @author User
 */
public class CalMethodsClass {
    private int num1;
    private int num2;
    private int ans;
    private char symbol;

    public CalMethodsClass(int num1, int num2, char symbol) {
        this.num1 = num1;
        this.num2 = num2;
        this.symbol = symbol;
    }

    

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getAns() {
        if(symbol == '+'){
            ans = num1 + num2;
        }
        else if(symbol == '-'){
            ans = num1 - num2;
        }
        else if(symbol == '/'){
            ans = num1 / num2;
        }
        else if(symbol == '*'){
            ans = num1 * num2;
        }
        return ans;
    }
    
    
    
}
