-- 数据库初始化
CREATE DATABASE miniprogram_demo;

USE miniprogram_demo;

CREATE TABLE `area` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '名称',
  `priority` int(3) NOT NULL COMMENT '优先级',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_edit_time` datetime DEFAULT NULL COMMENT '最后编辑时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '地区表';

INSERT INTO
  area(name, priority)
VALUES
  ('北京', 1),
  ('上海', 1),
  ('深圳', 1),
  ('广州', 1);