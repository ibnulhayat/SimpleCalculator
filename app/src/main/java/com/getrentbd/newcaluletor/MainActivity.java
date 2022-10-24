package com.getrentbd.newcaluletor;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private final String TAG = "MainActivity ";
    private DrawerLayout drawerLayout;


//    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bpi, bequal, bplus, bmin, bdiv, binv, bsqrt, bmul, bsquare, bfact, bln, blog, btan, bcos, bsin, bb1, bb2, bc, bac;
//    TextView tvmain, tvsec;
//    String pi = "3.14159265";
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.Open_Drawer, R.string.Open_Drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

//
//        b1 = findViewById(R.id.b1);
//        b2 = findViewById(R.id.b2);
//        b3 = findViewById(R.id.b3);
//        b4 = findViewById(R.id.b4);
//        b5 = findViewById(R.id.b5);
//        b6 = findViewById(R.id.b6);
//        b7 = findViewById(R.id.b7);
//        b8 = findViewById(R.id.b8);
//        b9 = findViewById(R.id.b9);
//        b0 = findViewById(R.id.b0);
//        bpi = findViewById(R.id.bpi);
//        bdot = findViewById(R.id.bdot);
//        bequal = findViewById(R.id.bequal);
//        bplus = findViewById(R.id.bplus);
//        bmin = findViewById(R.id.bmin);
//        bmul = findViewById(R.id.bmul);
//        bdiv = findViewById(R.id.bdiv);
//        binv = findViewById(R.id.binv);
//        bsqrt = findViewById(R.id.bsqrt);
//        bsquare = findViewById(R.id.bsquare);
//        bfact = findViewById(R.id.bfact);
//        bln = findViewById(R.id.bln);
//        blog = findViewById(R.id.blog);
//        btan = findViewById(R.id.btan);
//        bsin = findViewById(R.id.bsin);
//        bcos = findViewById(R.id.bcos);
//        bb1 = findViewById(R.id.bb1);
//        bb2 = findViewById(R.id.bb2);
//        bc = findViewById(R.id.bc);
//        bac = findViewById(R.id.bac);
//
//        tvmain = findViewById(R.id.tvmain);
//        tvsec = findViewById(R.id.tvsec);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "1");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "2");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "3");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "4");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "5");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "6");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "7");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "8");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "9");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "0");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bdot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + ".");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bac.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText("");
//                    tvsec.setText("");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    String val = tvmain.getText().toString();
//                    val = val.substring(0, val.length() - 1);
//                    tvmain.setText(val);
//                } catch (Exception e) {
//                }
//            }
//        });
//        bplus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "+");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bmin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "-");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bmul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "×");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bdiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "÷");
//                } catch (Exception e) {
//                }
//            }
//        });
//        b0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "0");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bsqrt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    String val = tvmain.getText().toString();
//                    double r = Math.sqrt(Double.parseDouble(val));
//                    tvmain.setText(String.valueOf(r));
//                } catch (Exception e) {
//                }
//            }
//        });
//        bb1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "(");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bb2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + ")");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bpi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvsec.setText(bpi.getText());
//                    tvmain.setText(tvmain.getText() + pi);
//                } catch (Exception e) {
//                }
//            }
//        });
//        bsin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "sin");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bcos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "cos");
//                } catch (Exception e) {
//                }
//            }
//        });
//        btan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "tan");
//                } catch (Exception e) {
//                }
//            }
//        });
//        binv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "1" + "÷");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bfact.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    int val = Integer.parseInt(tvmain.getText().toString());
//                    int fact = factorial(val);
//                    tvmain.setText(String.valueOf(fact));
//                    tvsec.setText(val + "!");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bsquare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    double d = Double.parseDouble(tvmain.getText().toString());
//                    double square = d * d;
//                    tvmain.setText(String.valueOf(square));
//                    tvsec.setText(d + "²");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bln.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "ln");
//                } catch (Exception e) {
//                }
//            }
//        });
//        blog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    tvmain.setText(tvmain.getText() + "log");
//                } catch (Exception e) {
//                }
//            }
//        });
//        bequal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    String val = tvmain.getText().toString();
//                    String replacedstr = val.replace('÷', '/').replace('×', '*');
//                    double result = eval(replacedstr);
//                    tvmain.setText(String.valueOf(result));
//                    tvsec.setText(val);
//                } catch (Exception e) {
//                }
//            }
//        });
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

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}