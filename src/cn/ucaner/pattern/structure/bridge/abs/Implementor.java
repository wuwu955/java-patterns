package cn.ucaner.pattern.structure.bridge.abs;

/**
 * @Package：cn.ucaner.pattern.structure.bridge.abs
 * @ClassName：Implementor
 * @Description：   <p> 桥接模式 --- 实现化角色 </p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午5:58:48
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 * @version V1.0
 */
public interface Implementor {

    /**
     * @Description: doSomethingA
     * @Autor: Jason
     */
    void doSomethingA();

    /**
     * @Description: doSomethingB
     * @Autor: Jason
     */
    void doSomethingB();
}
