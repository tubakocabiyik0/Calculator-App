package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView numberText;
    TextView tempText;
    Button additionP;
    Button multiplicationP;
    Button divisionP;
    Button substructionP;
    Button percentP;
    String number;
    Button equal;
    ArrayList nums2;
    ArrayList nums;
    String result;
    Control control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempText = findViewById(R.id.tempText);
        numberText = findViewById(R.id.numberText);
        additionP = findViewById(R.id.button17);
        multiplicationP = findViewById(R.id.button14);
        substructionP = findViewById(R.id.button16);
        divisionP = findViewById(R.id.button18);
        percentP = findViewById(R.id.button15);
        equal = findViewById(R.id.button19);
        nums = new ArrayList();
        nums2 = new ArrayList();
        control = new Control();
    }

    public void number(View v) {
        if (number == null) {
            number = v.getTag().toString();
            numberText.setText(number);
        } else {
            number = number + v.getTag().toString();
            numberText.setText(number);
        }
    }

    public void addition(View v) {
        addToarray(additionP);
    }

    public void multiplication(View v) {
        addToarray(multiplicationP);
    }

    public void division(View v) {
        addToarray(divisionP);
    }

    public void substruction(View v) {
        addToarray(substructionP);
    }

    public void percent(View v) {
        addToarray(percentP);
    }

    public void equal(View v) {
        if (numberText.getText() != "") {
            nums.add(numberText.getText().toString());
            //nums.add(equal.getText());
            tempText.setText(tempText.getText().toString() + numberText.getText().toString());
            numberText.setText("");
            number = null;


            for (int i = 0; i < nums.size(); i++) {
                if (nums.size() > 0) {
                    control.multiplication(nums, nums2, multiplicationP, i);
                }
            }

            for (int i = 0; i < nums2.size(); i++) {
                if (nums2.size() > 0) {
                    control.multiplication(nums2, nums, multiplicationP, i);
                }
            }


            for (int i = 0; i < nums.size(); i++) {
                if (nums.size() > 0) {
                    control.division(nums, nums2, divisionP, i);
                }
            }

            for (int i = 0; i < nums2.size(); i++) {
                if (nums2.size() > 0) {
                    control.division(nums2, nums, divisionP, i);
                }
            }

            for (int i = 0; i < nums.size(); i++) {
                if (nums.size() > 0) {
                    control.substruction(nums, nums2, substructionP, i);
                }
            }

            for (int i = 0; i < nums2.size(); i++) {
                if (nums2.size() > 0) {
                    control.substruction(nums2, nums, substructionP, i);
                }
            }

            for (int i = 0; i < nums.size(); i++) {
                if (nums.size() > 0) {
                    control.addition(nums, nums2, additionP, i);
                }
            }

            for (int i = 0; i < nums2.size(); i++) {
                if (nums2.size() > 0) {
                    control.addition(nums2, nums, additionP, i);
                }
            }

            for (int i = 0; i < nums.size(); i++) {
                if (nums.size() > 0) {
                    control.percent(nums, nums2, percentP, i);
                }

            }
        }
        if (nums.size() > 0) {
            result = nums.get(0).toString();
            numberText.setText(result);

        } else {
            result = nums2.get(0).toString();
            numberText.setText(result);

        }

    }

    public void addToarray(Button process) {

        if (numberText.getText() != "") {
            nums.add(numberText.getText().toString());
            nums.add(process.getText());
            tempText.setText(tempText.getText().toString() + numberText.getText().toString() + process.getText());
            numberText.setText("");
            number = null;
        }
    }

    public void clear(View v) {
        nums.clear();
        tempText.setText("");
        number = null;
        numberText.setText("");
        nums2.clear();
        result = null;
    }


}
