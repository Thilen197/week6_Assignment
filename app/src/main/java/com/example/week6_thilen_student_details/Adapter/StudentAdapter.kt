package com.example.week6_thilen_student_details.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.week6_thilen_student_details.Fragments.HomeFragment
import com.example.week6_thilen_student_details.Model.student
import com.example.week6_thilen_student_details.R

class StudentAdapter (
    val lstStudents: ArrayList<student>,
    val context: HomeFragment

    ):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>(){
        class StudentViewHolder(view: View):
            RecyclerView.ViewHolder(view) {

            val imgProfile: ImageView
            val tvName: TextView
            val tvAge : TextView
            val tvAddress: TextView
            val tvGender : TextView
            val delete : ImageView


            init {
                imgProfile = view.findViewById(R.id.imgProfile)
                tvName = view.findViewById(R.id.tvName)
                tvAge = view.findViewById(R.id.tvAge)
                tvAddress = view.findViewById(R.id.tvAddress)
                tvGender = view.findViewById(R.id.tvGender)
                delete = view.findViewById(R.id.delete)
            }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.home,parent,false)

            return StudentViewHolder(view)
        }

        override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
            val student = lstStudents[position]
            holder.tvName.text = student.studentName
            holder.tvAge.text = student.studentAge
            holder.tvAddress.text = student.studentAddress
            holder.tvGender.text = student.studentGender

            holder.delete.setOnClickListener{
                lstStudents.removeAt(position)
                notifyDataSetChanged()
            }

            Glide.with(context)
                .load(student.studentImage)
                .into(holder.imgProfile)
        }

        override fun getItemCount(): Int {
            return lstStudents.size
        }

    }