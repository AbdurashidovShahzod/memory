package uz.pdp.mymemorygame.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_puzzle.*
import uz.pdp.mymemorygame.R

class PuzzleActivity : AppCompatActivity(), Animation.AnimationListener {
    var f1 = false
    var f2 = false
    var f3 = false
    var f4 = false
    var counter = 0
    var a = 0
    var b: Boolean? = null
    var z = 0
    var j = 0
    var index1 = 0
    var index2: CountDownTimer? = null
    var t = 0
    var n = 0
    var x: ImageButton? = null
    var animation1: Animation? = null
    var animation2: Animation? = null
    var animation3: Animation? = null
    var listPhoto = listOf(
        R.drawable.ic_i1,
        R.drawable.ic_i2,
        R.drawable.ic_i3,
        R.drawable.ic_i4,
        R.drawable.ic_i5,
        R.drawable.ic_i6,
        R.drawable.ic_i01,
        R.drawable.ic_i02,
        R.drawable.ic_i03,
        R.drawable.ic_i04,
        R.drawable.ic_i05,
        R.drawable.ic_i06
    )
    private lateinit var g: List<ImageButton>
    private lateinit var array: List<ImageButton>
    private lateinit var arrayCard: List<CardView>
    private lateinit var k: List<CardView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzle)

        animation1 = AnimationUtils.loadAnimation(this, R.anim.anim1)
        animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        animation3 = AnimationUtils.loadAnimation(this, R.anim.anim3)

        animation1?.setAnimationListener(this)

        var arrayImage = listOf(
            imageM1, imageM2, imageM3, imageM4, imageM5,
            imageM6, imageM7, imageM8, imageM9, imageM10, imageM10, imageM11, imageM12
        )

        object : CountDownTimer(100000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                clockText.text = "" + millisUntilFinished / 1000
            }

            override fun onFinish() {
                clockText.text = "0"
            }

        }.start()

        arrayImage.forEachIndexed { index, imageView ->
            imageView.setOnClickListener {
                imageView.startAnimation(animation1)
                when (index) {
                    0 -> {
                        counter++
                        index1 = index
                        a++
                    }
                    1 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    2 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    3 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    4 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    5 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    6 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    7 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    8 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    9 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    10 -> {
                        index1 = index
                        a++
                        counter++
                    }
                    11 -> {
                        index1 = index
                        a++
                        counter++
                    }
                }
            }
        }


