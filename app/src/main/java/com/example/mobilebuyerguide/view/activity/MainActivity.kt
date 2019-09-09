package com.example.mobilebuyerguide.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobilebuyerguide.R
import com.example.mobilebuyerguide.view.adapter.TabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupTab()
    }

    private fun setupTab() {
        val tabAdapter = TabAdapter(this, supportFragmentManager)
        view_pager.adapter = tabAdapter
        tab_layout.setupWithViewPager(view_pager)
    }
}
