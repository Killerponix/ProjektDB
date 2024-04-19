DROP DATABASE IF EXISTS belegschaft;
CREATE DATABASE IF NOT EXISTS belegschaft; 
USE belegschaft;

#DROP TABLE IF EXISTS titel,
 #                    gehälter, 
  #                   angestellte;


CREATE TABLE angestellte (
    ang_nr INT NOT NULL auto_increment,
    vorname VARCHAR(16) NOT NULL,
    nachname VARCHAR(16),
    birth_date DATE,
    geschlecht ENUM ('M','F'),    
    hire_date DATE,
    PRIMARY KEY (ang_nr)
);

CREATE TABLE titel (
    ang_nr INT NOT NULL,
    titel VARCHAR(50) NOT NULL,
    from_date DATE NOT NULL,
    to_date DATE NOT NULL,
    FOREIGN KEY (ang_nr) REFERENCES angestellte (ang_nr) ,
    PRIMARY KEY (ang_nr, from_date, titel)
); 

CREATE TABLE gehälter (
    ang_nr INT NOT NULL,
    gehalt INT NOT NULL,
    from_date DATE NOT NULL,
    to_date DATE NOT NULL,
    FOREIGN KEY (ang_nr) REFERENCES angestellte (ang_nr) ,
    PRIMARY KEY (ang_nr, from_date)
); 
insert into angestellte (vorname, nachname,birth_date, geschlecht, hire_date)
value 
('John', 'Smith', '1990-03-15', 'M', '2021-01-05'),
('Jane', 'Smith', '1990-03-15', 'F', '2021-01-05'),
('Robert', 'Johnson', '1992-11-08', 'M', '2019-05-20'),
('Emily', 'Williams', '1988-04-30', 'F', '2022-03-12'),
('Michael', 'Brown', '1995-09-17', 'M', '2021-07-08'),
('Amanda', 'Jones', '1993-01-25', 'F', '2020-09-03'),
('Daniel', 'Miller', '1987-06-12', 'M', '2018-11-15'),
('Sophia', 'Anderson', '1991-12-04', 'F', '2019-08-28'),
('William', 'Taylor', '1986-08-19', 'M', '2022-02-18'),
('Olivia', 'Wilson', '1994-02-28', 'F', '2020-04-25'),
('Gustav', 'Müller', '2004-08-11', 'M', '2023-11-24'),
('Freelancer', null, null, null, null);


SELECT * FROM angestellte;

INSERT INTO titel (ang_nr, titel, from_date, to_date) VALUES
    (1, 'Software Engineer', '2021-01-05', '2021-12-31'),
    (1, 'Senior Software Engineer', '2022-01-01', '9999-01-01'),
    (2, 'Marketing Specialist', '2021-01-05', '9999-01-01'),
    (3, 'Financial Analyst', '2019-09-20', '2020-12-31'),
    (3, 'Senior Financial Analyst', '2021-01-01', '2021-12-31'),
    (3, 'Chief Operating Officer', '2022-01-01', '9999-01-01'),
    (4, 'Human Resources Assistant', '2022-03-12', '9999-01-01'),
    (5, 'Data Scientist', '2021-07-08', '2021-09-30'),
    (5, 'Lead Data Scientist', '2021-10-01', '9999-01-01'),
    (6, 'Graphic Designer', '2020-09-03', '2021-10-31'),
    (6, 'Senior Graphic Designer', '2021-11-01', '9999-01-01'), 
    (7, 'Sales Representative', '2018-11-15', '2020-12-31'),
    (7, 'Senior Sales Representative', '2021-01-01', '9999-01-01'),
    (8, 'Customer Support Specialist', '2019-08-28', '2021-11-30'),
    (8, 'Customer Support Team Lead', '2022-01-01', '9999-01-01'),
    (9, 'Quality Assurance Analyst', '2022-02-18', '2022-08-31'),
    (9, 'Senior QA Analyst', '2022-09-01', '9999-01-01'),
    (10, 'IT Administrator', '2020-04-25', '2023-06-30'),
    (10, 'System Administrator', '2024-01-01', '9999-01-01'),
    (11, 'Praktikant', '2023-11-24', '2024-02-24');
    
    SELECT * FROM titel;
    
    insert into gehälter (ang_nr, gehalt, from_date, to_date) values
	(1, 60000, '2021-01-05', '2021-12-31'),
    (1, 65000, '2022-01-05', '9999-01-01'),
    (2, 55000, '2021-01-05', '9999-01-01'),
    (3, 90000, '2019-05-20', '2020-12-31'),
    (3, 96000, '2021-01-01', '9999-01-01'),
    (4, 50000, '2022-03-12', '2022-12-31'),
    (4, 60000, '2023-01-01', '9999-01-01'),
    (5, 80000, '2021-07-08', '2021-09-30'),
    (5, 85000, '2022-01-01', '9999-01-01'),
    (6, 48000, '2020-09-03', '2020-10-31'),
    (6, 52000, '2020-11-15', '9999-01-01'),
    (7, 60000, '2018-08-28', '2020-12-31'),
    (7, 65000, '2021-01-01', '9999-01-01'),
    (8, 55000, '2019-08-28', '2021-11-30'),
    (8, 58000, '2022-01-01', '9999-01-01'),
    (9, 70000, '2020-02-18', '2022-08-31'),
    (9, 75000, '2023-01-01', '9999-01-01'),
    (10, 52000, '2020-04-25', '2023-06-30'),
    (10, 55000, '2024-01-01', '9999-01-01'),
    (12, 40000, '2023-01-01', '2023-01-30');
  
  SELECT * FROM gehälter;
  
