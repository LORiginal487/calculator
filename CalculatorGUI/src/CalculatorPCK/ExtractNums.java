/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorPCK;

/**
 *
 * @author User
 */
public class ExtractNums {
    private String input;
    private String numStr = "";
    private int num1;
    private int num2;
    private char symbol;

    public ExtractNums(String input) {
        this.input = input;
    }
    
    
    
    public void extract(){
        for(int i = 0; i< input.length(); i++){
            char a = input.charAt(i);
            if(a != '+' && a != '/' && a != '*' && a != '-'){
                numStr = numStr + "" + Character.toString(a);
                num2 = Integer.parseInt(numStr);
            }else{
                symbol = a;
                num1 = Integer.parseInt(numStr);
                numStr = "";
            }
        }
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getNumStr() {
        return numStr;
    }

    public void setNumStr(String numStr) {
        this.numStr = numStr;
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

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
    
    
}
