package com.qixiaoyi.shejimoshi.base;

import android.content.Context;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：ApparatusProduct
 * <p>
 * 创 建 日 期 ： 2017/3/14 0014  20:53
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public abstract class ApparatusProduct {

    public long no = 0;
    public float jiaqian = 0;
    public String gongneng = "";
    public abstract void work(Context context);

}
