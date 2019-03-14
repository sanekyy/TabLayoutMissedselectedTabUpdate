package com.ihb.tablayoutmissedselectedtabupdate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_page.*
import kotlin.random.Random

class PageFragment: Fragment() {

    companion object {
        const val TITLE_KEY = "TITLE_KEY"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title = arguments?.getString(TITLE_KEY, "MISSED TITLE")

        this.title.text = title
        this.title.setBackgroundColor(Random.nextInt())
    }
}