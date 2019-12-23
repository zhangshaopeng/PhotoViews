package com.shaopeng.app.photo.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.shaopeng.app.photo.view.PhotoShowView;

import java.util.ArrayList;
import java.util.List;


/**
 * Description:
 * Company:
 * Author:Zhangshaopeng
 * Email :1377785991@qq.com
 * Data:2019/5/3
 */

public class PhotoAdapter extends PagerAdapter {

    private List<PhotoShowView> viewList = new ArrayList<>();
    private List<Integer> positions = new ArrayList<>();

    public PhotoAdapter(List<PhotoShowView> list) {
        if (list != null) {
            viewList.addAll(list);
        }
    }

    @Override
    public int getCount() {
        return this.viewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (!positions.contains(position)) {
            positions.add(position);
            viewList.get(position).startGlide();
        }
        container.addView(viewList.get(position));
        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(viewList.get(position));
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

}