CREATE OR REPLACE VIEW titel_gehaelter AS
  SELECT
	t.ang_nr AS 'Angestellter ID',
    titel AS 'Titel',
    t.from_date AS 'Titel_Von',
    t.to_date AS 'Titel_Bis',
    gehalt AS 'Gehalt',
    g.from_date AS 'Gehalt_Von',
    g.to_date AS 'Gehalt_Bis'
FROM titel t
LEFT JOIN gehälter g ON g.ang_nr = t.ang_nr
UNION 
  SELECT
	t.ang_nr AS 'Angestellter ID',
    titel AS 'Titel',
    t.from_date AS 'Titel_Von',
    t.to_date AS 'Titel_Bis',
    gehalt AS 'Gehalt',
    g.from_date AS 'Gehalt_Von',
    g.to_date AS 'Gehalt_Bis'
FROM titel t
RIGHT JOIN gehälter g ON g.ang_nr = t.ang_nr;

SELECT * FROM titel_gehaelter;

CREATE OR REPLACE VIEW angestellter_gehaelter_no_titel AS
  SELECT
	a.ang_nr AS 'Angestellten ID',
    vorname AS 'Vorname',
    nachname AS 'Nachname',
    birth_date AS 'Geburtsdatum',
    geschlecht AS 'Gesclächt',
    hire_date AS 'Einstellungsdatum',
    gehalt AS 'Gehalt',
    from_date AS 'Von',
    to_date AS 'Bis'
    FROM angestellte a
 LEFT JOIN gehälter g ON g.ang_nr = a.ang_nr;

SELECT * FROM angestellter_gehaelter_no_titel;

CREATE OR REPLACE VIEW gesamt_information_view AS
  SELECT
    a.ang_nr AS 'Angestellten ID',
    a.vorname AS 'Vorname',
    a.nachname AS 'Nachname',
    a.birth_date AS 'Geburtsdatum',
    a.geschlecht AS 'Geschlecht',
    a.hire_date AS 'Einstellungsdatum',
    t.titel AS 'Titel',
    t.from_date AS 'Titel_Von',
    t.to_date AS 'Titel_Bis',
    g.gehalt AS 'Gehalt',
    g.from_date AS 'Gehalt_Von',
    g.to_date AS 'Gehalt_Bis'
FROM angestellte a
LEFT JOIN titel t ON t.ang_nr = a.ang_nr
LEFT JOIN gehälter g ON g.ang_nr = a.ang_nr;

SELECT * FROM gesamt_information_view;
