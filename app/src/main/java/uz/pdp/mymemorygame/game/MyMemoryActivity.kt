package uz.pdp.mymemorygame.game

import android.os.Bundle
import uz.pdp.mymemorygame.R
import android.content.Intent
import android.os.CountDownTimer
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_my_memory.*
import kotlinx.android.synthetic.main.activity_puzzle.*

class MyMemoryActivity : AppCompatActivity(), Animation.AnimationListener {
    var anim1: Animation? = null
    var anim2: Animation? = null
    var anim3: Animation? = null
    var index1 = 0
    var index2: CountDownTimer? = null
    var a = 0
    var b: Boolean? = null
    var z = 0
    var j = 0
    var t = 0
    var n = 0
    var count = 0
    var x: ImageButton? = null
    private lateinit var g: List<ImageButton>

    private var image = listOf(
        R.drawable.ic_i1, R.drawable.ic_i2, R.drawable.ic_i3,
        R.drawable.ic_i4, R.drawable.ic_i5, R.drawable.ic_i6
    )

    private lateinit var array: List<ImageButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_memory)

        anim1 = AnimationUtils.loadAnimation(this, R.anim.anim1)
        anim2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        anim3 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        anim1?.setAnimationListener(this)

        array = listOf(
            imageButton1, imageButton2, imageButton3, imageButton4,
            imageButton5, imageButton6, imageButton7, imageButton8,
            imageButton9, imageButton10, imageButton11, imageButton12
        )


        object : CountDownTimer(100000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countDown.text = "" + millisUntilFinished / 1000
            }

            override fun onFinish() {
                countDown.text = "0"
            }

        }.start()

        array.forEachIndexed { index, imageButton ->
            imageButton.setOnClickListener {
                imageButton.startAnimation(anim1)
                when (index) {
                    0 -> {
                        count++
                        index1 = index
                        a++
                    }
                    1 -> {
                        index1 = index
                        a++
                        count++
                    }
                    2 -> {
                        index1 = index
                        count++
                        a++
                    }
                    3 -> {
                        index1 = index
                        count++
                        a++
                    }
                    4 -> {
                        index1 = index
                        count++
                        a++
                    }
                    5 -> {
                        a++
                        count++
                        index1 = index
                    }
                    6 -> {
                        index1 = index
                        count++
                        a++
                    }
                    7 -> {
                        index1 = index
                        count++
                        a++
                    }
                    8 -> {
                        index1 = index
                        count++
                        a++
                    }
                    9 -> {
                        index1 = index
                        count++
                        a++
                    }
                    10 -> {
                        index1 = index
                        count++
                        a++
                    }
                    11 -> {
                        index1 = index
                        count++
                        a++
                    }

                }
            }
        }

    }

    override fun onAnimationStart(animation: Animation?) {

    }

    override fun onAnimationEnd(animation: Animation?) {
        when (index1) {
            0 -> {
                imageButton1.setImageResource(R.drawable.ic_i1)
                imageButton1.startAnimation(anim2)
            }
            1 -> {
                imageButton2.setImageResource(R.drawable.ic_i2)
                imageButton2.startAnimation(anim2)
            }
            2 -> {
                imageButton3.setImageResource(R.drawable.ic_i3)
                imageButton3.startAnimation(anim2)
            }
            3 -> {
                imageButton4.setImageResource(R.drawable.ic_i4)
                imageButton4.startAnimation(anim2)
            }
            4 -> {
                imageButton5.setImageResource(R.drawable.ic_i5)
                imageButton5.startAnimation(anim2)
            }
            5 -> {
                imageButton6.setImageResource(R.drawable.ic_i1)
                imageButton6.startAnimation(anim2)
            }
            6 -> {
                imageButton7.setImageResource(R.drawable.ic_i3)
                imageButton7.startAnimation(anim2)
            }
            7 -> {
                imageButton8.setImageResource(R.drawable.ic_i2)
                imageButton8.startAnimation(anim2)
            }
            8 -> {
                imageButton9.setImageResource(R.drawable.ic_i5)
                imageButton9.startAnimation(anim2)
            }
            9 -> {
                imageButton10.setImageResource(R.drawable.ic_i4)
                imageButton10.startAnimation(anim2)
            }
            10 -> {
                imageButton11.setImageResource(R.drawable.ic_i6)
                imageButton11.startAnimation(anim2)
            }
            11 -> {
                imageButton12.setImageResource(R.drawable.ic_i6)
                imageButton12.startAnimation(anim2)
            }

        }

        anim2?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                if (count == 1) {
                    z = index1
                    g = listOf(array[z])
                }
                if (count == 2) {
                    j = index1
                    if (array[z].drawable.constantState == array[j].drawable.constantState &&
                        array[z].id != array[index1].id
                    ) {
                        array[z].startAnimation(anim3)
                        array[z].visibility = View.INVISIBLE
                        array[j].startAnimation(anim3)
                        array[j].visibility = View.INVISIBLE
                        t++
                    } else if (array[z].id != array[index1].id) {
                        Thread.sleep(400)
                        array[z].setImageResource(R.drawable.ic_light_bulb)
                        array[z].startAnimation(anim2)
                        array[j].setImageResource(R.drawable.ic_light_bulb)
                        array[j].startAnimation(anim2)
                        n++
                    } else if (array[z].id == array[index1].id) {
                        array[j].setImageResource(R.drawable.ic_light_bulb)
                        array[j].startAnimation(anim2)
                    }
                    count = 0
                }


                if (countDown.text != "0") {
                    if (t == 12 && n == 0) {
                        firstText.startAnimation(anim3)
                        Toast.makeText(
                            applicationContext,
                            "Juda zur siz hammasini bir urunishda topdingiz!",
                            Toast.LENGTH_LONG
                        )
                        var intent = Intent(this@MyMemoryActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
//                        text2.visibility = View.INVISIBLE
                    } else if (t == 12 && n > 0) {
                        firstText.startAnimation(anim3)
                        Toast.makeText(
                            applicationContext,
                            "Siz $n ta xato qildingiz!",
                            Toast.LENGTH_LONG
                        )
                        var intent = Intent(this@MyMemoryActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
                        countDown.visibility = View.INVISIBLE
//                        image3.visibility = View.INVISIBLE

                    }
                } else if (countDown.text == "0" && t != 12) {
                    textName.startAnimation(anim3)
                    Toast.makeText(
                        applicationContext,
                        "Istirok uchun kattaraxmat Afsuski siz yutqazdingiz!",
                        Toast.LENGTH_LONG
                    )
                    var intent = Intent(this@MyMemoryActivity, ThreeMemoryActivity::class.java)
                    startActivity(intent)
                }
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
    }

    override fun onAnimationRepeat(animation: Animation?) {

    }
}
