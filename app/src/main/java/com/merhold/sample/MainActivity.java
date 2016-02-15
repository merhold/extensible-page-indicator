package com.merhold.sample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.merhold.extensiblepageindicator.ExtensiblePageIndicator;

public class MainActivity extends AppCompatActivity {

    private SimpleFragmentAdapter mSimpleFragmentAdapter;
    private ViewPager mViewPager;
    private ExtensiblePageIndicator extensiblePageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        extensiblePageIndicator = (ExtensiblePageIndicator) findViewById(R.id.flexibleIndicator);
        mSimpleFragmentAdapter = new SimpleFragmentAdapter(getSupportFragmentManager());

        mSimpleFragmentAdapter.addFragment(SimpleFragment.newInstance(R.color.frag1, R.drawable.char1));
        mSimpleFragmentAdapter.addFragment(SimpleFragment.newInstance(R.color.frag2, R.drawable.char2));
        mSimpleFragmentAdapter.addFragment(SimpleFragment.newInstance(R.color.frag3, R.drawable.char3));

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSimpleFragmentAdapter);
        extensiblePageIndicator.initViewPager(mViewPager);

    }
}
