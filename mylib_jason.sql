/*
Navicat MySQL Data Transfer

Source Server         : mysql2
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : mylib_jason

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2016-12-22 06:12:25
*/
set character_set_client=utf8;
set character_set_connection=utf8;
set character_set_results=utf8;
set character_set_server=utf8;
set character_set_system=utf8;
set character_set_database=utf8;
set collation_connection=utf8;
set collation_server=utf8;

create datebase mylib_jason;
use mylib_jason;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bookinfo
-- ----------------------------
DROP TABLE IF EXISTS `bookinfo`;
CREATE TABLE `bookinfo` (
  `bookname` varchar(30) NOT NULL,
  `author` varchar(30) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `bookcomment` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`bookname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookinfo
-- ----------------------------
INSERT INTO `bookinfo` VALUES ('数据库组成原理', '王珊', '4', '好的');
INSERT INTO `bookinfo` VALUES ('钢琴曲集', '肖邦', '1', '棒极了');

-- ----------------------------
-- Table structure for userlog
-- ----------------------------
DROP TABLE IF EXISTS `userlog`;
CREATE TABLE `userlog` (
  `id` varchar(30) NOT NULL,
  `pswd` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userlog
-- ----------------------------
INSERT INTO `userlog` VALUES ('jason', '123qwe');
INSERT INTO `userlog` VALUES ('root', 'root');
INSERT INTO `userlog` VALUES ('哈哈', '222');
INSERT INTO `userlog` VALUES ('朴', '213');
INSERT INTO `userlog` VALUES ('朴成', '123qwe');

-- ----------------------------
-- Table structure for userlog_bookinfo
-- ----------------------------
DROP TABLE IF EXISTS `userlog_bookinfo`;
CREATE TABLE `userlog_bookinfo` (
  `id` varchar(30) NOT NULL,
  `bookname` varchar(30) NOT NULL,
  `borrowdate` date DEFAULT NULL,
  `returndate` date DEFAULT NULL,
  `hasbeenrenewed` int(11) DEFAULT '0',
  `actualreturndate` date DEFAULT NULL,
  PRIMARY KEY (`id`,`bookname`),
  KEY `bookname` (`bookname`),
  CONSTRAINT `userlog_bookinfo_ibfk_1` FOREIGN KEY (`bookname`) REFERENCES `bookinfo` (`bookname`),
  CONSTRAINT `userlog_bookinfo_ibfk_2` FOREIGN KEY (`id`) REFERENCES `userlog` (`id`),
  CONSTRAINT `userlog_bookinfo_ibfk_3` FOREIGN KEY (`id`) REFERENCES `userlog` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userlog_bookinfo
-- ----------------------------
INSERT INTO `userlog_bookinfo` VALUES ('jason', '钢琴曲集', '2016-12-22', '2017-03-28', '2', null);
INSERT INTO `userlog_bookinfo` VALUES ('朴成', '数据库组成原理', '2016-12-22', '2017-01-28', '0', null);
INSERT INTO `userlog_bookinfo` VALUES ('朴成', '钢琴曲集', '2016-12-22', '2017-01-28', '0', null);
