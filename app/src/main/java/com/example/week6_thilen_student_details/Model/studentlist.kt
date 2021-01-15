package com.example.week6_thilen_student_details.Model

object studentlist {

    var lstStudents = ArrayList<student>()
    fun addStudents(student:student){
        lstStudents.add(student)
    }
    fun fetchStudent(): ArrayList<student> {
        return lstStudents
    }
}