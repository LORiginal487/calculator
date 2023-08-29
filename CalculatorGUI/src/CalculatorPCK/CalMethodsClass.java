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
    private double num1;
    private double num2;
    private double ans;
    private char symbol;

    public CalMethodsClass(double num1, double num2, char symbol) {
        this.num1 = num1;
        this.num2 = num2;
        this.symbol = symbol;
    }

    

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setAns(double ans) {
        this.ans = ans;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public double getAns() {
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
