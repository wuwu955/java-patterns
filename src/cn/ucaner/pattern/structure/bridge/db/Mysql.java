package cn.ucaner.pattern.structure.bridge.db;

import cn.ucaner.pattern.structure.bridge.db.inf.Driver;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.bridge.db
 * @ClassName：Mysql
 * @Description： <p> Mysql </p>
 * @Author： - Jason
 * @CreatTime：2018年6月5日 下午9:30:46
 * @Modify By：
 * @ModifyTime： 2018年6月5日
 * @Modify marker：
 */
public class Mysql implements Driver {

    @Override
    public void connect() {
        System.out.println("I'm Mysql Driver.");
    }

}
