package uz.pdp.mymemorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Arrays;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    TextView textView1, textView2;
    CardView cardView11, cardView12, cardView13, cardView14,
            cardView21, cardView22, cardView23, cardView24,
            cardView31, cardView32, cardView33, cardView34;
    ImageView iv_11, iv_12,
            iv_13, iv_14,
            iv_21, iv_22,
            iv_23, iv_24,
            iv_31, iv_32, iv_33,
            iv_34;
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};
    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203, image204, image205, image206;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;
    int turn1 = 1;
    int playerPoints = 0, cpuPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        getViewId();
        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");

        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");

        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        frontOfCardResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        textView2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_11, theCard);

        });
        iv_12.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_12, theCard);

        });
        iv_13.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_13, theCard);

        });
        iv_14.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_14, theCard);

        });
        iv_21.setOnClickListener(view -> {

            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_21, theCard);
        });
        iv_22.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_22, theCard);

        });
        iv_23.setOnClickListener(view -> {

            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_23, theCard);
        });
        iv_24.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_24, theCard);

        });
        iv_31.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_31, theCard);
        });
        iv_32.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_32, theCard);

        });
        iv_33.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_33, theCard);

        });
        iv_34.setOnClickListener(view -> {
            int theCard = Integer.parseInt((String) view.getTag());
            doStuff(iv_34, theCard);

        });

    }

    private void getViewId() {
        //text view
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        // buttons
        iv_11 = findViewById(R.id.Iv11);
        iv_12 = findViewById(R.id.Iv12);
        iv_13 = findViewById(R.id.iv13);
        iv_14 = findViewById(R.id.iv14);

        iv_21 = findViewById(R.id.iv_21);
        iv_22 = findViewById(R.id.iv_22);
        iv_23 = findViewById(R.id.iv_23);
        iv_24 = findViewById(R.id.iv_24);

        iv_31 = findViewById(R.id.iv_31);
        iv_32 = findViewById(R.id.iv_32);
        iv_33 = findViewById(R.id.iv_33);
        iv_34 = findViewById(R.id.iv_34);

        cardView11 = findViewById(R.id.card11);
        cardView12 = findViewById(R.id.card12);
        cardView13 = findViewById(R.id.card13);
        cardView14 = findViewById(R.id.card14);

        cardView21 = findViewById(R.id.card21);
        cardView22 = findViewById(R.id.card22);
        cardView23 = findViewById(R.id.card23);
        cardView24 = findViewById(R.id.card24);

        cardView31 = findViewById(R.id.card31);
        cardView32 = findViewById(R.id.card32);
        cardView33 = findViewById(R.id.card33);
        cardView34 = findViewById(R.id.card34);

    }

    private void doStuff(ImageView iv, int card) {

        if (cardsArray[card] == 101) {
            iv.setImageResource(image101);
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(image102);
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(image103);
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(image104);
        } else if (cardsArray[card] == 105) {
            iv.setImageResource(image105);
        } else if (cardsArray[card] == 106) {
            iv.setImageResource(image106);
        } else if (cardsArray[card] == 201) {
            iv.setImageResource(image201);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(image202);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(image203);
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(image204);
        } else if (cardsArray[card] == 205) {
            iv.setImageResource(image205);
        } else if (cardsArray[card] == 206) {
            iv.setImageResource(image206);
        }


        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;
            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            cardView11.setEnabled(false);
            iv_12.setEnabled(false);
            cardView12.setEnabled(false);
            iv_13.setEnabled(false);
            cardView13.setEnabled(false);
            iv_14.setEnabled(false);
            cardView14.setEnabled(false);
            iv_21.setEnabled(false);
            cardView21.setEnabled(false);
            iv_22.setEnabled(false);
            cardView22.setEnabled(false);
            iv_23.setEnabled(false);
            cardView23.setEnabled(false);
            iv_24.setEnabled(false);
            cardView24.setEnabled(false);
            iv_31.setEnabled(false);
            cardView31.setEnabled(false);
            iv_32.setEnabled(false);
            cardView32.setEnabled(false);
            iv_33.setEnabled(false);
            cardView33.setEnabled(false);
            iv_34.setEnabled(false);
            cardView34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 500);
        }
    }

    private void calculate() {

        if (firstCard == secondCard) {

            if (clickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
                cardView11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
                cardView12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
                cardView13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
                cardView14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                iv_21.setVisibility(View.INVISIBLE);
                cardView21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                cardView22.setVisibility(View.INVISIBLE);
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                cardView23.setVisibility(View.INVISIBLE);
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                cardView24.setVisibility(View.INVISIBLE);
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                cardView31.setVisibility(View.INVISIBLE);
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                cardView32.setVisibility(View.INVISIBLE);
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                cardView33.setVisibility(View.INVISIBLE);
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                cardView34.setVisibility(View.INVISIBLE);
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                cardView11.setVisibility(View.INVISIBLE);
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                cardView12.setVisibility(View.INVISIBLE);
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                cardView13.setVisibility(View.INVISIBLE);
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                cardView14.setVisibility(View.INVISIBLE);
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                cardView21.setVisibility(View.INVISIBLE);
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                cardView22.setVisibility(View.INVISIBLE);
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                cardView23.setVisibility(View.INVISIBLE);
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                cardView24.setVisibility(View.INVISIBLE);
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                cardView31.setVisibility(View.INVISIBLE);
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                cardView32.setVisibility(View.INVISIBLE);
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                cardView33.setVisibility(View.INVISIBLE);
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                cardView34.setVisibility(View.INVISIBLE);
                iv_34.setVisibility(View.INVISIBLE);
            }


            if (turn1 == 1) {
                playerPoints++;
                textView1.setText("S: " + playerPoints);
            } else if (turn1 == 2) {
                cpuPoints++;
                textView2.setText("C: " + cpuPoints);
            }
        } else {
            iv_11.setImageResource(R.drawable.ic_light_bulb);
            iv_12.setImageResource(R.drawable.ic_light_bulb);
            iv_13.setImageResource(R.drawable.ic_light_bulb);
            iv_14.setImageResource(R.drawable.ic_light_bulb);

            iv_21.setImageResource(R.drawable.ic_light_bulb);
            iv_22.setImageResource(R.drawable.ic_light_bulb);
            iv_23.setImageResource(R.drawable.ic_light_bulb);
            iv_24.setImageResource(R.drawable.ic_light_bulb);

            iv_31.setImageResource(R.drawable.ic_light_bulb);
            iv_32.setImageResource(R.drawable.ic_light_bulb);
            iv_33.setImageResource(R.drawable.ic_light_bulb);
            iv_34.setImageResource(R.drawable.ic_light_bulb);

            if (turn1 == 1) {
                turn1 = 2;
                textView1.setTextColor(Color.GRAY);
                textView2.setTextColor(Color.BLACK);
            } else if (turn1 == 2) {
                turn1 = 1;
                textView2.setTextColor(Color.GRAY);
                textView1.setTextColor(Color.BLACK);
            }
        }

        iv_11.setEnabled(true);
        cardView11.setEnabled(true);
        iv_12.setEnabled(true);
        cardView12.setEnabled(true);
        iv_13.setEnabled(true);
        cardView13.setEnabled(true);
        iv_14.setEnabled(true);
        cardView14.setEnabled(true);

        iv_21.setEnabled(true);
        cardView21.setEnabled(true);
        iv_22.setEnabled(true);
        cardView22.setEnabled(true);
        iv_23.setEnabled(true);
        cardView23.setEnabled(true);
        iv_24.setEnabled(true);
        cardView24.setEnabled(true);

        iv_31.setEnabled(true);
        cardView31.setEnabled(true);
        iv_32.setEnabled(true);
        cardView32.setEnabled(true);
        iv_33.setEnabled(true);
        cardView33.setEnabled(true);
        iv_34.setEnabled(true);
        cardView34.setEnabled(true);
        checked();
    }

    private void checked() {

        if ((iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&

                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&

                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE) &&

                cardView11.getVisibility() == View.INVISIBLE &&
                cardView12.getVisibility() == View.INVISIBLE &&
                cardView13.getVisibility() == View.INVISIBLE &&
                cardView14.getVisibility() == View.INVISIBLE &&

                cardView21.getVisibility() == View.INVISIBLE &&
                cardView22.getVisibility() == View.INVISIBLE &&
                cardView23.getVisibility() == View.INVISIBLE &&
                cardView24.getVisibility() == View.INVISIBLE &&

                cardView31.getVisibility() == View.INVISIBLE &&
                cardView32.getVisibility() == View.INVISIBLE &&
                cardView33.getVisibility() == View.INVISIBLE &&
                cardView34.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialog = new AlertDialog.Builder(GameActivity.this);
            alertDialog.setMessage("Afsuski yutqazdingiz:\nP1: " + playerPoints + "\nP2: " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("Yangi", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(getApplicationContext(), GameActivity.class));
                            finish();
                        }
                    }).setNegativeButton("Chiqish", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            AlertDialog alertDialog1 = alertDialog.create();
            alertDialog1.show();
        }
    }

    private void frontOfCardResources() {
        image101 = R.drawable.ic_i1;
        image102 = R.drawable.ic_i2;
        image103 = R.drawable.ic_i3;
        image104 = R.drawable.ic_i4;
        image105 = R.drawable.ic_i5;
        image106 = R.drawable.ic_i6;
        image201 = R.drawable.ic_i01;
        image202 = R.drawable.ic_i02;
        image203 = R.drawable.ic_i03;
        image204 = R.drawable.ic_i04;
        image205 = R.drawable.ic_i05;
        image206 = R.drawable.ic_i06;
    }

}
