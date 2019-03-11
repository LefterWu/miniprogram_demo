package com.wuleshen.miniprogram.demo.dao;

import com.wuleshen.miniprogram.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wuleshen on 2019/3/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void selectByName() {
        Area area = areaDao.selectByName("上海");
        System.out.println(area);
    }

    @Test
    public void selectAll() {
        System.out.println(areaDao.selectAll());
    }

    @Test
    public void selectAreaById() {
        System.out.println(areaDao.selectAreaById(1001));
    }

    @Test
    public void insertArea() {
        Area area = new Area("杭州", 4);
        System.out.println(areaDao.insertArea(area));
    }

    @Test
    public void updateArea() {
        Area area = new Area(1005, "成都", 5);
        System.out.println(areaDao.updateArea(area));
    }

    @Test
    public void deleteArea() {
        areaDao.deleteArea(1005);
    }
}