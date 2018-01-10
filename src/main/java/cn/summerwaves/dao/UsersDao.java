package cn.summerwaves.dao;

import cn.summerwaves.model.Users;

public interface UsersDao {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users findUserByUsername(String username);
}