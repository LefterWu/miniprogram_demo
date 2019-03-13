package com.wuleshen.miniprogram.demo.service.impl;

import com.wuleshen.miniprogram.demo.dao.AreaDao;
import com.wuleshen.miniprogram.demo.entity.Area;
import com.wuleshen.miniprogram.demo.exception.IllegalAreaArgumentException;
import com.wuleshen.miniprogram.demo.exception.OperationAreaException;
import com.wuleshen.miniprogram.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by wuleshen on 2019/3/11
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> findAll() {
        return areaDao.selectAll();
    }

    @Override
    public Area findAreaById(Integer id) throws IllegalAreaArgumentException {
        if (id < 0) {
            throw new IllegalAreaArgumentException("id参数异常");
        }
        return areaDao.selectAreaById(id);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) throws OperationAreaException, IllegalAreaArgumentException {
        if (!StringUtils.isEmpty(area.getName())) {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            int insertRow = areaDao.insertArea(area);
            if (insertRow > 0) {
                return true;
            } else {
                throw new OperationAreaException("插入信息失败");
            }
        }
        throw new IllegalAreaArgumentException("地区参数异常");
    }

    @Override
    public boolean modifyArea(Area area) throws OperationAreaException, IllegalAreaArgumentException {
        if (!StringUtils.isEmpty(area.getId())) {
            area.setLastEditTime(new Date());

            int updateRow = areaDao.updateArea(area);
            if (updateRow > 0) {
                return true;
            } else {
                throw new OperationAreaException("更新信息失败");
            }
        }
        throw new IllegalAreaArgumentException("地区id不存在");
    }

    @Override
    public boolean deleteArea(int id) throws OperationAreaException, IllegalAreaArgumentException {
        if (id > 0) {
            int deleteRow = areaDao.deleteArea(id);
            if (deleteRow > 0) {
                return true;
            } else {
                throw new OperationAreaException("删除信息失败");
            }
        }
        throw new IllegalAreaArgumentException("地区id错误");
    }

    @Override
    public Area findByName(String name) throws IllegalAreaArgumentException {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalAreaArgumentException("名称不存在");
        }
        return areaDao.selectByName(name);
    }
}
