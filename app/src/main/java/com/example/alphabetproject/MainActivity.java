package com.example.alphabetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private Button btnA;
//    private Button btnB;
//    private Button btnC;
//    private Button btnD;
//    private Button btnE;
//    private Button btnF;
//    private Button btnG;
//    private Button btnH;
//    private Button btnI;
//    private Button btnJ;
//    private Button btnK;
//    private Button btnL;
//    private Button btnM;
//    private Button btnN;
//    private Button btnO;
//    private Button btnP;
//    private Button btnQ;
//    private Button btnR;
//    private Button btnS;
//    private Button btnT;
//    private Button btnU;
//    private Button btnV;
//    private Button btnW;
//    private Button btnX;
//    private Button btnY;
//    private Button btnZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // binding
//        btnA = findViewById(R.id.btnA);
//        btnB = findViewById(R.id.btnB);
//        btnC = findViewById(R.id.btnC);
//        btnD = findViewById(R.id.btnD);
//        btnE = findViewById(R.id.btnE);
//        btnF = findViewById(R.id.btnF);
//        btnG = findViewById(R.id.btnG);
//        btnH = findViewById(R.id.btnH);
//        btnI = findViewById(R.id.btnI);
//        btnJ = findViewById(R.id.btnJ);
//        btnK = findViewById(R.id.btnK);
//        btnL = findViewById(R.id.btnL);
//        btnM = findViewById(R.id.btnM);
//        btnN = findViewById(R.id.btnN);
//        btnO = findViewById(R.id.btnO);
//        btnP = findViewById(R.id.btnP);
//        btnQ = findViewById(R.id.btnQ);
//        btnR = findViewById(R.id.btnR);
//        btnS = findViewById(R.id.btnS);
//        btnT = findViewById(R.id.btnT);
//        btnU = findViewById(R.id.btnU);
//        btnV = findViewById(R.id.btnV);
//        btnW = findViewById(R.id.btnW);
//        btnX = findViewById(R.id.btnX);
//        btnY = findViewById(R.id.btnY);
//        btnZ = findViewById(R.id.btnZ);



        // create an array of buttons
        int buttons[] = {R.id.btnA,R.id.btnB,R.id.btnC,R.id.btnD,R.id.btnE,R.id.btnF,R.id.btnG,R.id.btnH,R.id.btnI,R.id.btnJ,R.id.btnK,R.id.btnL,R.id.btnM,R.id.btnN,R.id.btnO,R.id.btnP,R.id.btnQ,R.id.btnR,R.id.btnS,R.id.btnT,R.id.btnU,R.id.btnV,R.id.btnW,R.id.btnX,R.id.btnY,R.id.btnZ};

        for (int i = 0; i < buttons.length; i++) {
            findViewById(buttons[i]).setOnClickListener(this);
        }






//        btnA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnA.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnD.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnD.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnH.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnH.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnJ.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnJ.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnK.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnK.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnL.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnO.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnO.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnQ.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnQ.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnS.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnS.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnU.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnU.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnW.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnW.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnX.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnX.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });
//        btnZ.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String letter = btnZ.getText().toString();
//                Intent intent = new Intent(MainActivity.this, LetterActivity.class);
//                intent.putExtra("letter", letter);
//                startActivity(intent);
//            }
//        });

    }

@Override
public void onClick(View view) {
        Button btn = (Button) view;
        String letter = btn.getText().toString();
        Intent intent = new Intent(MainActivity.this, LetterActivity.class);
        intent.putExtra("letter", letter);
        startActivity(intent);
}

}