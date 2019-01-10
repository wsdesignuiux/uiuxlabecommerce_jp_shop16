package e.wolfsoft1.uiuxlabecommerce_jp_shop16.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop16.fragment.Fragmemt_Viewpager_shop16;


public class ViewpagerAdapter_Shop16 extends FragmentPagerAdapter {
    public ViewpagerAdapter_Shop16(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragmemt_Viewpager_shop16();
                break;
            case 1:
                fragment = new Fragmemt_Viewpager_shop16();
                break;
            case 2:
                fragment = new Fragmemt_Viewpager_shop16();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
