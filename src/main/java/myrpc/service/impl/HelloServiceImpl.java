package myrpc.service.impl;

import myrpc.service.HelloService;

/**
 * @Description HelloServiceImpl
 * @Author xusheng
 * @Create 2018-05-01 22:58
 * @Version 1.0
 **/
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello(String name) {
        return "Hello "+name;
    }
}
