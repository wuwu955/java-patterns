package cn.ucaner.pattern.structure.adapter;

import cn.ucaner.pattern.structure.adapter.adapterAbs.IUserInfo;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.adapter
 * @ClassName：AdapterMain
 * @Description： <p> 适配器模式  --   适配器模式执行类</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午6:03:00
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 */
public class AdapterMain {

    public static void main(String[] args) {

        /**
         * 接口是iuserInfo  实例拿的是 OtherUserInfo
         */
        IUserInfo iUserInfo = new UserAdapter();
        String homeAddress = iUserInfo.getHomeAddress();
        System.out.println(homeAddress);

        /**
         * iuserInfo  实例也是 UserInfo
         */
        IUserInfo iUserInfoMe = new MeUserInfo();
        String homeAddress1 = iUserInfoMe.getHomeAddress();
        System.out.println(homeAddress1);


    }
}
