package com.example.fragments_tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int numCount;

    public PageAdapter(@NonNull FragmentManager fm,int numCount) {
        super(fm);
        this.numCount = numCount;
    }
    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Java java = new Java();
                return java;

            case 1:
                Php php = new Php();
                return php;

        }
        return null;
    }

    @Override
    public int getCount() {
        return numCount;
    }
}
