package com.ateam.uikotlinpractice_login_loka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       로그인 버튼 클릭 했을 때
        loginBtn.setOnClickListener { 
            
//            id와 비번이 일치하면 토스트로 "관리자 입니다" 메세지 보여준다 
            val getId = idEdt.text.toString()
            val getPass = passEdt.text.toString()
            
            if(getId == "admin@test.com" && getPass == "qwer"){
                Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "넌 아니야", Toast.LENGTH_SHORT).show()
            }
        }
    }
}