package com.qixiaoyi.shejimoshi.builders;

import android.content.Context;
import android.util.Log;

import com.qixiaoyi.shejimoshi.base.ApparatusFactory;
import com.qixiaoyi.shejimoshi.base.FactoryBuilder;
import com.qixiaoyi.shejimoshi.factory.ConcreteFactoryA;
import com.qixiaoyi.shejimoshi.factory.ConcreteFactoryB;
import com.qixiaoyi.shejimoshi.factory.ConcreteFactoryC;
import com.qixiaoyi.shejimoshi.weihu.RealShebeiProxy;

/**
 * --------------------------------------------------
 * 版       权 ：易成勇
 * <p>
 * 作       者： 易成勇
 * <p>
 * 文件名：ConcreteBuilder
 * <p>
 * 创 建 日 期 ： 2017/3/14 0014  23:15
 * <p>
 * 描      述 ：
 * <p>
 * <p>
 * 修 订 历 史:
 * <p>
 * --------------------------------------------------
 */

public class ConcreteBuilder extends FactoryBuilder {
    RealShebeiProxy mRealShebeiProxy;//设备
    int tag = 1;
    ApparatusFactory mApparatusFactory = null;

    public ConcreteBuilder(){
        mRealShebeiProxy = new RealShebeiProxy();
    }
    @Override
    public void buildA(Context context,int tag) {
        Log.d("main","-----------建造工厂厂房"+tag+"---------");
        this.tag = tag;
    }

    @Override
    public void buildB(Context context,int tag) {
        Log.d("main","-----------引进机械设备"+tag+"---------");
        this.tag = tag;
        mRealShebeiProxy.dowork(context);
    }

    @Override
    public void buildC(Context context,int tag) {
        Log.d("main","-----------招聘技术人员"+tag+"---------");
        this.tag = tag;
    }

    @Override
    public ApparatusFactory greateFactory() {
        if (tag == 1){
            mApparatusFactory = new ConcreteFactoryA();
        }else if (tag == 2){
            mApparatusFactory = new ConcreteFactoryB();
        }else {
            mApparatusFactory = new ConcreteFactoryC();
        }
        return mApparatusFactory;
    }
}
