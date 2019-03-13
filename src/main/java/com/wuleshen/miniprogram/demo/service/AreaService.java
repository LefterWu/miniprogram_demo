package com.wuleshen.miniprogram.demo.service;

import com.wuleshen.miniprogram.demo.dao.AreaDao;
import com.wuleshen.miniprogram.demo.entity.Area;
import com.wuleshen.miniprogram.demo.exception.IllegalAreaArgumentException;
import com.wuleshen.miniprogram.demo.exception.OperationAreaException;

import java.util.List;

/**
 * Created by wuleshen on 2019/3/11
 */
public interface AreaService {

    List<Area> findAll();

    Area findAreaById(Integer id) throws IllegalAreaArgumentException;

    boolean addArea(Area area) throws OperationAreaException, IllegalAreaArgumentException;

    boolean modifyArea(Area area) throws OperationAreaException, IllegalAreaArgumentException;

    boolean deleteArea(int id) throws OperationAreaException, IllegalAreaArgumentException;

    Area findByName(String name) throws IllegalAreaArgumentException;
}
