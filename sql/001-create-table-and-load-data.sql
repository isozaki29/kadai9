DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  published_year int(4) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (name, published_year) VALUES ("ショーシャンクの空に", 1994);
INSERT INTO movies (name, published_year) VALUES ("この世界の片隅に", 2016);
