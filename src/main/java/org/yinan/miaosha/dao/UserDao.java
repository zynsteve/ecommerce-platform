package org.yinan.miaosha.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.yinan.miaosha.domain.User;

@Mapper
public interface UserDao {
    @Select("Select * from user where id = #{id}")
    public User getById(@Param("id")int id);

    @Insert("insert into user(id, name)values(#{id}, #{name})")
    public int insert(User user);
}
