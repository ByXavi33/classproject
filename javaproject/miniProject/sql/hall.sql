DROP INDEX SCOTT.PK_hall;

/* hall */
DROP TABLE SCOTT.hall 
	CASCADE CONSTRAINTS;

/* hall */
CREATE TABLE SCOTT.hall (
	hallNo INTEGER NOT NULL, /* hallNo */
	hallResvYN VARCHAR2(50), /* hallResvYN */
	hallTime INTEGER /* hallTime */
);

COMMENT ON TABLE SCOTT.hall IS 'hall';

COMMENT ON COLUMN SCOTT.hall.hallNo IS 'hallNo';

COMMENT ON COLUMN SCOTT.hall.hallResvYN IS 'hallResvYN';

COMMENT ON COLUMN SCOTT.hall.hallTime IS 'hallTime';

CREATE UNIQUE INDEX SCOTT.PK_hall
	ON SCOTT.hall (
		hallNo ASC
	);

ALTER TABLE SCOTT.hall
	ADD
		CONSTRAINT PK_hall
		PRIMARY KEY (
			hallNo
		);