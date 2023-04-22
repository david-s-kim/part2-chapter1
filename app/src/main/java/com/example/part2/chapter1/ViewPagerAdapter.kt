package com.example.part2.chapter1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(private val mainActivity: MainActivity) :
    FragmentStateAdapter(mainActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    // 복습
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                return WebViewFragment(position,"https://comic.naver.com/webtoon/detail?titleId=703846&no=259").apply {
                    listener = mainActivity
                }
            }
            1 -> {
                return WebViewFragment(position, "https://comic.naver.com/webtoon?tab=mon").apply {
                    listener = mainActivity
                }
            }
            else -> {
                return WebViewFragment(position, "https://comic.naver.com/webtoon/list?titleId=650305").apply {
                    listener = mainActivity
                }
            }
        }

    }
}