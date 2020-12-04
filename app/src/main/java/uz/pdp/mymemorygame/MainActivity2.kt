package uz.pdp.mymemorygame

import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.Image
import android.media.ImageReader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.view.isEmpty

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.io.File
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity(),Animation.AnimationListener {
    var anim1:Animation?=null
    var anim2:Animation?=null
    var anim3:Animation?=null
    var index1=0
    var index2:CountDownTimer?=null
    var a=0
    var b:Boolean?=null
    var z=0
    var j=0
    var t=0
    var n=0
    var count=0
    var x:ImageButton?=null
    private lateinit var g:List<ImageButton>

    private var image = listOf(R.drawable.ic_family,R.drawable.ic_dog,R.drawable.ic_cat,
        R.drawable.ic_car,R.drawable.ic_group,R.drawable.ic_happiness,R.drawable.ic_hourglass,
        R.drawable.ic_music,R.drawable.ic_soundcloud,R.drawable.ic_coderwall,R.drawable.ic_fast_food,
        R.drawable.ic_couple)

    private lateinit var array:List<ImageButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        anim1=AnimationUtils.loadAnimation(this,R.anim.animation1)
        anim2=AnimationUtils.loadAnimation(this,R.anim.anim2)
        anim3=AnimationUtils.loadAnimation(this,R.anim.anim3)
        anim1?.setAnimationListener(this)

        array = listOf(button1,button2,button3,button4,
            button5,button6,button7,button8,button9,
            button10,button11,button12,button13,button14,
            button15,button16,button17,button18,button19,
            button20,button21,button22,button23,button24)


        object:CountDownTimer(60000,1000){
            override fun onTick(millisUntilFinished: Long) {
                text2.text=""+millisUntilFinished / 1000
            }
            override fun onFinish() {
                text2.text="0"
            }

        }.start()

        a.forEachIndexed { index, imageButton ->
            imageButton.setOnClickListener {
                imageButton.startAnimation(anim1)
                when(index){
                    0->{
                        count++
                        index1=index
                        a++
                    }
                    1->{
                        index1=index
                        a++
                        count++
                    }
                    2->{
                        index1=index
                        count++
                        a++
                    }
                    3->{
                        index1=index
                        count++
                        a++
                    }
                    4->{
                        index1=index
                        count++
                        a++
                    }
                    5->{
                        a++
                        count++
                        index1=index
                    }
                    6->{
                        index1=index
                        count++
                        a++
                    }
                    7->{
                        index1=index
                        count++
                        a++
                    }
                    8->{
                        index1=index
                        count++
                        a++
                    }
                    9->{
                        index1=index
                        count++
                        a++
                    }
                    10->{
                        index1=index
                        count++
                        a++
                    }
                    11->{
                        index1=index
                        count++
                        a++
                    }
                    12->{
                        a++
                        index1=index
                        count++
                    }
                    13->{
                        index1=index
                        count++
                        a++
                    }
                    14->{
                        index1=index
                        count++
                        a++
                    }
                    15->{
                        a++
                        index1=index
                        count++
                    }
                    16->{
                        index1=index
                        count++
                        a++
                    }
                    17->{
                        index1=index
                        count++
                        a++
                    }
                    18->{
                        index1=index
                        count++
                        a++
                    }
                    19->{
                        index1=index
                        count++
                        a++
                    }
                    20->{
                        index1=index
                        count++
                        a++
                    }
                    21->{
                        index1=index
                        count++
                        a++
                    }
                    22->{
                        index1=index
                        count++
                        a++
                    }
                    23->{
                        a++
                        index1=index
                        count++
                    }
                }
            }
        }

    }

    override fun onAnimationStart(animation: Animation?) {

    }

    override fun onAnimationEnd(animation: Animation?) {
        when(index1){
            0->{
                button1.setImageResource(ic_family)
                button1.startAnimation(anim2)
            }
            1->{
                button2.setImageResource(R.drawable.ic_dog)
                button2.startAnimation(anim2)
            }
            2->{
                button3.setImageResource(R.drawable.ic_cat)
                button3.startAnimation(anim2)
            }
            3->{
                button4.setImageResource(R.drawable.ic_car)
                button4.startAnimation(anim2)
            }
            4->{
                button5.setImageResource(R.drawable.ic_group)
                button5.startAnimation(anim2)
            }
            5->{
                button6.setImageResource(ic_family)
                button6.startAnimation(anim2)
            }
            6->{
                button7.setImageResource(R.drawable.ic_cat)
                button7.startAnimation(anim2)
            }
            7->{
                button8.setImageResource(R.drawable.ic_dog)
                button8.startAnimation(anim2)
            }
            8->{
                button9.setImageResource(R.drawable.ic_group)
                button9.startAnimation(anim2)
            }
            9->{
                button10.setImageResource(R.drawable.ic_car)

                button10.startAnimation(anim2)
            }
            10->{
                button11.setImageResource(R.drawable.ic_happiness)

                button11.startAnimation(anim2)
            }
            11->{
                button12.setImageResource(R.drawable.ic_happiness)

                button12.startAnimation(anim2)
            }
            12->{
                button13.setImageResource(R.drawable.ic_hourglass)
                button13.startAnimation(anim2)
            }
            13->{
                button14.setImageResource(R.drawable.ic_music)
                button14.startAnimation(anim2)
            }
            14->{
                button15.setImageResource(R.drawable.ic_soundcloud)
                button15.startAnimation(anim2)
            }
            15->{
                button16.setImageResource(R.drawable.ic_hourglass)
                button16.startAnimation(anim2)
            }
            16->{
                button17.setImageResource(R.drawable.ic_soundcloud)
                button17.startAnimation(anim2)
            }
            17->{
                button18.setImageResource(R.drawable.ic_music)
                button18.startAnimation(anim2)
            }
            18->{
                button19.setImageResource(R.drawable.ic_coderwall)
                button19.startAnimation(anim2)
            }
            19->{
                button20.setImageResource(R.drawable.ic_couple)
                button20.startAnimation(anim2)
            }
            20->{
                button21.setImageResource(R.drawable.ic_couple)
                button21.startAnimation(anim2)
            }
            21->{
                button22.setImageResource(R.drawable.ic_coderwall)
                button22.startAnimation(anim2)
            }
            22->{
                button23.setImageResource(R.drawable.ic_fast_food)
                button23.startAnimation(anim2)
            }
            23->{
                button24.setImageResource(R.drawable.ic_fast_food)
                button24.startAnimation(anim2)
            }
        }

        anim2?.setAnimationListener(object:Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }
            override fun onAnimationEnd(animation: Animation?) {
                if (count==1){
                    z=index1
                    g= listOf(array[z])
                }
                if (count==2) {
                    j=index1
                    if (array[z].drawable.constantState == array[j].drawable.constantState &&
                        array[z].id != array[index1].id) {
                        array[z].startAnimation(anim3)
                        array[z].visibility = View.INVISIBLE
                        array[j].startAnimation(anim3)
                        array[j].visibility = View.INVISIBLE
                        t++
                    } else if(array[z].id!=array[index1].id){
                        Thread.sleep(200)
                        array[z].setImageResource(R.drawable.ic_favourites)
                        array[z].startAnimation(anim2)
                        array[j].setImageResource(R.drawable.ic_favourites)
                        array[j].startAnimation(anim2)
                        n++
                    }else if(array[z].id==array[index1].id){
                        array[j].setImageResource(R.drawable.ic_favourites)
                        array[j].startAnimation(anim2)
                    }
                    count = 0
                }


                if (text2.text!="0") {
                    if (t == 12 && n == 0) {
                        text1.startAnimation(anim3)
                        TastyToast.makeText(
                            applicationContext,
                            "Juda zur siz hammasini bir urunishda topdingiz!",
                            TastyToast.LENGTH_LONG,
                            TastyToast.WARNING
                        )
                        var intent = Intent(this@MainActivity,secondActivity::class.java)
                        startActivity(intent)
                        text2.visibility=View.INVISIBLE
                    } else if (t == 12 && n > 0) {
                        text1.startAnimation(anim3)
                        TastyToast.makeText(
                            applicationContext,
                            "Siz $n ta xato qildingiz!",
                            TastyToast.LENGTH_LONG,
                            TastyToast.SUCCESS
                        )
                        var intent = Intent(this@MainActivity,secondActivity::class.java)
                        startActivity(intent)
                        text2.visibility=View.INVISIBLE
                        image3.visibility=View.INVISIBLE

                    }
                }else if (text2.text=="0" && t!=12){
                    text1.startAnimation(anim3)
                    TastyToast.makeText(
                        applicationContext,
                        "Istirok uchun kattaraxmat Afsuski siz yutqazdingiz!",
                        TastyToast.LENGTH_LONG,
                        TastyToast.ERROR
                    )
                    var intent = Intent(this@MainActivity,threActivity::class.java)
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
