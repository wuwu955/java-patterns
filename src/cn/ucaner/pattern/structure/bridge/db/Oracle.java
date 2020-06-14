package cn.ucaner.pattern.structure.bridge.db;

import cn.ucaner.pattern.structure.bridge.db.inf.Driver;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.bridge.db
 * @ClassName：Oracle
 * @Description： <p> Oracle</p>
 * @Author： - Jason
 * @CreatTime：2018年6月5日 下午9:32:51
 * @Modify By：
 * @ModifyTime： 2018年6月5日
 * @Modify marker：
 */
public class Oracle implements Driver {

    @Override
    public void connect() {
        System.out.println("I'm Oracle Driver.");
    }

}
