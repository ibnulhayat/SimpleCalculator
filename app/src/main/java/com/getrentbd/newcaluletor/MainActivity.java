package com.getrentbd.newcaluletor;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.math.BigDecimal;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private final String TAG = "MainActivity ";
    private DrawerLayout drawerLayout;


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bpi, bequal, bplus, bmin, bdiv, binv, bsqrt, bmul, bsquare, bfact, bln, blog, btan, bcos, bsin, bb1, bb2, bc, bac, bperce;
    TextView tvmain, tvsec;
    String pi = "3.14159265";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.Open_Drawer, R.string.Open_Drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bminus);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);
        bperce = findViewById(R.id.bperce);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "1");
                } catch (Exception e) {
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "2");
                } catch (Exception e) {
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "3");
                } catch (Exception e) {
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "4");
                } catch (Exception e) {
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "5");
                } catch (Exception e) {
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "6");
                } catch (Exception e) {
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "7");
                } catch (Exception e) {
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "8");
                } catch (Exception e) {
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "9");
                } catch (Exception e) {
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "0");
                } catch (Exception e) {
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int length = tvmain.getText().toString().trim().length();
                    if (length > 0) {
                        String text = tvmain.getText().toString();
                        if (!text.contains("."))
                            tvmain.setText(tvmain.getText() + ".");
                    } else tvmain.setText(tvmain.getText() + "0.");
                } catch (Exception e) {
                }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText("");
                    tvsec.setText("");
                } catch (Exception e) {
                }
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = tvmain.getText().toString();
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                } catch (Exception e) {
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperand("+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperand("-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperand("×");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperand("÷");
            }
        });
        bperce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addOperand("%");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "0");
                } catch (Exception e) {
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = tvmain.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(val));
                    String result = String.valueOf(r);
                    if (result.contains(".")) {
                        result = result.replaceAll("\\.?0*$", "");
                    }
                    tvmain.setText(result);
                } catch (Exception e) {
                }
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "(");
                } catch (Exception e) {
                }
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + ")");
                } catch (Exception e) {
                }
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int length = tvmain.getText().toString().length();
                    if (length > 0) {
                        String text = tvmain.getText().toString();
                        if (!text.contains(pi) && defineLastCharacter(text.charAt(length - 1) + ""))
                            tvmain.setText(tvmain.getText() + "×" + pi);
                    } else {
                        tvsec.setText(bpi.getText());
                        tvmain.setText(tvmain.getText() + pi);
                    }
                } catch (Exception e) {
                }
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "sin(");
                } catch (Exception e) {
                }
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "cos(");
                } catch (Exception e) {
                }
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "tan(");
                } catch (Exception e) {
                }
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "1" + "÷");
                } catch (Exception e) {
                }
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!tvmain.getText().toString().isEmpty())
                        addOperand("!");
                } catch (Exception e) {
                }
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String text = tvmain.getText().toString();
//                    double d = Double.parseDouble(tvmain.getText().toString());
//                    double square = d * d;
//                    String result = String.valueOf(square);
//                    if (result.contains(".")) {
//                        result = result.replaceAll("\\.?0*$", "");
//                    }
                    tvmain.setText(text + "²");
//                    tvsec.setText(d + "²");
                } catch (Exception e) {
                }
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "ln(");
                } catch (Exception e) {
                }
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tvmain.setText(tvmain.getText() + "log(");
                } catch (Exception e) {
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = tvmain.getText().toString();
                    boolean cash = false;
                    if(val.contains("!")){
                        tvsec.setText(val);
                        val = addFact(val);
                        cash = true;
                    }
                    if(val.contains("²")){
                        tvsec.setText(val);
                        val = addPow(val);
                        cash = true;
                    }
                    String replacedstr = val.replace('÷', '/').replace('×', '*').replaceAll("%", "/100");
                    double total = eval(replacedstr);
                    BigDecimal decimal = new BigDecimal(total);
                    String result = decimal.setScale(8, BigDecimal.ROUND_HALF_UP).toPlainString();
                    if (result.contains(".")) {
                        result = result.replaceAll("\\.?0*$", "");
                    }
                    tvmain.setText(result);
                    if (!cash) tvsec.setText(val);
                } catch (Exception e) {
                }
            }
        });
    }

    private String addFact(String str) {
        String num = "";
        StringBuilder stBui = new StringBuilder();
        for(int i = 0; i< str.length(); i++){
            if (str.charAt(i) == '!') stBui.append(factorial(Integer.parseInt(num)));
            else if(str.charAt(i) == '+' || str.charAt(i) == '-' ||  str.charAt(i) == '÷' ||  str.charAt(i) == '×'){
                stBui.append(str.charAt(i));
                num = "";
            }else num += str.charAt(i);
        }
        return  stBui.toString();
    }

    private String addPow(String str) {
        String num = "";
        StringBuilder stBui = new StringBuilder();
        for(int i = 0; i< str.length(); i++){
            if (str.charAt(i) == '²') stBui.append((Integer.parseInt(num) * Integer.parseInt(num)));
            else if(str.charAt(i) == '+' || str.charAt(i) == '-' ||  str.charAt(i) == '÷' ||  str.charAt(i) == '×'){
                stBui.append(str.charAt(i));
                num = "";
            }else num += str.charAt(i);
        }
        return  stBui.toString();
    }

    private boolean addOperand(String operand) {
        boolean done = false;
        int operationLength = tvmain.getText().length();
        if (operationLength > 0) {
            String lastInput = tvmain.getText().charAt(operationLength - 1) + "";

            if ((lastInput.equals(operand) || lastInput.equals("-") || lastInput.equals("×") || lastInput.equals("÷") || lastInput.equals("+"))) {
                Toast.makeText(getApplicationContext(), "Wrong format", Toast.LENGTH_LONG).show();
            } else if (operand.equals("%") && defineLastCharacter(lastInput)) {
                tvmain.setText(tvmain.getText().toString().concat(operand));
                done = true;
            } else if (!operand.equals("%")) {
                tvmain.setText(tvmain.getText().toString().concat(operand));
                done = true;
            }
        } else if (operand.equals("-")) {
            tvmain.setText(operand);
            done = true;
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Format. Operand Without any numbers?", Toast.LENGTH_LONG).show();
        }
        return done;
    }

    private boolean defineLastCharacter(String lastCharacter) {
        try {
            Integer.parseInt(lastCharacter);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_youtube:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
                startActivity(intent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //factorial function
    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    //eval function
    public static double eval(final String str) {
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

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            // | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
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
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation "²"

                return x;
            }
        }.parse();
    }
}