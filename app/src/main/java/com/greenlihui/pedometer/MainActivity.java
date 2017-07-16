package com.greenlihui.pedometer;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import com.greenlihui.pedometer.fragments.MeFragment;
import com.greenlihui.pedometer.fragments.RankFragment;
import com.greenlihui.pedometer.fragments.StatusFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    private StatusFragment statusFragment = new StatusFragment();
    private RankFragment rankFragment = new RankFragment();
    private MeFragment meFragment = new MeFragment();

    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            // 页面滑动的时候，改变 BottomNavigationView 的 item 高亮
            bottomNavigationView.getMenu().getItem(position).setChecked(true);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            viewPager.setCurrentItem(item.getOrder());
            return true;
        }
    };

    private FragmentPagerAdapter pagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return statusFragment;
                case 1:
                    return rankFragment;
                case 2:
                    return meFragment;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        initLayout();
        initService();
    }

    private void initLayout() {
        viewPager = (ViewPager) findViewById(R.id.vp_container);
        viewPager.addOnPageChangeListener(pageChangeListener);
        viewPager.setAdapter(pagerAdapter);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bnv_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    private void initService() {

    }
}