/*

        imageM1.setOnClickListener {
            imageM1.startAnimation(animation1)
            f1 = true
            counter++
        }
        imageM2.setOnClickListener {
            imageM2.startAnimation(animation1)
            f2 = true
            counter++
        }
        imageM3.setOnClickListener {
            imageM3.startAnimation(animation1)
        }
        imageM4.setOnClickListener {
            imageM4.startAnimation(animation1)

        }
        imageM5.setOnClickListener {

            imageM5.startAnimation(animation1)

        }
        imageM6.setOnClickListener {

            imageM6.startAnimation(animation1)

        }
        imageM7.setOnClickListener {

            imageM7.startAnimation(animation1)

        }
        imageM8.setOnClickListener {

            imageM8.startAnimation(animation1)

        }
        imageM9.setOnClickListener {

            imageM9.startAnimation(animation1)

        }
        imageM10.setOnClickListener {

            imageM10.startAnimation(animation1)

        }
        imageM11.setOnClickListener {
            imageM11.startAnimation(animation1)

        }
        imageM12.setOnClickListener {
            imageM12.startAnimation(animation1)

        }
*/

    }


    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        /*
        when {
            f1 -> {
                imageM1.setImageResource(R.drawable.ic_i1)
                imageM1.startAnimation(animation2)
                f1 = false
            }
            f2 -> {
                imageM2.setImageResource(R.drawable.ic_i1)
                imageM2.startAnimation(animation2)
                f2 = false
            }
            f3 -> {
                imageM3.setImageResource(R.drawable.ic_i2)
                imageM3.startAnimation(animation2)
                f3 = false
            }
            f4 -> {
                imageM4.setImageResource(R.drawable.ic_i2)
                imageM4.startAnimation(animation2)
                f4 = false
            }


        }
        */

        animation2?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {
                /*  if (counter==2)
                    if (imageM1.drawable.constantState == imageM2.drawable.constantState) {
                        card1.visibility = View.INVISIBLE
                        card2.visibility = View.INVISIBLE
                    }
                }*/
                when (index1) {
                    0 -> {
                        imageM1.setImageResource(R.drawable.ic_i1)
                        imageM1.startAnimation(animation2)
                    }
                    1 -> {
                        imageM2.setImageResource(R.drawable.ic_i2)
                        imageM2.startAnimation(animation2)
                    }
                    2 -> {
                        imageM3.setImageResource(R.drawable.ic_i3)
                        imageM3.startAnimation(animation2)
                    }
                    3 -> {
                        imageM4.setImageResource(R.drawable.ic_i4)
                        imageM4.startAnimation(animation2)
                    }
                    4 -> {
                        imageM5.setImageResource(R.drawable.ic_i5)
                        imageM5.startAnimation(animation2)
                    }
                    5 -> {
                        imageM6.setImageResource(R.drawable.ic_i1)
                        imageM6.startAnimation(animation2)
                    }
                    6 -> {
                        imageM7.setImageResource(R.drawable.ic_i3)
                        imageM7.startAnimation(animation2)
                    }
                    7 -> {
                        imageM8.setImageResource(R.drawable.ic_i2)
                        imageM8.startAnimation(animation2)
                    }
                    8 -> {
                        imageM9.setImageResource(R.drawable.ic_i5)
                        imageM9.startAnimation(animation2)
                    }
                    9 -> {
                        imageM10.setImageResource(R.drawable.ic_i4)
                        imageM10.startAnimation(animation2)
                    }
                    10 -> {
                        imageM11.setImageResource(R.drawable.ic_i6)
                        imageM11.startAnimation(animation2)
                    }
                    11 -> {
                        imageM12.setImageResource(R.drawable.ic_i6)
                        imageM12.startAnimation(animation2)
                    }
                }
                animation2?.setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationStart(p0: Animation?) {

                    }

                    override fun onAnimationEnd(p0: Animation?) {
                        if (counter == 1) {
                            z = index1
                            g = listOf(array[z])
                            k = listOf(arrayCard[z])


                        }
                        if (counter == 2) {
                            j = index1
                            if (array[z].drawable.constantState == array[j].drawable.constantState &&
                                array[z].id != array[index1].id
                            ) {
                                array[z].startAnimation(animation3)
                                array[z].visibility = View.INVISIBLE
                                arrayCard[z].visibility = View.INVISIBLE
                                array[j].startAnimation(animation3)
                                array[j].visibility = View.INVISIBLE
                                arrayCard[j].visibility = View.INVISIBLE
                                t++
                            } else if (array[z].id != array[index1].id) {
                                Thread.sleep(1000)
                                array[z].setImageResource(R.drawable.ic_light_bulb)
                                array[z].startAnimation(animation2)
                                array[j].setImageResource(R.drawable.ic_light_bulb)
                                array[j].startAnimation(animation2)
                                n++
                            } else if (array[z].id == array[index1].id) {
                                array[j].setImageResource(R.drawable.ic_light_bulb)
                                array[j].startAnimation(animation2)
                            }
                            counter = 0
                        }


                        if (clockText.text != "0") {
                            if (t == 12 && n == 0) {
                                textName.startAnimation(animation3)
                                Toast.makeText(
                                    applicationContext,
                                    "Juda zur siz hammasini bir urunishda topdingiz!",
                                    Toast.LENGTH_LONG
                                )
//                                var intent = Intent(this@PuzzleActivity, SecondActivity::class.java)
                                startActivity(intent)
                                clockText.visibility = View.INVISIBLE

                            } else if (t == 12 && n > 0) {
                                textName.startAnimation(animation3)
                                Toast.makeText(
                                    applicationContext,
                                    "Siz $n ta xato qildingiz!",
                                    Toast.LENGTH_LONG
                                )
//                                var intent = Intent(PuzzleActivity, SecondActivity::class.java)
                                startActivity(intent)
                                clockText.visibility = View.INVISIBLE

                            }
                        } else if (clockText.text == "0" && t != 12) {
                            textName.startAnimation(animation3)
                            Toast.makeText(
                                applicationContext,
                                "Istirok uchun kattaraxmat Afsuski siz yutqazdingiz!",
                                Toast.LENGTH_LONG
                            )
//                            var intent = Intent(this@MainActivity, ThreeActivity::class.java)
//                            startActivity(intent)
                        }
                    }


                    override fun onAnimationRepeat(p0: Animation?) {

                    }

                })


            }

            override fun onAnimationRepeat(p0: Animation?) {

            }

        })


    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}