CREATE TABLE soda (
	id INTEGER GENERATED ALWAYS AS IDENTITY,
	name VARCHAR(20) NOT NULL,
	color VARCHAR(20),
	brand VARCHAR(20),
	PRIMARY KEY (id)
);

INSERT INTO soda(name, color, brand)
VALUES ('Coke', 'brown', 'Coca-Cola'),
	   ('Dr. Pepper', 'brown', 'Dr. Pepper'),
	   ('Mountain Dew', 'yellow', 'Pepsi');