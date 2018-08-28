/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 8.0.12 : Database - qrci
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `system_action` */

DROP TABLE IF EXISTS `system_action`;

CREATE TABLE `system_action` (
  `act_id` bigint(20) DEFAULT NULL COMMENT '功能主键',
  `act_name` varchar(100) DEFAULT NULL COMMENT '功能权限名称',
  `act_parent_id` bigint(20) DEFAULT NULL COMMENT '功能父节点',
  `act_order` bigint(20) DEFAULT NULL COMMENT '功能顺序',
  `act_url` varchar(200) DEFAULT NULL COMMENT '菜单地址',
  `act_common` varchar(200) DEFAULT NULL COMMENT '功能备注',
  `act_icon` varchar(50) DEFAULT NULL COMMENT '菜单图标'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限功能';

/*Data for the table `system_action` */

/*Table structure for table `system_role` */

DROP TABLE IF EXISTS `system_role`;

CREATE TABLE `system_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `common` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_userid` bigint(20) DEFAULT NULL COMMENT '创建用户id',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='角色信息';

/*Data for the table `system_role` */

/*Table structure for table `system_role_action_ra` */

DROP TABLE IF EXISTS `system_role_action_ra`;

CREATE TABLE `system_role_action_ra` (
  `role_id` bigint(20) NOT NULL COMMENT '角色主键',
  `action_id` bigint(20) NOT NULL COMMENT '权限功能主键'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限关联';

/*Data for the table `system_role_action_ra` */

/*Table structure for table `system_user` */

DROP TABLE IF EXISTS `system_user`;

CREATE TABLE `system_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实名称',
  `department_id` bigint(20) DEFAULT NULL COMMENT '部门',
  `user_number` varchar(50) DEFAULT NULL COMMENT '员工编号',
  `phone` varchar(50) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `del_flag` int(11) DEFAULT NULL COMMENT '逻辑删除标志(0:未删除1：已删除)',
  `department_leader` int(10) DEFAULT NULL COMMENT '是否部门领导（0：不是 1：是）',
  `charge_leader` int(10) DEFAULT NULL COMMENT '是否分管领导（0：不是 1：是）',
  `user_position` varchar(50) DEFAULT NULL COMMENT '职位（安监）',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建者Id',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=168 DEFAULT CHARSET=utf8 COMMENT='用户信息';

/*Data for the table `system_user` */

/*Table structure for table `system_user_role_ra` */

DROP TABLE IF EXISTS `system_user_role_ra`;

CREATE TABLE `system_user_role_ra` (
  `user_id` bigint(20) NOT NULL COMMENT '用户主键',
  `role_id` bigint(20) NOT NULL COMMENT '角色主键',
  KEY `user_id` (`user_id`) USING BTREE,
  KEY `role_id` (`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联';

/*Data for the table `system_user_role_ra` */

/*Table structure for table `t_device` */

DROP TABLE IF EXISTS `t_device`;

CREATE TABLE `t_device` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `device_num` varchar(100) DEFAULT NULL COMMENT '设备编号',
  `device_name` varchar(100) DEFAULT NULL COMMENT '设备名称',
  `device_type_name` int(11) DEFAULT NULL COMMENT '设备类型',
  `device_type_id` bigint(20) DEFAULT NULL COMMENT '设备类型id',
  `product_num` varchar(100) DEFAULT NULL COMMENT '出厂编号',
  `zone_area_id` bigint(20) DEFAULT NULL COMMENT '所属台区所属台区(主键)',
  `producter_name` varchar(100) DEFAULT NULL COMMENT '厂家名称',
  `line_id` bigint(20) DEFAULT NULL COMMENT '所属线路',
  `project_id` bigint(20) DEFAULT NULL COMMENT '所属项目',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_tiem` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='设备';

/*Data for the table `t_device` */

insert  into `t_device`(`id`,`device_num`,`device_name`,`device_type_name`,`device_type_id`,`product_num`,`zone_area_id`,`producter_name`,`line_id`,`project_id`,`comment`,`create_time`,`update_tiem`) values (2,'num2','name2',2,1,'productNum1',1,'producterName1',1,1,'string',12345689845,NULL),(3,'num3','name3',2,1,'productNum1',1,'producterName1',1,1,'string',12345689845,NULL),(4,'num4','name4',2,1,'productNum1',1,'producterName1',1,1,'string',12345689845,NULL);

/*Table structure for table `t_device_instruction` */

DROP TABLE IF EXISTS `t_device_instruction`;

CREATE TABLE `t_device_instruction` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `device_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `device_num` varchar(100) DEFAULT NULL COMMENT '编号',
  `file_path` varchar(100) DEFAULT NULL COMMENT '附件路径',
  `file_name` varchar(100) DEFAULT NULL COMMENT '附件名称',
  `instruction_type` int(11) DEFAULT NULL COMMENT '类型',
  `device_id` bigint(20) DEFAULT NULL COMMENT '所属设备',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备说明书';

/*Data for the table `t_device_instruction` */

/*Table structure for table `t_device_type` */

DROP TABLE IF EXISTS `t_device_type`;

CREATE TABLE `t_device_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `type_num` varchar(100) DEFAULT NULL COMMENT '编号',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备类型';

/*Data for the table `t_device_type` */

/*Table structure for table `t_device_type_property` */

DROP TABLE IF EXISTS `t_device_type_property`;

CREATE TABLE `t_device_type_property` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `device_type_id` bigint(20) DEFAULT NULL COMMENT '设备类型id',
  `property_name` char(10) DEFAULT NULL COMMENT '属性名称',
  `property_value` char(10) DEFAULT NULL COMMENT '属性值',
  `property_key` char(10) DEFAULT NULL COMMENT '属性标识(服务端自动生成)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备类型属性表';

/*Data for the table `t_device_type_property` */

/*Table structure for table `t_engineering_drawing` */

DROP TABLE IF EXISTS `t_engineering_drawing`;

CREATE TABLE `t_engineering_drawing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `draw_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `draw_num` varchar(100) DEFAULT NULL COMMENT '编号',
  `file_path` varchar(200) DEFAULT NULL COMMENT '附件路径',
  `file_name` varchar(100) DEFAULT NULL COMMENT '附件名称',
  `draw_type` int(11) DEFAULT NULL COMMENT '图纸类型',
  `project_id` bigint(20) DEFAULT NULL COMMENT '所属项目',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='电气图纸表';

/*Data for the table `t_engineering_drawing` */

/*Table structure for table `t_line` */

DROP TABLE IF EXISTS `t_line`;

CREATE TABLE `t_line` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `line_name` varchar(100) DEFAULT NULL COMMENT '线路名称',
  `line_type` int(11) DEFAULT NULL COMMENT '线路类型',
  `file_name` varchar(100) DEFAULT NULL COMMENT '附件名称',
  `file_path` varchar(100) DEFAULT NULL COMMENT '附件路径',
  `line_voltage` varchar(50) DEFAULT NULL COMMENT '电压',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='线路';

/*Data for the table `t_line` */

/*Table structure for table `t_operation_instruction` */

DROP TABLE IF EXISTS `t_operation_instruction`;

CREATE TABLE `t_operation_instruction` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `instruction_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `file_name` varchar(100) DEFAULT NULL COMMENT '附件名称',
  `file_path` varchar(100) DEFAULT NULL COMMENT '附件路径',
  `instruction_type` int(11) DEFAULT NULL COMMENT '类型',
  `device_id` bigint(20) DEFAULT NULL COMMENT '所属设备',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_tiem` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作指导';

/*Data for the table `t_operation_instruction` */

/*Table structure for table `t_person_info` */

DROP TABLE IF EXISTS `t_person_info`;

CREATE TABLE `t_person_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `person_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `telphone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `part_id` bigint(20) DEFAULT NULL COMMENT '所属机构(班组，部门)',
  `part_type` int(11) DEFAULT NULL COMMENT '机构类型(班组，部门)',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(50) DEFAULT NULL COMMENT '密码',
  `unility_id` bigint(20) DEFAULT NULL COMMENT '所属供电所',
  `person_email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  `is_enable` int(11) DEFAULT NULL COMMENT '是否冻结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='人员';

/*Data for the table `t_person_info` */

insert  into `t_person_info`(`id`,`person_name`,`telphone`,`part_id`,`part_type`,`user_name`,`user_password`,`unility_id`,`person_email`,`comment`,`create_time`,`update_time`,`is_enable`) values (1,'string','18711112222',1,1,'name1','string',1,'string','string',123123231223,NULL,1);

/*Table structure for table `t_power_supply_bureau` */

DROP TABLE IF EXISTS `t_power_supply_bureau`;

CREATE TABLE `t_power_supply_bureau` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `bureau_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `telphone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供电局';

/*Data for the table `t_power_supply_bureau` */

/*Table structure for table `t_power_supply_utility` */

DROP TABLE IF EXISTS `t_power_supply_utility`;

CREATE TABLE `t_power_supply_utility` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `utility_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `bureau_id` bigint(20) DEFAULT NULL COMMENT '所属供电局(主键)',
  `utility_phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供电所';

/*Data for the table `t_power_supply_utility` */

/*Table structure for table `t_project` */

DROP TABLE IF EXISTS `t_project`;

CREATE TABLE `t_project` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `project_num` varchar(50) DEFAULT NULL COMMENT '项目编号',
  `project_name` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `project_position` varchar(100) DEFAULT NULL COMMENT '项目位置',
  `finish_time` bigint(20) DEFAULT NULL COMMENT '竣工时间',
  `project_type` int(11) DEFAULT NULL COMMENT '类型',
  `development_unit` varchar(100) DEFAULT NULL COMMENT '建设单位',
  `manufacturer` varchar(100) DEFAULT NULL COMMENT '设备厂家',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目表';

/*Data for the table `t_project` */

/*Table structure for table `t_repair_info` */

DROP TABLE IF EXISTS `t_repair_info`;

CREATE TABLE `t_repair_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `telphone` varchar(50) DEFAULT NULL COMMENT '联系方式',
  `repair_type` int(11) DEFAULT NULL COMMENT '类型',
  `ower_id` bigint(20) DEFAULT NULL COMMENT '所属对象主键(项目、设备厂家)',
  `ower_type` int(11) DEFAULT NULL COMMENT '所属对象类型',
  `repair_unit_type` int(11) DEFAULT NULL COMMENT '维护单位类型(施工工队、建设部门、运行维护)',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='维护信息';

/*Data for the table `t_repair_info` */

/*Table structure for table `t_team_group` */

DROP TABLE IF EXISTS `t_team_group`;

CREATE TABLE `t_team_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `group_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `unit_id` bigint(20) DEFAULT NULL COMMENT '所属部门(主键)',
  `group_phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班组';

/*Data for the table `t_team_group` */

/*Table structure for table `t_zone_area` */

DROP TABLE IF EXISTS `t_zone_area`;

CREATE TABLE `t_zone_area` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `zone_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `address` varchar(100) DEFAULT NULL COMMENT '位置',
  `line_id` bigint(20) DEFAULT NULL COMMENT '所属线路(主键)',
  `unility_id` bigint(20) DEFAULT NULL COMMENT '所属供电所(主键)',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='台区';

/*Data for the table `t_zone_area` */

/*Table structure for table `unit_info` */

DROP TABLE IF EXISTS `unit_info`;

CREATE TABLE `unit_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `unit_name` varchar(100) DEFAULT NULL COMMENT '名称',
  `bureau_id` bigint(20) DEFAULT NULL COMMENT '所属供电局',
  `unit_phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` bigint(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门';

/*Data for the table `unit_info` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
