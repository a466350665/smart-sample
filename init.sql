/*
 Navicat MySQL Data Transfer

 Source Server         : local5.7
 Source Server Type    : MySQL
 Source Server Version : 50742
 Source Host           : localhost:3306
 Source Schema         : smart_sample

 Target Server Type    : MySQL
 Target Server Version : 50742
 File Encoding         : 65001

 Date: 14/07/2023 11:25:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_demo
-- ----------------------------
DROP TABLE IF EXISTS `t_demo`;
CREATE TABLE `t_demo` (
  `id` bigint(19) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `code` varchar(50) NOT NULL COMMENT '编码',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_t_demo_01` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COMMENT='Demo';

-- ----------------------------
-- Records of t_demo
-- ----------------------------
BEGIN;
INSERT INTO `t_demo` VALUES (45, 'test', 'test', '2023-07-14 11:21:09', '2023-07-14 11:21:09');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
