package cn.ucaner.pattern.create.factory.human;

import cn.ucaner.pattern.create.factory.Human;

/**
* @Package：cn.ucaner.pattern.create.factory.human
* @ClassName：WhiteHuman
* @Description：   <p> 工厂模式  --- 白人</p>
* @Author： -
* @CreatTime：2017年10月26日 下午5:49:13
* @Modify By：
* @ModifyTime：
* @Modify marker：
* @version    V1.0
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种");
    }
}
