package com.jk.homework_6_3.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jk.homework_6_3.fragments.CounterFragment
import com.jk.homework_6_3.fragments.HistoryFragment
import com.jk.homework_6_3.fragments.MainFragment

class ViewPagerAdapter(activity: FragmentActivity?) : FragmentStateAdapter(activity!!) {

    private val fragmentList = arrayListOf(MainFragment(), CounterFragment(), HistoryFragment())
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}