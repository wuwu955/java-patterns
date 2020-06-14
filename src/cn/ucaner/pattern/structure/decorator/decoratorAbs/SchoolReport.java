package cn.ucaner.pattern.structure.decorator.decoratorAbs;

/**
 * @version V1.0
 * @Package：cn.ucaner.pattern.structure.decorator.decoratorAbs
 * @ClassName：SchoolReport
 * @Description： <p> 装饰器模式  -  成绩单抽象类</p>
 * @Author： -
 * @CreatTime：2017年10月26日 下午5:17:14
 * @Modify By：
 * @ModifyTime：
 * @Modify marker：
 */
public abstract class SchoolReport {

    /**
     * 展示自己的成绩
     */
    public abstract void report();

    /**
     * 家长签名
     */
    public abstract void sign(String name);

    /**
     * 建议-给出建议
     */
    public abstract void discuss(String discuss);

}
