package com.yifenxiang.dao;


import com.yifenxiang.entity.SysRoleEntity;
import com.yifenxiang.entity.UserWindowDto;

import java.util.List;

/**
 * 角色管理
 *
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 查询用户创建的角色ID列表
     */
    List<Long> queryRoleIdList(Long createUserId);

    /**
     * 查询角色审批选择范围
     * @return
     */
    List<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto);
}
