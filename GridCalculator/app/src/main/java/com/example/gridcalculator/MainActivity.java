package com.example.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultTextView, editTextView;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bplus, bminus, bequals, bdelete, bmultiply, bdivide, bmodulus;
    String editText, resultText, secondText="";
    boolean readSecond;
    char op;
    int num1, num2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = (TextView) findViewById(R.id.textView);
        editTextView = (TextView) findViewById(R.id.textView2);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b0 = (Button) findViewById(R.id.button0);
        bplus = (Button) findViewById(R.id.buttonPlus);
        bminus = (Button) findViewById(R.id.buttonMinus);
        bmultiply = (Button) findViewById(R.id.buttonMultiply);
        bdivide = (Button) findViewById(R.id.buttonDivide);
        bmodulus = (Button) findViewById(R.id.buttonModulus);
        bequals = (Button) findViewById(R.id.buttonEquals);
        bdelete = (Button) findViewById(R.id.buttonDelete);
        editText = editTextView.getText().toString();
        resultText = resultTextView.getText().toString();
        readSecond = false;
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"1");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '1';
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"2");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '2';
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"3");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '3';
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"4");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '4';
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"5");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '5';
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"6");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '6';
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"7");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '7';
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"8");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '8';
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"9");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '9';
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editTextView.setText(editText+"0");
                editText = editTextView.getText().toString();
                if(readSecond){
                    secondText = secondText + '0';
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(editText);
                op = '+';
                readSecond = true;
                editTextView.setText(editText+"+");
                editText = editTextView.getText().toString();
            }
        });
        bminus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(editText);
                op = '-';
                readSecond = true;
                editTextView.setText(editText+"-");
                editText = editTextView.getText().toString();
            }
        });
        bmultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(editText);
                op = '*';
                readSecond = true;
                editTextView.setText(editText+"*");
                editText = editTextView.getText().toString();
            }
        });
        bdivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(editText);
                op = '/';
                readSecond = true;
                editTextView.setText(editText+"/");
                editText = editTextView.getText().toString();
            }
        });
        bmodulus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(editText);
                op = '%';
                readSecond = true;
                editTextView.setText(editText+"%");
                editText = editTextView.getText().toString();
            }
        });
        bequals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("Second text is "+secondText);
                num2 = Integer.parseInt(secondText);
                switch(op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                    default:
                        System.out.println("Unknown operator");
                        break;
                }
                System.out.println("num1 is "+num1+" num2 is "+num2);
                System.out.println("Result is "+result);
                readSecond = false;
                resultText = ""+result;
                resultTextView.setText(resultText);
                editTextView.setText("");
                editText = editTextView.getText().toString();
                secondText = "";
            }
        });
        bdelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (editText != null && editText.length() > 0 && editText.charAt(editText.length() -1)!='+' && editText.charAt(editText.length()-1)!='-') {
                    editText = editText.substring(0, editText.length()-1);
                    if(readSecond){
                        secondText = secondText.substring(0, secondText.length()-1);
                    }
                }
                editTextView.setText(editText);
            }
        });

    }
}
