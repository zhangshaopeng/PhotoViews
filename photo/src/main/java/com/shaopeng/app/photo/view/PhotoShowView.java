package com.shaopeng.app.photo.view;

import android.content.Context;
import android.graphics.Canvas;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;
import com.shaopeng.app.photo.bean.PhotoBean;


/**
 * Description:
 * Company:
 * Author:Zhangshaopeng
 * Email :1377785991@qq.com
 * Data:2019/5/3
 */
public class PhotoShowView extends PhotoView {

    private PhotoBean photoBean;

    public PhotoShowView(Context context, PhotoBean photoBean) {
        super(context);
        this.photoBean = photoBean;
    }

    public void startGlide() {
        Glide.with(getContext()).load(photoBean.photoSource).into(PhotoShowView.this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

}
