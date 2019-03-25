package com.wanchenyang.interfaceExtends;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 10:40
 * @description
 * face1 面积
 * face2 颜色
 * face3 体积
 * java中支持单继承
 * 接口的继承
 **/
public interface Face3 extends Face1,Face2
{
    abstract void volum();
}
