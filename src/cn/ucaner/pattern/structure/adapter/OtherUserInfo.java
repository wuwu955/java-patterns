/**
 * <html>
 * <body>
 * <P> Copyright 1994 JsonInternational</p>
 * <p> All rights reserved.</p>
 * <p> Created on 19941115</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.pattern.structure.adapter;

import cn.ucaner.pattern.structure.adapter.adapterAbs.IOtherInfo;

import java.util.HashMap;

/**
 * @Package：cn.ucaner.pattern.structure.adapter
 * @ClassName：OtherUserInfo
 * @Description：   <p> 适配器模式  --- 其他用户类的实现类</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午6:02:17
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 * @version V1.0
 */
public class OtherUserInfo implements IOtherInfo {

    @Override
    public HashMap<String, String> getUserInfo() {
        HashMap<String, String> hashMap = new HashMap<>(16);
        hashMap.put("username", "周星星");
        hashMap.put("address", "弥敦路9号");
        hashMap.put("number", "9527");
        hashMap.put("sex", "男");
        return hashMap;
    }

    @Override
    public HashMap<String, String> getUserJobInfo() {
        HashMap<String, String> hashMap = new HashMap<>(16);
        hashMap.put("jobaddress", "星辉公司");
        return hashMap;
    }


}
