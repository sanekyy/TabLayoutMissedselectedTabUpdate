package com.ihb.tablayoutmissedselectedtabupdate

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentsAdapter(fragmentManager: FragmentManager) : FragmentStateAdapter(fragmentManager) {

    var pageTitles: List<String> = listOf("PAGE 1", "PAGE 2")

    override fun getItem(position: Int): Fragment {
        val args = Bundle()
        args.putString(PageFragment.TITLE_KEY, pageTitles[position])

        val fragment = PageFragment()
        fragment.arguments = args

        return fragment
    }

    override fun getItemCount() = pageTitles.size
}