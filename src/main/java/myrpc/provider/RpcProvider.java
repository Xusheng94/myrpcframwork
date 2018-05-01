package myrpc.provider;

import myrpc.framework.RpcFrameWork;
import myrpc.service.HelloService;
import myrpc.service.impl.HelloServiceImpl;

/**
 * @Description RpcProvider
 * @Author xusheng
 * @Create 2018-05-01 22:59
 * @Version 1.0
 **/
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService helloService = new HelloServiceImpl();
        RpcFrameWork.export(helloService,1234);
    }
}
