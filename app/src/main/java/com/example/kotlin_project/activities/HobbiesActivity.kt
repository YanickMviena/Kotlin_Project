package com.example.kotlin_project.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_project.adapters.HobbiesAdapter
import com.example.kotlin_project.R
import com.example.kotlin_project.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity () {

    companion object{
        val TAG: String = HobbiesActivity:: class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)


        setupRecyclerView()

        val layoutManager = LinearLayoutManager (this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager =layoutManager


        val adapter = HobbiesAdapter(
            this,
            Supplier.hobbies
        )
        recyclerView.adapter = adapter
    }

    private fun setupRecyclerView() {

        val layoutManager = LinearLayoutManager (this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager =layoutManager


        val adapter = HobbiesAdapter(
            this,
            Supplier.hobbies
        )
        recyclerView.adapter = adapter

    }
}