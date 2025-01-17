USE edu;

CREATE OR REPLACE TABLE `member` (
	`no` 		INT(11) 	NOT NULL 	COMMENT '회원 번호' 				AUTO_INCREMENT,
	`id` 		VARCHAR(10) NOT NULL 	COMMENT '회원 아이디' 				COLLATE 'utf8mb4_uca1400_ai_ci',
	`name` 		VARCHAR(10) NOT NULL 	COMMENT '회원 이름' 				COLLATE 'utf8mb4_uca1400_ai_ci',
	`pwd` 		VARCHAR(10) NOT NULL	COMMENT '회원 비밀번호' 			COLLATE 'utf8mb4_uca1400_ai_ci',
	`email` 	VARCHAR(30) NULL 		COMMENT '회원 이메일' 				COLLATE 'utf8mb4_uca1400_ai_ci',
	`number` 	VARCHAR(20) NULL 		COMMENT '회원 전화번호' 			COLLATE 'utf8mb4_uca1400_ai_ci',
	`gender` 	VARCHAR(10) NULL 		COMMENT '회원 성별' 				COLLATE 'utf8mb4_uca1400_ai_ci',
	`delYN` 	TINYINT(4) 	NOT NULL 	COMMENT '회원 삭제 여부' 			DEFAULT '0',
	`Sdate` 	DATE 		NOT NULL 	COMMENT '회원 가입 날' 			DEFAULT '0000-00-00',
	`Ldate` 	DATETIME	NULL 		COMMENT '회원 마지막 로그인 일시'		DEFAULT '0000-00-00',
	PRIMARY KEY (`no`) USING BTREE,
	UNIQUE INDEX `id` (`id`) USING BTREE
)
ENGINE=InnoDB
;
