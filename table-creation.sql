USE sisgan_server;

CREATE TABLE USERS (
id INTEGER,
id_card VARCHAR(20),
id_driving_livense INTEGER,
id_ica_official INTEGER,
first_name VARCHAR(100),
last_name VARCHAR(100),
password VARCHAR(200),
birth_date DATE,
mark VARCHAR(100),
farm_name VARCHAR(100),
email VARCHAR(100),
PRIMARY KEY(id)
);

CREATE TABLE ROLES (
id INTEGER,
id_user INTEGER,
rol_name VARCHAR(10),
PRIMARY KEY(id),
FOREIGN KEY(id_user) REFERENCES USERS(id)
);

CREATE TABLE CATTLES (
id INTEGER,
id_lot INTEGER,
birth_date DATE,
weigth INTEGER,
heigth INTEGER,
sex VARCHAR(1),
breed VARCHAR(15),
PRIMARY KEY(id),
FOREIGN KEY(id_lot) REFERENCES LOTS(id)
);

CREATE TABLE LOTS (
id INTEGER,
id_user INTEGER,
lot_name VARCHAR(80) NOT NULL UNIQUE,
PRIMARY KEY(id),
FOREIGN KEY(id_user) REFERENCES USERS(id)
);

CREATE TABLE INTERNAL_MOVEMENT_GUIDES (
id INTEGER,
id_lot INTEGER,
vehicle_plate VARCHAR(10),
origin VARCHAR(100),
destination VARCHAR(100),
signature_petitioner VARCHAR(100),
id_user_transporter INTEGER,
application_date DATE,
mobilization_date DATE,
signature_ica_official VARCHAR(100),
PRIMARY KEY(id),
FOREIGN KEY(id_lot) REFERENCES LOTS(id),
FOREIGN KEY(id_user_transporter) REFERENCES USERS(id)
);
