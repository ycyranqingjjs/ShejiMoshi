package com.qixiaoyi.shejimoshi.weihu;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.qixiaoyi.shejimoshi.base.BaseShebeiSubject;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：RealShebeiSuject
 * <p>
 * 创 建 日 期 ： 2017/3/14 0014  22:47
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public class RealShebeiSuject extends BaseShebeiSubject {
    @Override
    public void shengji(Context context) {
        Toast.makeText(context, "升级开始", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void dowork(Context context) {
        Log.d("main","------------机器工作****************");
    }
}
