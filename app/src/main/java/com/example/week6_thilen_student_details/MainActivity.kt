package com.example.week6_thilen_student_details

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.week6_thilen_student_details.Model.student
import com.example.week6_thilen_student_details.Model.studentlist

class MainActivity : AppCompatActivity() {
    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var btnlogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username=findViewById(R.id.username)
        password=findViewById(R.id.password)
        btnlogin=findViewById(R.id.btnlogin)
        loadStudents()
        btnlogin.setOnClickListener{
            if (username.text.toString()== "softwarica" && password.text.toString()== "coventry"){
                Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,MenuActivity::class.java))
            }else{
                Toast.makeText(this,"Invalid Input", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private  fun loadStudents(){
        studentlist.addStudents(student("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVI1Rb4Ewaaeg7XkEQnFWavvJsAUqkv-P9mw&usqp=CAU","Kiran Rana","30","Lalitpur","Male"))
        studentlist.addStudents(student("https://png.pngtree.com/png-vector/20190118/ourlarge/pngtree-vector-female-student-icon-png-image_326761.jpg","Katrina Kaif","25","Mumbai","Female"))
        studentlist.addStudents(student("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVI1Rb4Ewaaeg7XkEQnFWavvJsAUqkv-P9mw&usqp=CAU","Salman Khan","55","Mumbai","Male"))
    }
}