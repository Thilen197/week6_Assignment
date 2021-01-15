package com.example.week6_thilen_student_details.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week6_thilen_student_details.Adapter.StudentAdapter
import com.example.week6_thilen_student_details.Model.studentlist
import com.example.week6_thilen_student_details.R

class HomeFragment : Fragment(), View.OnClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var refresh : ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        refresh  = view.findViewById(R.id.refresh)

        val adapter = StudentAdapter(studentlist.fetchStudent(),this)
        recyclerView.layoutManager = LinearLayoutManager(context!!)
        recyclerView.adapter = adapter


        refresh.setOnClickListener(this)


        return view

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.refresh-> {
                recyclerView.adapter?.notifyDataSetChanged()
            }
        }
    }

}