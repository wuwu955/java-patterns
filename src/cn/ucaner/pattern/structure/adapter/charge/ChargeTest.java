package cn.ucaner.pattern.structure.adapter.charge;

import cn.ucaner.pattern.structure.adapter.charge.inf.ThreeInterface;
import cn.ucaner.pattern.structure.adapter.charge.inf.TwoInterface;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.adapter.charge
 * @ClassName：ChargeTest
 * @Description： <p> ChargeTest 适配器测试</p>
 * @Author： - Jason
 * @CreatTime：2018年6月5日 下午9:02:23
 * @Modify By：
 * @ModifyTime： 2018年6月5日
 * @Modify marker：
 */
public class ChargeTest {

    /**
     * @param args
     * @Description: Just for test
     * @Autor: Jason - jasonandy@hotmail.com
     */
    public static void main(String[] args) {
        //2口
        TwoInterface twoInterface = new ChinaCharge();

        ThreeInterface threeInterface = new Three2TwoAdapter(twoInterface);

        //3口
        ThreeInterface threeInterface2 = new HongKongCharge();

        //这里其实就是调用的两口的方法
        Three3TwoAdapter three3TwoAdapter = new Three3TwoAdapter(threeInterface2);

        three3TwoAdapter.OfferPowerForTwo();

        threeInterface.OfferPowerForThree();
    }

}
