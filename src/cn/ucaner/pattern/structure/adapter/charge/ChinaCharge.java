package cn.ucaner.pattern.structure.adapter.charge;

import cn.ucaner.pattern.structure.adapter.charge.inf.TwoInterface;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.adapter.charge
 * @ClassName：RealTwo
 * @Description： <p>  China 中国的插头  标准两口 220v </p>
 * @Author： - Jason
 * @CreatTime：2018年6月5日 下午8:54:41
 * @Modify By：
 * @ModifyTime： 2018年6月5日
 * @Modify marker：
 */
public class ChinaCharge implements TwoInterface {

    /**
     * OfferPowerForTwo 标准的两口插座
     */
    @Override
    public void OfferPowerForTwo() {
        System.out.println("I'm China Charge. 220V.  - 中国的标准的220V 50HZ 电源.");
    }

}
