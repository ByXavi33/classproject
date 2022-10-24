DROP INDEX SCOTT.PK_member;

/* member */
DROP TABLE SCOTT.member 
	CASCADE CONSTRAINTS;

/* member */
CREATE TABLE SCOTT.member (
	memberNo INTEGER NOT NULL, /* memberNo */
	memberName VARCHAR2(50), /* memberName */
	memberAddres VARCHAR2(255), /* memberAddres */
	memberPhone VARCHAR2(30), /* memberPhone */
	memberId INTEGER, /* memberId */
	memberPwd VARCHAR2(50), /* memberPwd */
	memberGrade INTEGER /* memberGrade */
);

COMMENT ON TABLE SCOTT.member IS 'member';

COMMENT ON COLUMN SCOTT.member.memberNo IS 'memberNo';

COMMENT ON COLUMN SCOTT.member.memberName IS 'memberName';

COMMENT ON COLUMN SCOTT.member.memberAddres IS 'memberAddres';

COMMENT ON COLUMN SCOTT.member.memberPhone IS 'memberPhone';

COMMENT ON COLUMN SCOTT.member.memberId IS 'memberId';

COMMENT ON COLUMN SCOTT.member.memberPwd IS 'memberPwd';

COMMENT ON COLUMN SCOTT.member.memberGrade IS 'memberGrade';

CREATE UNIQUE INDEX SCOTT.PK_member
	ON SCOTT.member (
		memberNo ASC
	);

ALTER TABLE SCOTT.member
	ADD
		CONSTRAINT PK_member
		PRIMARY KEY (
			memberNo
		);