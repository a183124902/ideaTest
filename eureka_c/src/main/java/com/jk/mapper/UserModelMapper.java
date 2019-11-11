package com.jk.mapper;

import com.jk.model.UserModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);


    @Select("select count(*) from table_user")
    Integer queryUserCount();

    @Select("select * from table_user limit #{start},#{rows}")
    List<UserModel> queryUser(@Param("start") Integer start, @Param("rows") Integer rows);
}