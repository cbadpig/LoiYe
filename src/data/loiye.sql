/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : loiye

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-11-09 09:38:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_hs_dt
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_dt`;
CREATE TABLE `t_hs_dt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yh_id` int(11) DEFAULT NULL,
  `dx_id` int(11) DEFAULT NULL,
  `lx` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_dt
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_dz
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_dz`;
CREATE TABLE `t_hs_dz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yh_id` int(11) DEFAULT NULL,
  `zj_id` int(11) DEFAULT NULL,
  `zjyh_id` int(11) DEFAULT NULL,
  `zt` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_dz
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_gz
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_gz`;
CREATE TABLE `t_hs_gz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gzyh_id` int(11) DEFAULT NULL,
  `dxyh_id` int(11) DEFAULT NULL,
  `zt` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_gz
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_pl
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_pl`;
CREATE TABLE `t_hs_pl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `f_id` int(11) DEFAULT NULL,
  `zj_id` int(11) DEFAULT NULL,
  `plyh_id` int(11) DEFAULT NULL,
  `dxyh_id` int(11) DEFAULT NULL,
  `dzsl` int(11) DEFAULT NULL,
  `plnr` text,
  `plsj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_pl
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_sc
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_sc`;
CREATE TABLE `t_hs_sc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yh_id` int(11) DEFAULT NULL,
  `zj_id` int(11) DEFAULT NULL,
  `zjyh_id` int(11) DEFAULT NULL,
  `zt` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_sc
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_sx
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_sx`;
CREATE TABLE `t_hs_sx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sxyh_id` int(11) DEFAULT NULL,
  `dxyh_id` int(11) DEFAULT NULL,
  `nr` text,
  `zt` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_sx
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_tg
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_tg`;
CREATE TABLE `t_hs_tg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yh_id` int(11) DEFAULT NULL,
  `zj_id` int(11) DEFAULT NULL,
  `wz_id` int(11) DEFAULT NULL,
  `zt` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_tg
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_wzwj
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_wzwj`;
CREATE TABLE `t_hs_wzwj` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wj_id` int(11) DEFAULT NULL,
  `bt` varchar(64) DEFAULT NULL,
  `ms` varchar(255) DEFAULT NULL,
  `fm` varchar(64) DEFAULT NULL,
  `nr` text,
  `wzzt` int(11) DEFAULT NULL,
  `wzzs` int(11) DEFAULT NULL,
  `ydsl` int(11) DEFAULT NULL,
  `plsl` int(11) DEFAULT NULL,
  `xhsl` int(11) DEFAULT NULL,
  `zssl` int(11) DEFAULT NULL,
  `fbsj` varchar(64) DEFAULT NULL,
  `wzxh` int(11) DEFAULT NULL,
  `yh_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_wzwj
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_xh
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_xh`;
CREATE TABLE `t_hs_xh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yh_id` int(11) DEFAULT NULL,
  `zj_id` int(11) DEFAULT NULL,
  `zjyh_id` int(11) DEFAULT NULL,
  `zt` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_xh
-- ----------------------------

-- ----------------------------
-- Table structure for t_hs_zs
-- ----------------------------
DROP TABLE IF EXISTS `t_hs_zs`;
CREATE TABLE `t_hs_zs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yh_id` int(11) DEFAULT NULL,
  `zsje` int(11) DEFAULT NULL,
  `zj_id` int(11) DEFAULT NULL,
  `zjyh_id` int(11) DEFAULT NULL,
  `zt` int(11) DEFAULT NULL,
  `sj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hs_zs
-- ----------------------------

-- ----------------------------
-- Table structure for t_sys_hmd
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_hmd`;
CREATE TABLE `t_sys_hmd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yh_id` int(11) DEFAULT NULL,
  `hyh_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_hmd
-- ----------------------------

-- ----------------------------
-- Table structure for t_sys_yh
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_yh`;
CREATE TABLE `t_sys_yh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sj` char(10) DEFAULT NULL,
  `yx` varchar(64) DEFAULT NULL,
  `mm` varchar(64) DEFAULT NULL,
  `nc` varchar(12) DEFAULT NULL,
  `xb` int(11) DEFAULT NULL,
  `lx` int(11) DEFAULT NULL,
  `jsxx` int(11) DEFAULT NULL,
  `jsyxtz` int(11) DEFAULT NULL,
  `grms` varchar(64) DEFAULT NULL,
  `zskg` int(11) DEFAULT NULL,
  `zsms` varchar(64) DEFAULT NULL,
  `txtp` varchar(64) DEFAULT NULL,
  `zcsj` varchar(64) DEFAULT NULL,
  `dlsj` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_yh
-- ----------------------------
