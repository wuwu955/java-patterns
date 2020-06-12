package cn.ucaner.pattern.structure.adapter;

import cn.ucaner.pattern.structure.adapter.adapterAbs.IUserInfo;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.adapter
 * @ClassName：MeUserInfo
 * @Description： <p> 适配器模式  --- 我们自己的用户类</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午6:02:39
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 */
public class MeUserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.print("员工姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        return "员工住址";
    }

    @Override
    public String getMobileNumber() {
        System.out.print("员工号码");
        return null;
    }

    @Override
    public String getSex() {
        System.out.print("员工性别");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.print("员工公司地址");
        return null;
    }


}
