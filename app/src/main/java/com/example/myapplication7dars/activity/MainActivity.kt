package com.example.myapplication.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.model.Member

import com.example.myapplication7dars.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        val members = prepareMemberList()
        refreshAdapter(members)
    }

    @SuppressLint("WrongConstant")
    private fun initView() {
      // recyclerView.layoutManager = GridLayoutManager(this, 2)  // RecyclerView dan GridLayout yasash
     //   recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
       recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)  // RecyclerView dan VERTICAL RecyclerView  yasash
       // recyclerView.isNestedScrollingEnabled = false  // 6 dars

    }
    //refreshAdapter- har qanday malumotni yangilansa adapter refresh  qibergan
    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(members)
                recyclerView.adapter = adapter
    }
    private fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()

        for (i in 0..29) {
            members.add(Member("Makhmudov" + i, "Abdulloh" + i))
            }
        return members
        }
}
