package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button acbtn,cbtn,brc1,brc2,sinbtn,cosbtn,tanbtn,logbtn,lnbtn,factbtn,sqrbtn,rootbtn,invsbtn,mulbtn;
    Button divbtn,seven,eight,nine,four,five,six,minusbtn,one,two,three,plusbtn,piebtn,zero,dotbtn,equalbtn;
    TextView tvsec,tvmain;
    String pi="3.14159265359";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acbtn =findViewById(R.id.acbtn);
        cbtn =findViewById(R.id.cbtn);
        brc1 =findViewById(R.id.brc1);
        brc2 =findViewById(R.id.brc2);
        sinbtn =findViewById(R.id.sinbtn);
        cosbtn =findViewById(R.id.cosbtn);
        tanbtn =findViewById(R.id.tanbtn);
        logbtn =findViewById(R.id.logbtn);
        lnbtn =findViewById(R.id.lnbtn);
        factbtn =findViewById(R.id.factbtn);
        sqrbtn =findViewById(R.id.sqrbtn);
        rootbtn =findViewById(R.id.rootbtn);
        invsbtn =findViewById(R.id.invsbtn);
        mulbtn =findViewById(R.id.mulbtn);
        divbtn =findViewById(R.id.divbtn);
        seven =findViewById(R.id.seven);
        eight =findViewById(R.id.eight);
        nine =findViewById(R.id.nine);
        four =findViewById(R.id.four);
        five =findViewById(R.id.five);
        six =findViewById(R.id.six);
        minusbtn =findViewById(R.id.minusbtn);
        one =findViewById(R.id.one);
        two =findViewById(R.id.two);
        three =findViewById(R.id.three);
        plusbtn =findViewById(R.id.plusbtn);
        piebtn =findViewById(R.id.piebtn);
        zero =findViewById(R.id.zero);
        dotbtn =findViewById(R.id.dotbtn);
        equalbtn =findViewById(R.id.equalbtn);
        tvmain =findViewById(R.id.tvmain);
        tvsec =findViewById(R.id.tvsec);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"9");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"0");

            }
        });
        dotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+".");

            }
        });
        acbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");

            }
        });
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String val=tvmain.getText().toString();
               val=val.substring(0,val.length()-1);
               tvmain.setText(val);

            }
        });
        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"+");

            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"-");

            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"×");

            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"÷");

            }
        });
        rootbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=tvmain.getText().toString();
                double r=Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));

            }
        });
        brc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");

            }
        });
        brc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");

            }
        });
        piebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(piebtn.getText());
                tvmain.setText(tvmain.getText()+pi);

            }
        });
        sinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"sin");

            }
        });
        cosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"cos");

            }
        });
        tanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"tan");

            }
        });
        invsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"^"+"(-1)");

            }
        });
        factbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(tvmain.getText().toString());
                int factorial=fact(val);
                tvmain.setText(String.valueOf(factorial));
                tvsec.setText(val+"!");
            }
        });
        sqrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d=Double.parseDouble(tvmain.getText().toString());
                double sqr= d*d;
                tvmain.setText(String.valueOf(sqr));
                tvsec.setText(d+"²");
            }
        });
        lnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"ln");

            }
        });
        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"log");

            }
        });
        equalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=tvmain.getText().toString();
                String changestr=val.replace('÷','/').replace('×','*');
                double result=equal(changestr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);

            }
        });
    }

    //Logic for factorial x!
    int fact(int n)
    {
        return (n==1 || n==0) ? 1:n*fact(n-1);
    }

    //Logic for Equal button and for all other scientific math

    public static double equal(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;

            }
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }
}