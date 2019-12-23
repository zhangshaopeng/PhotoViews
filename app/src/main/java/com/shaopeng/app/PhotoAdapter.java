package com.shaopeng.app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shaopeng.app.photo.bean.PhotoBean;

import cn.droidlover.xrecyclerview.RecyclerAdapter;

/**
 * Description:
 * Company:
 * Author:Zhangshaopeng
 * Email :1377785991@qq.com
 * Data:2019/5/3
 */
public class PhotoAdapter extends RecyclerAdapter<PhotoBean, PhotoAdapter.MyViewHolder> {
    public Context mContext;

    public PhotoAdapter(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_photo_dispaly, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final PhotoBean entity = data.get(position);
        holder.itemView.setOnClickListener(v -> {
            if (getRecItemClick() != null) {
                getRecItemClick().onItemClick(position, entity, position, holder);
            }
        });
        Glide.with(mContext).load(entity.photoSource).into(holder.imageView);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.item_photo);
        }
    }
}
