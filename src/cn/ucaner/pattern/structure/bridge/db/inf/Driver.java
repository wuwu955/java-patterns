package cn.ucaner.pattern.structure.bridge.db.inf;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.bridge.db.inf
 * @ClassName：Driver
 * @Description： <p>  JDBC 驱动 </p>
 * @Author： - Jason
 * @CreatTime：2018年6月5日 下午9:29:12
 * @Modify By：
 * @ModifyTime： 2018年6月5日
 * @Modify marker：
 */
public interface Driver {

    /**
     * 连接器
     */
    void connect();

}
