package com.qixiaoyi.shejimoshi.factory;

import com.qixiaoyi.shejimoshi.base.ApparatusFactory;
import com.qixiaoyi.shejimoshi.base.ApparatusProduct;
import com.qixiaoyi.shejimoshi.bean.ApparatusA;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：ApparatusFactory
 * <p>
 * 创 建 日 期 ： 2017/3/14 0014  20:52
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public class ConcreteFactoryA extends ApparatusFactory{

    ApparatusA mApparatusA = null;
    @Override
    public ApparatusProduct produceApparatus() {
        if (mApparatusA == null){
            mApparatusA = new ApparatusA();
        }
        return mApparatusA;
    }
}
