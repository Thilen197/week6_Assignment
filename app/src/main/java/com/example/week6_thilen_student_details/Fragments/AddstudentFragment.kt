package com.example.week6_thilen_student_details.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.week6_thilen_student_details.Model.student
import com.example.week6_thilen_student_details.Model.studentlist
import com.example.week6_thilen_student_details.R

class AddstudentFragment  : Fragment(), View.OnClickListener{
    private lateinit var etname : EditText
    private lateinit var etage : EditText
    private lateinit var rg : RadioButton
    private lateinit var rbmale : RadioButton
    private lateinit var rbfemale : RadioButton
    private lateinit var rbothers : RadioButton
    private lateinit var etaddress : EditText
    private lateinit var etimg : EditText
    private lateinit var btnsave : Button
    var gender = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_addstudent, container, false)

        etname = view.findViewById(R.id.etname)
        etage = view.findViewById(R.id.etage)
        rbmale = view.findViewById(R.id.rbmale)
        rbfemale = view.findViewById(R.id.rbfemale)
        rbothers = view.findViewById(R.id.rbothers)
        etaddress = view.findViewById(R.id.etaddress)
        etimg = view.findViewById(R.id.etimg)
        btnsave = view.findViewById(R.id.btnsave)

        btnsave.setOnClickListener(this)


        return view
    }


    override fun onClick(v: View?) {

        when (v?.id){
            R.id.btnsave -> {



                val name = etname.text.toString()
                val age = etage.text.toString()
                val address = etaddress.text.toString()
                gender = if (rbmale.isChecked) {
                    rbmale.text.toString()
                } else if (rbfemale.isChecked) {
                    rbfemale.text.toString()
                } else {
                    rbothers.text.toString()
                }
                val img = etimg.text.toString()
                studentlist.addStudents(student(img, name, age, address, gender))

                Toast.makeText(context, "sucessfully Added !!", Toast.LENGTH_SHORT).show()

                etname.setText("")
                etage.setText("")
                etaddress.setText("")
                etaddress.setText("")
            }
        }
    }
}