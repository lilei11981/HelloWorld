package com.shrbank.test.ioCallback.iocallback4;


/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-04
 * Time: 下午4:49
 * Description:
 * 接口回调测试
 */

public class Me implements Bound {
    public Me(You you) {
        you.dosth(this, "整体公司文件");
    }

    public void doresult(String result) {
        System.out.println("事情" + result);
    }
}


