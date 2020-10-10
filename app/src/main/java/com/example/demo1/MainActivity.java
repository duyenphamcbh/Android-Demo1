package com.example.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, enter, add, sub, mul, div, ce, c;
    Button bs, dot;
    TextView txt1, txt2, txt3;
    Double var1;
    Double var2;
    Double ans;
    Boolean addition = false, subtract = false, multiply = false, divide = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);


        enter = findViewById(R.id.enter);
        bs = findViewById(R.id.bs);
        ce = findViewById(R.id.ce);
        c = findViewById(R.id.c);
        dot = findViewById(R.id.btnDot);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
//        txt3 = findViewById(R.id.txt3);
        //to show value of this button in textView1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"1");
//                txt3.setText(txt3.getText()+"1");
            }
        });
        //to show value of this button in textView1
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"2");
//                txt3.setText(txt3.getText()+"2");
            }
        });
        //to show value of this button in textView1
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"3");
//                txt3.setText(txt3.getText()+"3");
            }
        });
        //to show value of this button in textView1
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"4");
//                txt3.setText(txt3.getText()+"4");
            }
        });
        //to show value of this button in textView1
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"5");
//                txt3.setText(txt3.getText()+"5");
            }
        });
        //to show value of this button in textView1
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"6");
//                txt3.setText(txt3.getText()+"6");
            }
        });
        //to show value of this button in textView1
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"7");
//                txt3.setText(txt3.getText()+"7");
            }
        });
        //to show value of this button in textView1
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"8");
//                txt3.setText(txt3.getText()+"8");
            }
        });
        //to show value of this button in textView1
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"9");
//                txt3.setText(txt3.getText()+"9");
            }
        });
        //to show value of this button in textView1
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"0");
//                txt3.setText(txt3.getText()+"0");
            }
        });
        //to show value of this button in textView1
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+".");
//                txt3.setText(txt3.getText()+".");
            }
        });

        //To Add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                addition = true;
//                txt3.setText(txt3.getText()+"+");
            }
        });
        //To subtract
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                subtract = true;
//                txt3.setText(txt3.getText()+"-");
            }
        });
        //To multiply
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                multiply = true;
//                txt3.setText(txt3.getText()+"*");
            }
        });
        //To divide
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVar1();
                buttonFalse();
                divide = true;
//                txt3.setText(txt3.getText()+"/");
            }
        });

        //To clear and refresh everything!
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset();
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allReset0();
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseInputConnection tView = new BaseInputConnection(txt1, true);
                tView.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
//                if(addition){
//                    txt3.setText(var1.toString()+"+"+var2.toString());
//                } else if (subtract){
//                    txt3.setText(var1.toString()+"-"+var2.toString());
//                } else if (multiply){
//                    txt3.setText(var1.toString()+"*"+var2.toString());
//                } else if (divide){
//                    txt3.setText(var1.toString()+"/"+var2.toString());}
            }
        });
        //To calculate answer
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var2 = Double.parseDouble(txt1.getText().toString());
                if(addition){
                    ans = var1 + var2;
                } else if (subtract){
                    ans = var1 - var2;
                } else if (multiply){
                    ans = var1 * var2;
                } else if (divide){
                    ans = var1 / var2;
                } else {
                    ans = ans + 0;
                }
                txt2.setText(ans.toString());
//                enter.setEnabled(false);
                sub.setEnabled(false);
                mul.setEnabled(false);
                div.setEnabled(false);
                add.setEnabled(false);
            }
        });
    }

    public void buttonFalse(){
        sub.setEnabled(false);
        mul.setEnabled(false);
        div.setEnabled(false);
        add.setEnabled(false);
        txt1.setText("");
    }

    public void setVar1(){
        var1 = Double.parseDouble(txt1.getText().toString());
    }

    public void allReset(){
        enter.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        add.setEnabled(true);
        txt1.setText("");
        txt2.setText("");
//        txt3.setText("");
    }
    public void allReset0(){
        enter.setEnabled(true);
        sub.setEnabled(true);
        mul.setEnabled(true);
        div.setEnabled(true);
        add.setEnabled(true);
        var2 = 0.0;
        if(addition){
            ans = var1 + var2;
//            txt3.setText(var1.toString()+"+"+0);
        } else if (subtract){
            ans = var1 - var2;
            txt3.setText(var1.toString()+"-"+0);
        } else if (multiply){
            ans = var1 * var2;
//            txt3.setText(var1.toString()+"*"+0);
        } else if (divide){
            ans = var1 / var2;
//            txt3.setText(var1.toString()+"/"+0);
        } else {
            ans = ans + 0;
        }

        txt1.setText("0");
        txt2.setText("");
    }
}