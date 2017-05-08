package com.zzw.framelibray.skin.attr;

import android.view.View;

import java.util.List;

/**
 * Created by zzw on 2017/5/8.
 */

public class SkinView {
    private View mView;
    private List<SkinAttr> mSkinAttrList;


    public SkinView() {
    }

    public SkinView(View view, List<SkinAttr> attrList) {
        this.mView = view;
        this.mSkinAttrList = attrList;
    }

    public void skin() {
        for (SkinAttr skinAttr : mSkinAttrList) {
            skinAttr.skin(mView);
        }
    }
}
