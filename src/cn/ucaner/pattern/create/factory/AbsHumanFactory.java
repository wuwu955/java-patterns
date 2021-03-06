/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.create.factory;

/**
* @Package：cn.ucaner.pattern.create.factory
* @ClassName：AbsHumanFactory
* @Description：   <p> 工厂模式 --- 抽象出来的工厂</p>
* @Author： -
* @CreatTime：2017年10月26日 下午5:50:00
* @Modify By：
* @ModifyTime：
* @Modify marker：
* @version    V1.0
 */
public abstract class AbsHumanFactory {
    /**
     * 创建人类
     * @param tClass
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> tClass);

}
