package cn.ucaner.pattern.structure.proxy.dynamicProxy;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.proxy.dynamicProxy
 * @ClassName：RealSujectImpl
 * @Description： <p> 代理模式 -  动态代理真实类 </p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午5:09:51
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 */
public class RealSujectImpl implements Subject {

    @Override
    public void request() {
        System.out.println("*** dynamicProxy  do request ***");
    }

}
