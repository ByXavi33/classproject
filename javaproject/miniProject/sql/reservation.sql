DROP INDEX SCOTT.PK_reservation;

/* reservation */
DROP TABLE SCOTT.reservation 
	CASCADE CONSTRAINTS;

/* reservation */
CREATE TABLE SCOTT.reservation (
	reservNo INTEGER NOT NULL, /* reservNo */
	memberNo INTEGER, /* memberNo */
	hallNo INTEGER, /* hallNo */
	reservDate DATE, /* reservDate */
	reservTime DATE /* reservTime */
);

COMMENT ON TABLE SCOTT.reservation IS 'reservation';

COMMENT ON COLUMN SCOTT.reservation.reservNo IS 'reservNo';

COMMENT ON COLUMN SCOTT.reservation.memberNo IS 'memberNo';

COMMENT ON COLUMN SCOTT.reservation.hallNo IS 'hallNo';

COMMENT ON COLUMN SCOTT.reservation.reservDate IS 'reservDate';

COMMENT ON COLUMN SCOTT.reservation.reservTime IS 'reservTime';

CREATE UNIQUE INDEX SCOTT.PK_reservation
	ON SCOTT.reservation (
		reservNo ASC
	);

ALTER TABLE SCOTT.reservation
	ADD
		CONSTRAINT PK_reservation
		PRIMARY KEY (
			reservNo
		);

ALTER TABLE SCOTT.reservation
	ADD
		CONSTRAINT FK_member_TO_reservation
		FOREIGN KEY (
			memberNo
		)
		REFERENCES SCOTT.member (
			memberNo
		);

ALTER TABLE SCOTT.reservation
	ADD
		CONSTRAINT FK_hall_TO_reservation
		FOREIGN KEY (
			hallNo
		)
		REFERENCES SCOTT.hall (
			hallNo
		);