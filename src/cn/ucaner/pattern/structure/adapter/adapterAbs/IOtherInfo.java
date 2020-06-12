package cn.ucaner.pattern.structure.adapter.adapterAbs;


import java.util.HashMap;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.adapter.adapterAbs
 * @ClassName：IOtherInfo
 * @Description： <p> 适配器模式   - - 需要对接的用户接口类</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午6:03:38
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 */
public interface IOtherInfo {

    /**
     * 获取用户的User信息
     *
     * @return
     */
    HashMap<String, String> getUserInfo();

    /**
     * 获取的是用户的job信息
     *
     * @return
     */
    HashMap<String, String> getUserJobInfo();
}
