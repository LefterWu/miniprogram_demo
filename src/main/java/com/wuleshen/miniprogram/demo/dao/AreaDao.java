package com.wuleshen.miniprogram.demo.dao;

import com.wuleshen.miniprogram.demo.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by wuleshen on 2019/3/11
 */
@Component
public interface AreaDao {

    List<Area> selectAll();

    Area selectAreaById(Integer id);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int id);

    Area selectByName(String name);
}
