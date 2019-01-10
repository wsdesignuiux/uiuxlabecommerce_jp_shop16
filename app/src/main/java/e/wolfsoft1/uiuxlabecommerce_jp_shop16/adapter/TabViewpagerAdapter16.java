package e.wolfsoft1.uiuxlabecommerce_jp_shop16.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop16.fragment.Fragment_Jumper16;

public class TabViewpagerAdapter16 extends FragmentPagerAdapter{
    private final int tabCount;

    public TabViewpagerAdapter16(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new Fragment_Jumper16();
                break;
            case 1:
                fragment = new Fragment_Jumper16()  ;
                break;
            case 2:
                fragment = new Fragment_Jumper16();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
