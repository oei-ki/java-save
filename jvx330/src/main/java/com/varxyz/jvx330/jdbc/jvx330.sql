CREATE TABLE Customer(
	cid			BIGINT			PRIMARY KEY	AUTO_INCREMENT,
	email		VARCHAR(20)		NOT NULL,
	passwd		VARCHAR(20)		NOT NULL,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,	-- 123456-7890123
	phone		VARCHAR(13)		NOT NULL,	-- 010-1234-1234
	regDate		TIMESTAMP		NOT NULL	DEFAULT	CURRENT_TIMESTAMP	
)AUTO_INCREMENT = 1001;

SELECT * FROM Customer;

CREATE TABLE Account(
	aid				BIGINT		PRIMARY KEY	AUTO_INCREMENT,
	customerId		BIGINT		NOT NULL,
	accountNum		CHAR(11)	NOT NULL,	-- 000-00-0000
	accType			CHAR(1)		NOT NULL DEFAULT 'S',
	balance			DOUBLE		NOT NULL DEFAULT 0,
	interestRate	DOUBLE		NOT NULL DEFAULT 0.0,
	overAmount		DOUBLE		NOT NULL DEFAULT 0.0,
	regDate			TIMESTAMP	NOT NULL	DEFAULT	CURRENT_TIMESTAMP,	
	
	CONSTRAINT Account_customerId_FK
		FOREIGN KEY(customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;


CREATE TABLE Customer1(
	cid			BIGINT			PRIMARY KEY	AUTO_INCREMENT,
	userId		VARCHAR(20)		NOT NULL,
	passwd		V
	ARCHAR(20)		NOT NULL,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,	-- 123456-7890123
	phone		VARCHAR(13)		NOT NULL,	-- 010-1234-1234
	regDate		TIMESTAMP		NOT NULL	DEFAULT	CURRENT_TIMESTAMP	
)AUTO_INCREMENT = 1001;

SELECT * FROM Customer1;

DELETE FROM Customer1 WHERE cid=1004;

CREATE TABLE Account1( 
	aid				BIGINT		PRIMARY KEY	AUTO_INCREMENT,
	customerId		BIGINT		NOT NULL,
	accountNum		CHAR(11)	NOT NULL,	-- 000-00-0000
	accType			CHAR(1)		NOT NULL DEFAULT 'S',
	balance			DOUBLE		NOT NULL DEFAULT 0,
	interestRate	DOUBLE		NOT NULL DEFAULT 0.0,
	overAmount		DOUBLE		NOT NULL DEFAULT 0.0,
	regDate			TIMESTAMP	NOT NULL	DEFAULT	CURRENT_TIMESTAMP,	
	
	CONSTRAINT Account1_customerId_FK
		FOREIGN KEY(customerId) REFERENCES Customer1(cid)
)AUTO_INCREMENT = 3001;

DROP TABLE Account1;

DELETE FROM Account1 WHERE accType='C';

SELECT * FROM Account1;

UPDATE Account1 SET balance = balance + 10000 WHERE accountNum='304-06-307';