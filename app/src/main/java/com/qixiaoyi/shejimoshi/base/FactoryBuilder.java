package com.qixiaoyi.shejimoshi.base;

import android.content.Context;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：FactoryBuilder
 * <p>
 * 创 建 日 期 ： 2017/3/14 0014  23:07
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public abstract class FactoryBuilder {
    public abstract void buildA(Context context,int tag);
    public abstract void buildB(Context context,int tag);
    public abstract void buildC(Context context,int tag);
    public abstract ApparatusFactory greateFactory();
}
