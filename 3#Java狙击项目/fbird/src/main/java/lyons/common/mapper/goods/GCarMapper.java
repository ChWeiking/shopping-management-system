package lyons.common.mapper.goods;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lyons.common.model.goods.GCar;

public interface GCarMapper {
    
    /** find goods of car by username*/
    List<GCar> selectByuName(@Param("username") String username);

    /** delete one goods of car by car-id and username*/
    int deleteByCondition(@Param("gCarUName") String gCarUName, @Param("gCarGId") String gCarGId);

    /** add goods to car*/
    int addGoods(GCar car);


    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    long countByExample(GCarExample example);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    int deleteByExample(GCarExample example);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    int deleteByPrimaryKey(Integer gCarId);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    int insert(GCar record);


    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    List<GCar> selectByExample(GCarExample example);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    GCar selectByPrimaryKey(Integer gCarId);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    int updateByExampleSelective(@Param("record") GCar record, @Param("example") GCarExample example);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    int updateByExample(@Param("record") GCar record, @Param("example") GCarExample example);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    int updateByPrimaryKeySelective(GCar record);

    *//**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table G_CAR
     *
     * @mbg.generated Mon Feb 13 19:32:34 CST 2017
     *//*
    int updateByPrimaryKey(GCar record);*/
}