CREATE TABLE MenuItem(
	mid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	menuName	VARCHAR(50)		NOT NULL,
	menuSize	VARCHAR(50)		NOT NULL,
	menuPrice	DOUBLE			NOT NULL,
	imgUrl		VARCHAR(100)	NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
)AUTO_INCREMENT = 201;

CREATE TABLE Category(
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	cateName	VARCHAR(20)		NOT NULL,
	cateType	VARCHAR(20)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT	CURRENT_TIMESTAMP

	CONSTRAINT Categort_menuList_FK
		FOREIGN KEY(menuList) REFERENCES MenuItem(mid) //잘 못 생각함 다시 해...
)AUTO_INCREMENT = 101;

CREATE TABLE cart(

)

SELECT * FROM MenuItem;
SELECT * FROM Category;
