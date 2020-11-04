
-- 数据库创建以下几个表(用户表，角色表，用户-角色表，权限表，角色-权限表)
-- user_info.sql(用户表)
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT '' COMMENT '用户名',
  `password` varchar(256) DEFAULT NULL COMMENT '登录密码',
  `name` varchar(256) DEFAULT NULL COMMENT '用户真实姓名',
  `id_card_num` varchar(256) DEFAULT NULL COMMENT '用户身份证号',
  `state` char(1) DEFAULT '0' COMMENT '用户状态：0:正常状态,1：用户被锁定',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`) USING BTREE,
  UNIQUE KEY `id_card_num` (`id_card_num`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- sys_role.sql(角色表)
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `available` char(1) DEFAULT '0' COMMENT '是否可用0可用  1不可用',
  `role` varchar(20) DEFAULT NULL COMMENT '角色标识程序中判断使用,如"admin"',
  `description` varchar(100) DEFAULT NULL COMMENT '角色描述,UI界面显示使用',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role` (`role`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- sys_user_role.sql(用户-角色表)
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  KEY `uid` (`uid`) USING BTREE,
  KEY `role_id` (`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- sys_permission.sql(权限表)
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` int(11) DEFAULT NULL COMMENT '父编号,本权限可能是该父编号权限的子权限',
  `parent_ids` varchar(20) DEFAULT NULL COMMENT '父编号列表',
  `permission` varchar(100) DEFAULT NULL COMMENT '权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view',
  `resource_type` varchar(20) DEFAULT NULL COMMENT '资源类型，[menu|button]',
  `url` varchar(200) DEFAULT NULL COMMENT '资源路径 如：/userinfo/list',
  `name` varchar(50) DEFAULT NULL COMMENT '权限名称',
  `available` char(1) DEFAULT '0' COMMENT '是否可用0可用  1不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- sys_role_permission.sql(角色-权限表)
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `permission_id` int(11) DEFAULT NULL COMMENT '权限id',
  KEY `role_id` (`role_id`) USING BTREE,
  KEY `permission_id` (`permission_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

