package com.shaopeng.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import com.shaopeng.app.photo.bean.PhotoBean;
import com.shaopeng.app.photo.view.DisplayImageView;

import java.util.ArrayList;
import java.util.List;

import cn.droidlover.xrecyclerview.RecyclerItemCallback;

public class MainActivity extends AppCompatActivity {


    private DisplayImageView displayView;
    private List<PhotoBean> urlList;
    private List<PhotoBean> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        list = new ArrayList<>();
        urlList = new ArrayList<>();
        list.add(new PhotoBean(R.mipmap.a));
        list.add(new PhotoBean(R.mipmap.e));
        list.add(new PhotoBean(R.mipmap.c));
        list.add(new PhotoBean(R.mipmap.g));
        urlList.add(new PhotoBean("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3008142408,2229729459&fm=26&gp=0.jpg"));
        urlList.add(new PhotoBean("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=4094400000,3327666375&fm=26&gp=0.jpg"));
        urlList.add(new PhotoBean("https://dss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=134057123,1889531633&fm=26&gp=0.jpg"));
        urlList.add(new PhotoBean("https://dss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2229864841,4232235061&fm=26&gp=0.jpg"));


    }


    private void initView() {
        displayView = findViewById(R.id.photo_gallery_view);
        RecyclerView mRecyclerView = findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        PhotoAdapter adapter = new PhotoAdapter(this);
        mRecyclerView.setAdapter(adapter);
        adapter.setData(list);
        adapter.setRecItemClick(new RecyclerItemCallback<PhotoBean, PhotoAdapter.MyViewHolder>() {
            @Override
            public void onItemClick(int position, PhotoBean model, int tag, PhotoAdapter.MyViewHolder holder) {
                super.onItemClick(position, model, tag, holder);
                displayView.showPhotoGallery(position, list, holder.imageView);
            }
        });
        RecyclerView mRecyclerViewUrl = findViewById(R.id.recycler_url);
        mRecyclerViewUrl.setLayoutManager(new GridLayoutManager(this, 2));
        PhotoAdapter adapterUrl = new PhotoAdapter(this);
        mRecyclerViewUrl.setAdapter(adapterUrl);
        adapterUrl.setData(urlList);
        adapterUrl.setRecItemClick(new RecyclerItemCallback<PhotoBean, PhotoAdapter.MyViewHolder>() {
            @Override
            public void onItemClick(int position, PhotoBean model, int tag, PhotoAdapter.MyViewHolder holder) {
                super.onItemClick(position, model, tag, holder);
                displayView.showPhotoGallery(position, urlList, holder.imageView);
            }
        });

    }
}
