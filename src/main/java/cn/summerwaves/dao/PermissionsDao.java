package cn.summerwaves.dao;

import cn.summerwaves.model.Permissions;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionsDao {
    int deleteByPrimaryKey(Long id);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}