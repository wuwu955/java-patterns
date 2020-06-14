package cn.ucaner.pattern.structure.bridge;

import cn.ucaner.pattern.structure.bridge.abs.Abstraction;
import cn.ucaner.pattern.structure.bridge.abs.Implementor;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.bridge
 * @ClassName：RefinedAbstraction
 * @Description： <p> 桥接模式  --- 具体抽象化角色</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午5:58:08
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 抽象类 - dosomething
     */
    @Override
    public void doSomethings() {
        super.doSomethings();
//        getImplementor().doSomethingB();
//        getImplementor().doSomethingA();
    }
}
