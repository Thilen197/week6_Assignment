package com.example.week6_thilen_student_details.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.example.week6_thilen_student_details.R

class AboutusFragment: Fragment() {
    private lateinit var about : WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        about = view.findViewById(R.id.about)
        about.loadUrl("https://softwarica.edu.np/about-softwarica/")

        return view
    }

}