package cn.ucaner.pattern.structure.bridge.db;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.bridge.db
 * @ClassName：MyBridge
 * @Description： <p> MyBridge </p>
 * @Author： - Jason
 * @CreatTime：2018年6月5日 下午9:36:29
 * @Modify By：
 * @ModifyTime： 2018年6月5日
 * @Modify marker：
 */
public class MyBridge extends Bridge {

    /**
     * MyBridge.
     */
    public MyBridge() {
        super();
        System.out.println("** MyBridge 桥接器准备完毕 **");
    }

}
