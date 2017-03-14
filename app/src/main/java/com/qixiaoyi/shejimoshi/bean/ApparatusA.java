package com.qixiaoyi.shejimoshi.bean;

import android.content.Context;
import android.widget.Toast;

import com.qixiaoyi.shejimoshi.base.ApparatusProduct;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：ApparatusA
 * <p>
 * 创 建 日 期 ： 2017/3/14 0014  20:54
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public class ApparatusA extends ApparatusProduct{

    @Override
    public void work(Context context) {
        Toast.makeText(context, "家电A开始工作", Toast.LENGTH_SHORT).show();
    }
}
