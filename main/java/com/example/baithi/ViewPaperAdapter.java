package com.example.baithi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPaperAdapter extends FragmentPagerAdapter {
    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lstTitle = new ArrayList<>();
    public ViewPaperAdapter(@Nullable FragmentManager fm, int behavior){
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragement_douong();
            case 1:
                return new Fragment_doan();
            default:
                return new Fragement_douong();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position){
            case 0:
                title = "Đồ Uống";
                break;
            case 1:
                title = "Đồ Ăn";
                break;
        }
        return title;

    }
    public void AddFragment(Fragment fragment, String title){
        lstFragment.add(fragment);
        lstTitle.add(title);
    }
}
