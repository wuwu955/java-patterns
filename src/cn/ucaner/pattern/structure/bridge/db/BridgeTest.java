package cn.ucaner.pattern.structure.bridge.db;

import cn.ucaner.pattern.structure.bridge.db.inf.Driver;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.bridge.db
 * @ClassName：BridgeTest
 * @Description： <p> BridgeTest </p>
 * @Author： - Jason
 * @CreatTime：2018年6月5日 下午9:37:19
 * @Modify By：
 * @ModifyTime： 2018年6月5日
 * @Modify marker：
 */
public class BridgeTest {

    public static void main(String[] args) {

        Bridge mysqlBridge = new MyBridge();

        Driver mysqlDriver = new Mysql();
        mysqlBridge.setDriver(mysqlDriver);
        mysqlBridge.connect();

        Bridge oracleBridge = new OracleBridge();

        Driver oracle = new Oracle();
        oracleBridge.setDriver(oracle);
        oracleBridge.connect();
    }
}
