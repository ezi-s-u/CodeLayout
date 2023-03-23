package kr.hs.emirim.evie.codelayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var btn1 : Button // 콜론 다음에 자료형

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 아주 중요! 객체를 생성하고 화면에 나타냄
        btn1 = findViewById<Button>(R.id.btn1)

        // 버튼에게 특정 행동을 했을 때 무언가가 처리됨
        btn1.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요!", Toast.LENGTH_SHORT).show()
        }
    }
}