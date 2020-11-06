package com.example.calculatorapp;

import android.widget.Button;

import java.util.ArrayList;

public class Control {
    public void multiplication(ArrayList arrayList, ArrayList arrayList2, Button button, int i) {
        if (arrayList.size() > 0) {
            if (arrayList.get(i) == button.getText()) {
                arrayList.set(i, Float.parseFloat((arrayList.get(i - 1).toString())) * Float.parseFloat(arrayList.get(i + 1).toString()));
                arrayList.set(i + 1, "");
                arrayList.set(i - 1, "");
                changeArray(arrayList, arrayList2);
            }
        }
    }

    public void division(ArrayList arrayList, ArrayList arrayList2, Button button, int i) {
        if (arrayList.size() > 0) {
            if (arrayList.get(i) == button.getText()) {
                arrayList.set(i, Float.parseFloat((arrayList.get(i - 1).toString())) / Float.parseFloat(arrayList.get(i + 1).toString()));
                arrayList.set(i + 1, "");
                arrayList.set(i - 1, "");
                changeArray(arrayList, arrayList2);
            }
        }
    }

    public void substruction(ArrayList arrayList, ArrayList arrayList2, Button button, int i) {
        if (arrayList.size() > 0) {
            if (arrayList.get(i) == button.getText()) {
                arrayList.set(i, Float.parseFloat((arrayList.get(i - 1).toString())) - Float.parseFloat(arrayList.get(i + 1).toString()));
                arrayList.set(i + 1, "");
                arrayList.set(i - 1, "");
                changeArray(arrayList, arrayList2);
            }
        }
    }

    public void addition(ArrayList arrayList, ArrayList arrayList2, Button button, int i) {
        if (arrayList.size() > 0) {
            if (arrayList.get(i) == button.getText()) {
                arrayList.set(i, Float.parseFloat((arrayList.get(i - 1).toString())) + Float.parseFloat(arrayList.get(i + 1).toString()));
                arrayList.set(i + 1, "");
                arrayList.set(i - 1, "");
                changeArray(arrayList, arrayList2);
            }
        }
    }
    public void percent (ArrayList arrayList, ArrayList arrayList2, Button button, int i) {
        if (arrayList.size() > 0) {
            if (arrayList.get(i) == button.getText()) {
                arrayList.set(i, Float.parseFloat((arrayList.get(i - 1).toString())) * Float.parseFloat(arrayList.get(i + 1).toString())/100);
                arrayList.set(i + 1, "");
                arrayList.set(i - 1, "");
                changeArray(arrayList, arrayList2);
            }
        }
    }


    public void changeArray(ArrayList arrayList1, ArrayList arrayList2) {
        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) != "") {
                arrayList2.add(arrayList1.get(i));

            }
        }
        arrayList1.clear();
    }

}

