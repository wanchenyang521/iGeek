package com.wanchenyang.supermark;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 08:42
 * @description
 * 名称,货号,单价,数量,计价单位,金额
 **/
public class GoodsItem
{
    // 成员变量
    /**
     * @Fields name : 名称
     */
    private String name;
    /**
     * @Fields id : 货号
     */
    private String id;
    /**
     * @Fields price : 单价
     */
    private double price;
    /**
     * @Fields number : 数量
     */
    private int number;
    /**
     * @Fields unit : 计价单位
     */
    private String unit;
    /**
     * @Fields money : 金额
     */
    private double money;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public double getMoney()
    {
        return money;
    }

    public void setMoney(double money)
    {
        this.money = money;
    }

    public GoodsItem()
    {
    }

    public GoodsItem(String name, String id, double price, int number, String unit, double money)
    {
        this.name = name;
        this.id = id;
        this.price = price;
        this.number = number;
        this.unit = unit;
        this.money = money;
    }
}
