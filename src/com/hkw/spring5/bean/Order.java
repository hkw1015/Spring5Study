package com.hkw.spring5.bean;

public class Order {
    private String oname;

    // 无参构造
    public Order() {
        System.out.println("第一步，执行无参构造方法创建Bean实例");
    }

    public void setOname(String oname) {
        System.out.println("第二步，调用set方法设置属性值");
        this.oname = oname;
    }

    // 创建执行初始化的方法(需要进行配置 init-method属性：init-method="initMehtod")
    public void initMethod() {
        System.out.println("第三步，执行初始化的方法");
    }

    // 创建执行销毁的方法(需要进行配置 destroy-method属性：destroy-method="destroyMethod")
    public void destroyMethod() {
        System.out.println("第五步，执行销毁的方法");
    }

}
