package cn.ucaner.pattern.structure.adapter.charge;

import cn.ucaner.pattern.structure.adapter.charge.inf.ThreeInterface;
import cn.ucaner.pattern.structure.adapter.charge.inf.TwoInterface;

/**
 * 2口转3口  转接头
 */
public class Three3TwoAdapter implements TwoInterface {

    ThreeInterface threeInterface;

    /**
     * 2口 转3口的插座 - 适配
     *
     * @param threeInterface
     */
    public Three3TwoAdapter(ThreeInterface threeInterface) {
        super();
        this.threeInterface = threeInterface;
    }


    @Override
    public void OfferPowerForTwo() {
        threeInterface.OfferPowerForThree();
    }

}
