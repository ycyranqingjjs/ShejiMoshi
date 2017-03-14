package com.qixiaoyi.shejimoshi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.qixiaoyi.shejimoshi.bean.ApparatusA;
import com.qixiaoyi.shejimoshi.bean.ApparatusB;
import com.qixiaoyi.shejimoshi.bean.ApparatusC;
import com.qixiaoyi.shejimoshi.builders.ConcreteBuilder;
import com.qixiaoyi.shejimoshi.builders.Director;
import com.qixiaoyi.shejimoshi.factory.ConcreteFactoryA;
import com.qixiaoyi.shejimoshi.factory.ConcreteFactoryB;
import com.qixiaoyi.shejimoshi.factory.ConcreteFactoryC;
import com.qixiaoyi.shejimoshi.weihu.RealShebeiProxy;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.bt_user)
    Button mBtUser;
    @Bind(R.id.bt_updata)
    Button mBtUpdata;
    @Bind(R.id.bt_createC)
    Button mBtCreateC;
    @Bind(R.id.bt_createB)
    Button mBtCreateB;
    @Bind(R.id.bt_createA)
    Button mBtCreateA;
    @Bind(R.id.textView)
    TextView mTextView;
    @Bind(R.id.bt_change)
    Button mBtChange;
    @Bind(R.id.tv_out)
    TextView mTvOut;
    private ApparatusA mAa;
    private ConcreteFactoryA mConcreteFactoryA;
    private ConcreteFactoryB mConcreteFactoryB;
    private ApparatusB mAb;
    private ConcreteFactoryC mConcreteFactoryC;
    private ApparatusC mAc;
    private RealShebeiProxy mRealShebeiProxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        mBtUser.setOnClickListener(this);
        mBtUpdata.setOnClickListener(this);
        mBtCreateC.setOnClickListener(this);
        mBtCreateB.setOnClickListener(this);
        mBtCreateA.setOnClickListener(this);
        mBtChange.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.bt_createC:
                if (mConcreteFactoryA==null){
                    Toast.makeText(this, "还没有生产C电气的工厂哦", Toast.LENGTH_SHORT).show();
                }else {
                    mAc = (ApparatusC) mConcreteFactoryC.produceApparatus();
                    mAc.work(this);
                    mTvOut.append("制作家电C\n");
                }
                break;
            case R.id.bt_createB:
                if (mConcreteFactoryA==null){
                    Toast.makeText(this, "还没有生产B电气的工厂哦", Toast.LENGTH_SHORT).show();
                }else {
                    mAb = (ApparatusB) mConcreteFactoryB.produceApparatus();
                    mAb.work(this);
                    mTvOut.append("制作家电B\n");
                }
                break;
            case R.id.bt_createA:
                if (mConcreteFactoryA==null){
                    Toast.makeText(this, "还没有生产A电气的工厂哦", Toast.LENGTH_SHORT).show();
                }else {
                    mAa = (ApparatusA) mConcreteFactoryA.produceApparatus();
                    mAa.work(this);
                    mTvOut.append("制作家电A\n");
                }
                break;

            case R.id.bt_change:
                ConcreteBuilder concreteBuilder = new ConcreteBuilder();
                Director director = Director.getInstance(concreteBuilder,this);
                mConcreteFactoryA = (ConcreteFactoryA) director.getFa(1);
                mTvOut.append("建造A工厂\n");
                mConcreteFactoryB = (ConcreteFactoryB) director.getFa(2);
                mTvOut.append("建造B工厂\n");
                mConcreteFactoryC = (ConcreteFactoryC) director.getFa(3);
                mTvOut.append("建造C工厂\n");
                break;

            case R.id.bt_updata:
                mRealShebeiProxy = new RealShebeiProxy();
                mRealShebeiProxy.shengji(this);
                mTvOut.append("功能升级\n");
                break;

            case R.id.bt_user:
                mTvOut.append("家电使用\n");
                if (mAa==null||mAc==null||mAb==null){
                    Toast.makeText(this, "家电还未", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
