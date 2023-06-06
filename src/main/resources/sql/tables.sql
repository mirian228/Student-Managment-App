CREATE DATABASE IF NOT exists student_directory;
USE student_directory;

DROP TABLE principal;
DROP TABLE school_teacher;
DROP TABLE school;
DROP TABLE student_teacher;
DROP TABLE student;
DROP TABLE teacher;

CREATE TABLE school(
 id_school int AUTO_INCREMENT,
 school_name varchar(30) NOT NULL,
 school_address varchar(40) NOT NULL,

	PRIMARY KEY(id_school)
) Engine=InnoDB charset=utf8mb4;



CREATE TABLE student(
 id_student int AUTO_INCREMENT,
 first_name varchar(20) NOT NULL,
 last_name varchar(20) NOT NULL,
 email varchar(30) NOT NULL UNIQUE,
 id_school int,
	FOREIGN KEY(id_school) REFERENCES school(id_school),
	PRIMARY KEY(id_student)
) Engine=InnoDB charset=utf8mb4;

 

CREATE TABLE teacher(
	id_teacher int AUTO_INCREMENT,
	first_name varchar(20) NOT NULL,
    last_name varchar(20) NOT NULL,
    email varchar(30) NOT NULL UNIQUE,
	PRIMARY KEY(id_teacher)
)Engine=InnoDB charset=utf8mb4;


CREATE TABLE principal(
	id_principal int AUTO_INCREMENT,
    first_name varchar(20) NOT NULL,
    last_name varchar(20) NOT NULL,
    email varchar(30) NOT NULL UNIQUE,
    id_school int NOT NULL,
	
    FOREIGN KEY(id_school) REFERENCES school(id_school),
    
	PRIMARY KEY(id_principal)
) Engine=InnoDB charset=utf8mb4;

CREATE TABLE student_teacher(
	id_student int,
    id_teacher int,
    
    FOREIGN KEY(id_student) REFERENCES student(id_student),
    FOREIGN KEY(id_teacher) REFERENCES teacher(id_teacher),
    PRIMARY KEY(id_student, id_teacher)
);

CREATE TABLE school_teacher(
	id_school int,
    id_teacher int,
    
    FOREIGN KEY(id_school) REFERENCES school(id_school),
    FOREIGN KEY(id_teacher) REFERENCES teacher(id_teacher),
    PRIMARY KEY(id_school, id_teacher)
);

INSERT INTO school(school_name, school_address) VALUES
		('Georgian American School', 'Bagrationi Street 61'),
        ("Masterclass","Melikishvili Street 10"),
        ("UG School","Javakhishvili Street 5"),
		("EURO-2000 School","Zurab Gorgiladze Street 89");

INSERT INTO student(first_name, last_name, email, id_school)  VALUES
		("Mirian", "Surmanidze", "mirian.s@gmail.com", 1),
        ("Iunona", "Vanidze", "iunona.v@gmail.com", 1),
        ("Ana", "Beridze", "ana.b@gmail.com", 1),
        ("Elene", "Tamarishvili", "elene.t@gmail.com", 1),
        ("Giorgi", "Datuashvili", "giorgi.d@gmail.com", 1),
        ("Saba", "Barnovi", "Saba.b@gmail.com", 2),
        ("Nika", "Koshkelashvili", "Nika.k@gmail.com", 2),
        ("Demetre", "Aslamazashvili", "Demetre.d@gmail.com", 2),
        ("Sesili", "Liqokeli", "Sesili.d@gmail.com", 2),
        ("Anamaria", "Loladze", "Anamaria.d@gmail.com", 2),
        ("Sandro", "Lursmanashvili", "Sandro.d@gmail.com", 3),
        ("Andria", "Mchedlidze", "Andria.d@gmail.com", 3),
        ("Lasha", "Lekishvili", "Lasha.d@gmail.com", 3),
        ("Salome", "Maghaladze", "Salome.d@gmail.com", 3),
        ("Barbare", "Melashvili", "Barbare.d@gmail.com", 3),
        ("Zura", "Melikidze", "Zura.d@gmail.com", 4),
        ("Ilia", "Mudjiri", "Ilia.d@gmail.com", 4),
        ("Levani", "Nozadze", "Levani.d@gmail.com", 4),
        ("Tamari", "Saginashvili", "Tamari.d@gmail.com", 4),
        ("Tiko", "Mgaloblishvili", "Tiko.d@gmail.com", 4);
        

                
INSERT INTO teacher(first_name, last_name, email) VALUES
		("Nikoloz", "Sulashvili", "nikoloz.s@gmail.com"),
        ("Irakli", "Tabaghua", "irakli.t@gmail.com"),
        ("Gabriel", "Mefarishvili", "gabriel.m@gmail.com"),
        ("Anano", "Chikhradze", "Anano.c@gmail.com"),
        ("Beka", "Undiladze", "Beka.u@gmail.com"),
        ("Aleksandra", "Tkeshelashvili", "Aleksandra.t@gmail.com"),
		("Natali", "Shavlashvili", "Natali.s@gmail.com"),
		("Sani", "Chibuxashvili", "Sani.c@gmail.com");

        
INSERT INTO principal(first_name, last_name, email, id_school) VALUES
		("Tornike", "Tsitsishvili", "tornike.t@gmail.com", 1),
        ("Tatia", "Tsikhelashvili", "tatia.t@gmail.com", 2),
        ("Grizelda", "Tskhomaria", "grizelda.t@gmail.com", 3),
        ("Lazare", "Tchabukashvili", "lazare.t@gmail.com", 4);
        
INSERT INTO school_teacher VALUES 
	(1, 1),
    (1, 2),
    (2, 3),
    (2, 4),
    (3, 5),
    (3, 6),
    (4, 7),
    (4, 8);
    
    
INSERT INTO student_teacher VALUES 
	(1, 1),
    (2, 1),
    (3, 2),
    (4, 2),
    (5, 3),
    (6, 3),
    (7, 4),
    (8, 4),
    (9, 5),
    (10, 5),
    (11, 6),
    (12, 6),
    (13, 7),
    (14, 7),
    (15, 8),
    (16, 8),
    (17, 1),
    (18, 2),
    (19, 3),
    (20, 4);
    
    

