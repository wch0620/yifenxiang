package com.yifenxiang.service.impl;

import com.yifenxiang.dao.SysRegionDao;
import com.yifenxiang.entity.SysRegionEntity;
import com.yifenxiang.service.SysRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 */
@Service("regionService")
public class SysRegionServiceImpl implements SysRegionService {
    @Autowired
    private SysRegionDao sysRegionDao;

    @Override
    public SysRegionEntity queryObject(Integer id) {
        return sysRegionDao.queryObject(id);
    }

    @Override
    public List<SysRegionEntity> queryList(Map<String, Object> map) {
        return sysRegionDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysRegionDao.queryTotal(map);
    }

    @Override
    public int save(SysRegionEntity region) {
        return sysRegionDao.save(region);
    }

    @Override
    public int update(SysRegionEntity region) {
        return sysRegionDao.update(region);
    }

    @Override
    public int delete(Integer id) {
        return sysRegionDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return sysRegionDao.deleteBatch(ids);
    }
}
