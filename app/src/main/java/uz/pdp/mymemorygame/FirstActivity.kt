package uz.pdp.mymemorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import uz.pdp.mymemorygame.game.PuzzleActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        playBtn.setOnClickListener {
            startActivity(Intent(this, PuzzleActivity::class.java))
        }
        aboutBtn.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
        exitBtn.setOnClickListener {
            finish()
        }
    }
}