package com.qixiaoyi.shejimoshi.builders;

import android.content.Context;

import com.qixiaoyi.shejimoshi.base.ApparatusFactory;
import com.qixiaoyi.shejimoshi.base.FactoryBuilder;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：Director
 * <p>
 * 创 建 日 期 ： 2017/3/14 0014  23:22
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public class Director {
    public static Director sDirector = null;
    FactoryBuilder mFactoryBuilder;
    Context context;
    private Director(FactoryBuilder mFactoryBuilder, Context context){
        this.mFactoryBuilder = mFactoryBuilder;
        this.context = context;
    }
    public static Director getInstance(FactoryBuilder mFactoryBuilder, Context context){
        if (sDirector==null){
            sDirector = new Director(mFactoryBuilder,context);
        }
        return sDirector;
    }
    public void setBuilder(FactoryBuilder mFactoryBuilder){
        this.mFactoryBuilder = mFactoryBuilder;
    }
    public ApparatusFactory getFa(int tag){
        mFactoryBuilder.buildA(context,tag);
        mFactoryBuilder.buildB(context,tag);
        mFactoryBuilder.buildC(context,tag);
        return mFactoryBuilder.greateFactory();
    }
}
