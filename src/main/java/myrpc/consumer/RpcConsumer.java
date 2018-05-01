package myrpc.consumer;

import myrpc.framework.RpcFrameWork;
import myrpc.service.HelloService;

/**
 * @Description RpcConsumer
 * @Author xusheng
 * @Create 2018-05-01 23:01
 * @Version 1.0
 **/
public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        HelloService helloService = RpcFrameWork.refer(HelloService.class,"127.0.0.1",1234);
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            String hello = helloService.hello("World "+i);
            System.out.println(hello);
            Thread.sleep(1000);

        }
    }
}
