package com.example.baithi;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPaperAdapter_thanhvien extends FragmentPagerAdapter {
    private final List<Fragment> lstFragment =  new ArrayList<>();
    private final List<String> lstTitle = new ArrayList<>();

    public ViewPaperAdapter_thanhvien(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitle.get(position);
    }

    public void AddFragment (Fragment fragment, String string){
        lstFragment.add(fragment);
        lstTitle.add(string);
    }
}
