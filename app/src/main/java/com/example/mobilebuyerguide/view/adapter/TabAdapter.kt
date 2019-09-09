package com.example.mobilebuyerguide.view.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mobilebuyerguide.R
import com.example.mobilebuyerguide.view.fragment.FavoriteListFragment
import com.example.mobilebuyerguide.view.fragment.MobileListFragment

class TabAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {
    private val pages = 2
    private val mobileListFragment = MobileListFragment()
    private val favoriteListFragment = FavoriteListFragment()

    override fun getItem(position: Int): Fragment {
        return when (position) {
            1 -> favoriteListFragment
            else -> mobileListFragment
        }
    }

    override fun getCount(): Int {
        return pages
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            1 -> context.resources.getString(R.string.tab_favorite_list)
            else -> context.resources.getString(R.string.tab_mobile_list)
        }
    }
}