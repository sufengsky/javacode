--创建数据库
create database myexam charset utf8

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blankchp`
-- ----------------------------
DROP TABLE IF EXISTS `blankchp`;
CREATE TABLE `blankchp` (
  `id` int(11) NOT NULL,
  `chp_r` double DEFAULT NULL,
  `chp` varbinary(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blankchp
-- ----------------------------

-- ----------------------------
-- Table structure for `blankdiff`
-- ----------------------------
DROP TABLE IF EXISTS `blankdiff`;
CREATE TABLE `blankdiff` (
  `id` int(11) NOT NULL,
  `d1_r` double DEFAULT NULL,
  `d2_r` double DEFAULT NULL,
  `d3_r` double DEFAULT NULL,
  `d4_r` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blankdiff
-- ----------------------------

-- ----------------------------
-- Table structure for `blankinfo`
-- ----------------------------
DROP TABLE IF EXISTS `blankinfo`;
CREATE TABLE `blankinfo` (
  `id` int(11) NOT NULL,
  `timu` varbinary(20) DEFAULT NULL,
  `ans` varbinary(20) DEFAULT NULL,
  `chp` int(11) DEFAULT NULL,
  `diff` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blankinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `paper`
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `id` int(11) NOT NULL,
  `paper_user` varbinary(10) DEFAULT NULL,
  `blank_num` int(11) DEFAULT NULL,
  `operate_num` int(11) DEFAULT NULL,
  `select_num` int(11) DEFAULT NULL,
  `select_value` int(11) DEFAULT NULL,
  `operate_value` int(11) DEFAULT NULL,
  `blank_value` int(11) DEFAULT NULL,
  `paper_type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paper
-- ----------------------------

-- ----------------------------
-- Table structure for `selectchp`
-- ----------------------------
DROP TABLE IF EXISTS `selectchp`;
CREATE TABLE `selectchp` (
  `id` int(11) NOT NULL,
  `chp` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `chp_r` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of selectchp
-- ----------------------------
INSERT INTO `selectchp` VALUES ('1', '1', '50');
INSERT INTO `selectchp` VALUES ('2', '2', '30');

-- ----------------------------
-- Table structure for `selectdiff`
-- ----------------------------
DROP TABLE IF EXISTS `selectdiff`;
CREATE TABLE `selectdiff` (
  `id` int(11) NOT NULL,
  `d1_r` double DEFAULT NULL,
  `d2_r` double DEFAULT NULL,
  `d3_r` double DEFAULT NULL,
  `d4_r` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of selectdiff
-- ----------------------------

-- ----------------------------
-- Table structure for `selectinfo`
-- ----------------------------
DROP TABLE IF EXISTS `selectinfo`;
CREATE TABLE `selectinfo` (
  `timu_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `timu` varbinary(100) DEFAULT NULL,
  `ans` varbinary(100) DEFAULT NULL,
  `a` varbinary(100) DEFAULT NULL,
  `b` varbinary(100) DEFAULT NULL,
  `c` varbinary(100) DEFAULT NULL,
  `d` varbinary(100) DEFAULT NULL,
  `chp` int(11) DEFAULT NULL,
  `diff` int(11) DEFAULT NULL,
  PRIMARY KEY (`timu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of selectinfo
-- ----------------------------
INSERT INTO `selectinfo` VALUES ('1', 0xC397C3AEC2B4C3BAC382C3ABC38DC3B8C395C2BEC2B5C398C396C2B7, 0x7A75696461696D612E636F6D, 0x7A75696461696D612E636F6D, 0x7A75696461696D612E636F6D, 0x7A75696461696D612E636F6D, 0x7A75696461696D612E636F6D, '1', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `banji` varbinary(20) DEFAULT NULL,
  `yuanxi` varbinary(20) DEFAULT NULL,
  `finals` double DEFAULT NULL,
  `refinals` double DEFAULT NULL,
  `ispass` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('zuidaima', '111111', '1', 'zuidaima', '', '', '0', '0', '0');
INSERT INTO `user` VALUES ('1', '111111', '0', '测试人员', 0x31, 0x31, null, null, null);
