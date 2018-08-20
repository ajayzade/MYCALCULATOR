package com.example.lenovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdot,bequal,bclear,bdelete,bsq,broot,bsin,bcos,btan,blog,bln,bex,bindeg,bfact;
    TextView result,label;
    Double var1,var2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        b3 = (Button)findViewById(R.id.btn3);
        b4 = (Button)findViewById(R.id.btn4);
        b5 = (Button)findViewById(R.id.btn5);
        b6 = (Button)findViewById(R.id.btn6);
        b7 = (Button)findViewById(R.id.btn7);
        b8 = (Button)findViewById(R.id.btn8);
        b9 = (Button)findViewById(R.id.btn9);
        b0 = (Button)findViewById(R.id.btn0);
        bdot = (Button)findViewById(R.id.btndot);
        badd = (Button)findViewById(R.id.btnadd);
        bsub = (Button)findViewById(R.id.btnsub);
        bmul = (Button)findViewById(R.id.btnmul);
        bdiv = (Button)findViewById(R.id.btndiv);
        bequal = (Button)findViewById(R.id.btnequal);
        bclear = (Button)findViewById(R.id.btnclear);
        bdelete = (Button)findViewById(R.id.btnDel);
        bsq = (Button)findViewById(R.id.btnsq);
        broot = (Button)findViewById(R.id.btnroot);
        bsin = (Button)findViewById(R.id.btnsin);
        bcos = (Button)findViewById(R.id.btncos);
        btan = (Button)findViewById(R.id.btntan);
        blog = (Button)findViewById(R.id.btnlog);
        bln = (Button)findViewById(R.id.btnln);
        bex = (Button)findViewById(R.id.btnex);
        bindeg = (Button)findViewById(R.id.btndeg);
        bfact = (Button)findViewById(R.id.btnfact);

        result = (TextView)findViewById(R.id.display);
        label = (TextView) findViewById(R.id.label);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText(result.getText() + " +");
                var1 = Double.parseDouble(result.getText()+"");
                add = true;
                result.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText(result.getText() + " -");
                var1 = Double.parseDouble(result.getText()+"");
                sub = true;
                result.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText(result.getText() + " *");
                var1 = Double.parseDouble(result.getText()+"");
                mul = true;
                result.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText(result.getText() + " /");
                var1 = Double.parseDouble(result.getText()+"");
                div = true;
                result.setText(null);
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");label.setText("");
            }
        });
        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = result.getText().toString();
                if(value.length()>0) {
                    value = value.substring(0, value.length() - 1);
                    result.setText(value);
                }
                label.setText("");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(result.getText()+"");
                label.setText("");
                if(add == true){
                    result.setText(var1 + var2 + "");
                    add = false;
                }
                if(sub == true){
                    result.setText(var1 - var2 + "");
                    sub = false;
                }
                if(mul == true){
                    result.setText(var1 * var2 + "");
                    mul = false;
                }
                if(div == true){
                    result.setText(var1 / var2 + "");
                    div = false;
                }
            }
        });

        bsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("sq("+result.getText()+")");
                Double n;
                n = Double.parseDouble(result.getText()+"");
                result.setText(n*n+"");
            }
        });

        broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("sqroot("+result.getText()+")");
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = Math.sqrt(n);
                result.setText(m+"");
            }
        });

       bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("sin("+result.getText()+")");
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = Math.sin(n);
                result.setText(m+"");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("cos("+result.getText()+")");
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = Math.cos(n);
                result.setText(m+"");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("tan("+result.getText()+")");
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = Math.tan(n);
                result.setText(m+"");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("log("+result.getText()+")");
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = Math.log10(n);
                result.setText(m+"");
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("ln("+result.getText()+")");
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = Math.log(n);
                result.setText(m+"");
            }
        });

        bex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("ex("+result.getText()+")");
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = Math.exp(n);
                result.setText(m+"");
            }
        });

        bindeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = (n*180)/3.143;
                result.setText(m+"");
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n,m;
                n = Double.parseDouble(result.getText()+"");
                m = (n*3.143)/180;
                result.setText(m+"");
            }
        });

    }
}
