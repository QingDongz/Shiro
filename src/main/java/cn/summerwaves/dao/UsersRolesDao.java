package cn.summerwaves.dao;

import cn.summerwaves.model.UsersRoles;

public interface UsersRolesDao {
    int deleteByPrimaryKey(Long id);

    int insert(UsersRoles record);

    int insertSelective(UsersRoles record);

    UsersRoles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UsersRoles record);

    int updateByPrimaryKey(UsersRoles record);
}