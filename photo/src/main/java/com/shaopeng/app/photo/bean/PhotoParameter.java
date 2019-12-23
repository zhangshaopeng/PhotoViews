package com.shaopeng.app.photo.bean;

import android.widget.ImageView;

/**
 * Description:照片参数
 * Company:
 * Author:Zhangshaopeng
 * Email :1377785991@qq.com
 * Data:2019/5/3
 */
public class PhotoParameter {

    /**
     * 索引
     */
    public int index;
    /**
     * 类型
     */
    public Object photoObj;
    /**
     * 在屏幕上的位置
     */
    public int[] locOnScreen = new int[]{-1, -1};
    /**
     * 图片的宽
     */
    public int photoWidth = 0;
    /**
     * 图片的高
     */
    public int photoHeight = 0;
    /**
     * ImageView的宽
     */
    public int imageWidth = 0;
    /**
     * ImageView的高
     */
    public int imageHeight = 0;
    /**
     * 缩放的类型
     */
    public ImageView.ScaleType scaleType;

}
