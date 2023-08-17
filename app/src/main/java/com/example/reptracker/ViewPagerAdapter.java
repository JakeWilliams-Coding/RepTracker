package com.example.reptracker;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.reptracker.fragments.exercises_fragment;
import com.example.reptracker.fragments.logtracker_fragment;
import com.example.reptracker.fragments.my_profile_fragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {    //The position I want them in on screen
        switch (position){
            case 0: return new exercises_fragment();
            case 1: return new logtracker_fragment();
            case 2: return new my_profile_fragment();
            default: return new logtracker_fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }  //Number of tabs is 3
}
