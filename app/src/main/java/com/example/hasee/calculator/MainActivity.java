package com.example.hasee.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOne=(Button)findViewById(R.id.buttonOne);
        final TextView txtResult1=(TextView)findViewById(R.id.textResult);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult1.setText(txtResult1.getText() + "1");
            }
        });

        Button btnTwo=(Button)findViewById(R.id.buttonTwo);
        final TextView txtResult2=(TextView)findViewById(R.id.textResult);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult2.setText(txtResult2.getText() + "2");
            }
        });

        Button btnThree=(Button)findViewById(R.id.buttonThree);
        final TextView txtResult3=(TextView)findViewById(R.id.textResult);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult3.setText(txtResult3.getText() + "3");
            }
        });

        Button btnFour=(Button)findViewById(R.id.buttonFour);
        final TextView txtResult4=(TextView)findViewById(R.id.textResult);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult4.setText(txtResult4.getText() + "4");
            }
        });

        Button btnFive=(Button)findViewById(R.id.buttonFive);
        final TextView txtResult5=(TextView)findViewById(R.id.textResult);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult5.setText(txtResult5.getText() + "5");
            }
        });

        Button btnSix=(Button)findViewById(R.id.buttonSix);
        final TextView txtResult6=(TextView)findViewById(R.id.textResult);
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult6.setText(txtResult6.getText() + "6");
            }
        });

        Button btnSeven=(Button)findViewById(R.id.buttonSeven);
        final TextView txtResult7=(TextView)findViewById(R.id.textResult);
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult7.setText(txtResult7.getText() + "7");
            }
        });

        Button btnEight=(Button)findViewById(R.id.buttonEight);
        final TextView txtResult8=(TextView)findViewById(R.id.textResult);
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult8.setText(txtResult8.getText() + "8");
            }
        });

        Button btnNine=(Button)findViewById(R.id.buttonNine);
        final TextView txtResult9=(TextView)findViewById(R.id.textResult);
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult9.setText(txtResult9.getText() + "9");
            }
        });

        Button btnZero=(Button)findViewById(R.id.buttonZero);
        final TextView txtResult0=(TextView)findViewById(R.id.textResult);
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult0.setText(txtResult0.getText() + "0");
            }
        });

        Button btnPoint=(Button)findViewById(R.id.buttonPoint);
        final TextView txtResultPoint=(TextView)findViewById(R.id.textResult);
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultPoint.getText().toString();
                if(!text.equals("")) {
                    if (!(text.substring(text.length() - 1, text.length()).equals("+") ||
                            text.substring(text.length() - 1, text.length()).equals("-") ||
                            text.substring(text.length() - 1, text.length()).equals("*") ||
                            text.substring(text.length() - 1, text.length()).equals("/") ||
                            text.substring(text.length() - 1, text.length()).equals("."))) {
                        txtResultPoint.setText(txtResultPoint.getText() + ".");
                    }
                    else
                        txtResultPoint.setText(txtResultPoint.getText() + "");
                }
                else
                    txtResultPoint.setText(txtResultPoint.getText() + "");
            }


        });

        Button btnPlus=(Button)findViewById(R.id.buttonPlus);
        final TextView txtResultPlus=(TextView)findViewById(R.id.textResult);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultPlus.getText().toString();
                if(!text.equals("")) {
                    if (text.substring(text.length() - 1, text.length()).equals("+") ||
                            text.substring(text.length() - 1, text.length()).equals("-") ||
                            text.substring(text.length() - 1, text.length()).equals("*") ||
                            text.substring(text.length() - 1, text.length()).equals("/")) {
                        txtResultPlus.setText(text.substring(0, text.length() - 1));
                        txtResultPlus.setText(txtResultPlus.getText() + "+");
                    }
                    else if(text.substring(text.length()-1,text.length()).equals("."))
                        txtResultPlus.setText(txtResultPlus.getText() + "");
                    else
                        txtResultPlus.setText(txtResultPlus.getText() + "+");
                }
                else
                    txtResultPlus.setText(txtResultPlus.getText() + "");

            }
        });

        Button btnMinus=(Button)findViewById(R.id.buttonMinus);
        final TextView txtResultMinus=(TextView)findViewById(R.id.textResult);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultMinus.getText().toString();
                if(!text.equals("")) {
                    if(text.substring(text.length()-1,text.length()).equals("+")||
                        text.substring(text.length()-1,text.length()).equals("-")||
                        text.substring(text.length()-1,text.length()).equals("*")||
                        text.substring(text.length()-1,text.length()).equals("/")) {
                        txtResultMinus.setText(text.substring(0, text.length() - 1));
                        txtResultMinus.setText(txtResultMinus.getText() + "-");
                    }
                    else if(text.substring(text.length()-1,text.length()).equals("."))
                        txtResultMinus.setText(txtResultMinus.getText() + "");
                    else
                        txtResultMinus.setText(txtResultMinus.getText() + "-");
                }
                else
                    txtResultMinus.setText(txtResultMinus.getText() + "");
            }
        });

        Button btnMultiply=(Button)findViewById(R.id.buttonMultiply);
        final TextView txtResultMultiply=(TextView)findViewById(R.id.textResult);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultMultiply.getText().toString();
                if(!text.equals("")) {
                    if (text.substring(text.length() - 1, text.length()).equals("+") ||
                            text.substring(text.length() - 1, text.length()).equals("-") ||
                            text.substring(text.length() - 1, text.length()).equals("*") ||
                            text.substring(text.length() - 1, text.length()).equals("/")) {
                        txtResultMultiply.setText(text.substring(0, text.length() - 1));
                        txtResultMultiply.setText(txtResultMultiply.getText() + "*");
                    }
                    else if (text.substring(text.length() - 1, text.length()).equals("."))
                        txtResultMultiply.setText(txtResultMultiply.getText() + "");
                    else
                        txtResultMultiply.setText(txtResultMultiply.getText() + "*");
                }
                else
                    txtResultMultiply.setText(txtResultPlus.getText() + "");
            }
        });

        Button btnDevide=(Button)findViewById(R.id.buttonDevide);
        final TextView txtResultDevide=(TextView)findViewById(R.id.textResult);
        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultDevide.getText().toString();
                if(!text.equals("")) {
                    if (text.substring(text.length() - 1, text.length()).equals("+") ||
                            text.substring(text.length() - 1, text.length()).equals("-") ||
                            text.substring(text.length() - 1, text.length()).equals("*") ||
                            text.substring(text.length() - 1, text.length()).equals("/")) {
                        txtResultDevide.setText(text.substring(0, text.length() - 1));
                        txtResultDevide.setText(txtResultDevide.getText() + "/");
                    }
                    else if (text.substring(text.length() - 1, text.length()).equals("."))
                        txtResultDevide.setText(txtResultDevide.getText() + "");
                    else
                        txtResultDevide.setText(txtResultDevide.getText() + "/");
                }
                else
                    txtResultDevide.setText(txtResultPlus.getText() + "");
            }
        });

        Button btnClear=(Button)findViewById(R.id.buttonClear);
        final TextView txtResultC=(TextView)findViewById(R.id.textResult);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultC.setText("");
            }
        });


        Button btnSquare=(Button)findViewById(R.id.buttonSquare);
        final TextView txtResultSquare=(TextView)findViewById(R.id.textResult);
        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultSquare.getText().toString();
                double d=Double.parseDouble(text);
                d*=d;
                String s=String.valueOf(d);
                txtResultSquare.setText(s);
            }
        });


        Button btnSquareRoot=(Button)findViewById(R.id.buttonSquareRoot);
        final TextView txtResultSquareRoot=(TextView)findViewById(R.id.textResult);
        btnSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultSquareRoot.getText().toString();
                double d=Double.parseDouble(text);;
                String s=String.valueOf(Math.sqrt(d));
                txtResultSquareRoot.setText(s);
            }
        });


        Button btnSin=(Button)findViewById(R.id.buttonSin);
        final TextView txtResultSIN=(TextView)findViewById(R.id.textResult);
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultSIN.getText().toString();
                double d=Double.parseDouble(text);
                String s=String.valueOf(Math.sin(d));
                txtResultSIN.setText(s);
            }
        });


        Button btnCos=(Button)findViewById(R.id.buttonCos);
        final TextView txtResultCOS=(TextView)findViewById(R.id.textResult);
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultCOS.getText().toString();
                double d=Double.parseDouble(text);
                String s=String.valueOf(Math.cos(d));
                txtResultCOS.setText(s);
            }
        });





        Button btnBackSpace=(Button)findViewById(R.id.buttonBackSpace);
        final TextView txtResultBackSpace=(TextView)findViewById(R.id.textResult);
        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=txtResultBackSpace.getText().toString();
                if(text.length()>0)
                    txtResultBackSpace.setText(text.substring(0,text.length()-1));

            }
        });

        Button btnEqual=(Button)findViewById(R.id.buttonEqual);
        final TextView txtResultEqual=(TextView)findViewById(R.id.textResult);
        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String text=txtResultEqual.getText().toString();
                if(text.contains("+"))
                {
                    String ss[] = new String[20];
                    ss=text.split("[+]");
                    double a=0;
                    for(int i=0;i<ss.length;i++)
                    {
                        a+=Double.parseDouble(ss[i]);
                    }
                    txtResultEqual.setText(txtResultEqual.getText()+"="+a);
                }
                else if(text.contains("-"))
                {
                    String ss[] = new String[20];
                    ss=text.split("[-]");
                    double a=0;
                    for(int i=0;i<ss.length;i++)
                    {
                        a=-a-Double.parseDouble(ss[i]);
                    }
                    txtResultEqual.setText(txtResultEqual.getText()+"="+a);

                }
                else if(text.contains("*"))
                {
                    String ss[] = new String[20];
                    ss=text.split("[*]");
                    double a=Double.parseDouble(ss[0]);
                    for(int i=1;i<ss.length;i++)
                    {
                        a*=Double.parseDouble(ss[i]);
                    }
                    txtResultEqual.setText(txtResultEqual.getText()+"="+a);
                }
                else if(text.contains("/"))
                {
                    String ss[] = new String[20];
                    ss=text.split("[/]");
                    double a=Double.parseDouble(ss[0]);
                    for(int i=1;i<ss.length;i++)
                    {
                        a/=Double.parseDouble(ss[i]);
                    }
                    txtResultEqual.setText(txtResultEqual.getText()+"="+a);
                }
                else
                    txtResultEqual.setText("");

            }

        });








    }
}
