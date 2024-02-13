package com.example.netclanexplorer.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.netclanexplorer.fragment.BusinessFragment;
import com.example.netclanexplorer.fragment.MerchantFragment;
import com.example.netclanexplorer.fragment.PersonalFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       if (position==0){
           return new PersonalFragment();
       } else if (position==1) {
           return new BusinessFragment();
       }else {
           return new MerchantFragment();
       }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Personal";
        } else if (position == 1) {
            return "Business";
        }else {
            return "Merchant";
        }

    }
}
