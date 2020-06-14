package cn.ucaner.pattern.structure.bridge;

import cn.ucaner.pattern.structure.bridge.abs.Implementor;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.bridge
 * @ClassName：ConcreteImplementor
 * @Description： <p> 桥接模式  --  具体实现类</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午5:59:37
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 */
public class ConcreteImplementor implements Implementor {

    @Override
    public void doSomethingA() {
        System.out.println("bridge do something A");
    }

    @Override
    public void doSomethingB() {
        System.out.println("bridge do something B");
    }
}
