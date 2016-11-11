package com.example.zhihudaily.Adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by 教科书式的机智少年 on 2016/11/5.
 */

public class TopViewPagerAdapter extends PagerAdapter {
    private ArrayList<ImageView> images;
    private ArrayList<View> views;
    /*public TopViewPagerAdapter(ArrayList<ImageView> images){
        this.images = images;
    }*/
    public TopViewPagerAdapter(ArrayList<View> views){
        this.views = views;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        //return images.size();
        return views.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //container.addView(images.get(position));
        //return images.get(position);

        container.addView(views.get(position));
        return views.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //container.removeView(images.get(position));
        container.removeView(views.get(position));
    }
}
