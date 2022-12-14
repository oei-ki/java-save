CREATE TABLE MenuItem(
	mid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	cateFk		BIGINT			NOT NULL,
	menuName	VARCHAR(50)		NOT NULL,
	menuSize	VARCHAR(50)		NOT NULL,
	menuPrice	DOUBLE			NOT NULL,
	imgUrl		VARCHAR(100)	NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
		FOREIGN KEY(cateFk) REFERENCES Category(cid)
)AUTO_INCREMENT = 201;

CREATE TABLE Category(
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	cateType	VARCHAR(20)		NOT NULL,
	cateName	VARCHAR(20)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 101;

DROP TABLE MenuItem;
DROP TABLE Category;

SELECT * FROM MenuItem;
SELECT * FROM Category;

DELETE FROM Category WHERE cid = 101;
