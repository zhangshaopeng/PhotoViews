package com.shaopeng.app.photo.bean;

import android.support.annotation.DrawableRes;

/**
 * Description:照片地址
 * Company:
 * Author:Zhangshaopeng
 * Email :1377785991@qq.com
 * Data:2019/5/3
 */
public class PhotoBean {

    public Object photoSource;

    public PhotoBean(@DrawableRes int drawableRes) {
        this.photoSource = drawableRes;
    }

    public PhotoBean(String path) {
        this.photoSource = path;
    }

}
