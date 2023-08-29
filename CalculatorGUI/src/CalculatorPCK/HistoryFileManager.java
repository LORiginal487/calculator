/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorPCK;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class HistoryFileManager {

    String input;
    String history1="", history2="", history3="", history4="", history5="";
    File file = new File("call.txt");
    String[] lines;

    public HistoryFileManager(String input) {
        this.input = input;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void writeToFile(int count) {
        try {

            if (count == 0) {
                BufferedWriter bfw = new BufferedWriter(new FileWriter(file));
                bfw.write(input);
                bfw.close();
            } else {
                BufferedWriter bfw = new BufferedWriter(new FileWriter(file, true));
                bfw.append("_" + input);
                bfw.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(HistoryFileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readFromFile() {

        try {
            BufferedReader bfr = new BufferedReader(new FileReader(file));

            lines = bfr.readLine().split("_");
            bfr.close();

        } catch (IOException ex) {
            Logger.getLogger(HistoryFileManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void extractHis() {
        readFromFile();
        if (lines.length == 1) {
            history1 = lines[lines.length - 1];
        } else if (lines.length == 2) {
            history1 = lines[lines.length - 1];
            history2 = lines[lines.length - 2];
        } else if (lines.length == 3) {
            history1 = lines[lines.length - 1];
            history2 = lines[lines.length - 2];
            history3 = lines[lines.length - 3];
        } else if (lines.length == 4) {
            history1 = lines[lines.length - 1];
            history2 = lines[lines.length - 2];
            history3 = lines[lines.length - 3];
            history4 = lines[lines.length - 4];
        } else if (lines.length >= 5) {
            history1 = lines[lines.length - 1];
            history2 = lines[lines.length - 2];
            history3 = lines[lines.length - 3];
            history4 = lines[lines.length - 4];
            history5 = lines[lines.length - 5];
        }

    }

    public String getHistory1() {
        return history1;
    }

    public String getHistory2() {
        return history2;
    }

    public String getHistory3() {
        return history3;
    }

    public String getHistory4() {
        return history4;
    }

    public String getHistory5() {
        return history5;
    }

}
