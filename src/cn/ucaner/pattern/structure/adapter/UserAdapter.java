package cn.ucaner.pattern.structure.adapter;

import cn.ucaner.pattern.structure.adapter.adapterAbs.IUserInfo;

/**
 * @Package：cn.ucaner.pattern.structure.adapter
 * @ClassName：UserAdapter
 * @Description：   <p> 适配器模式  --- 两种不同用户之间的适配    Other 适配 User</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午6:01:54
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 * @version V1.0
 */
public class UserAdapter extends OtherUserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        return getUserInfo().get("username");
    }

    @Override
    public String getHomeAddress() {
        return getUserInfo().get("address");
    }

    @Override
    public String getMobileNumber() {
        return getUserInfo().get("number");
    }

    @Override
    public String getSex() {
        return getUserInfo().get("sex");
    }

    @Override
    public String getJobPosition() {
        return getUserJobInfo().get("jobaddress");
    }


}
