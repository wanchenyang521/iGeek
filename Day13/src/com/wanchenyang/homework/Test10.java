package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:27
 * @description
 **/
public class Test10
{
    public static void main(String[] args)
    {
        IGeekLecturer iGeekLecturer = new IGeekLecturer("666", "傅红雪");
        IGeekTutor iGeekTutor = new IGeekTutor("668", "顾棋");
        IGeekMaintainer iGeekMaintainer = new IGeekMaintainer("686", "庖丁");
        IGeekBuyer iGeekBuyer = new IGeekBuyer("888", "景甜");
        System.out.print(" 讲师: 工号为 "+iGeekLecturer.getId()+" 的讲师 "+iGeekLecturer.getName());
        iGeekLecturer.work();

        System.out.print(" 助教: 工号为 "+iGeekTutor.getId()+" 的助教 "+iGeekTutor.getName());
        iGeekTutor.work();

        System.out.print(" 维护专员: 工号为 "+iGeekMaintainer.getId()+" 的维护专员 "+iGeekMaintainer.getName());
        iGeekMaintainer.work();

        System.out.print(" 采购专员: 工号为 "+iGeekBuyer.getId()+" 的采购专员 "+iGeekBuyer.getName());
        iGeekBuyer.work();

    }
}
