BEGIN TRANSACTION;



CREATE TABLE employee
(
        id serial,
        last_name varchar(45) NOT NULL,
        first_name varchar(45) NOT NULL,
        gender varchar(6),
        date_of_birth date,
        date_of_hire date NOT NULL,
        department_id int NOT NULL,
        job_id int NOT NULL,
        
        CONSTRAINT pk_employee PRIMARY KEY (id)
);

CREATE TABLE department
(
        id serial,
        name varchar(40) NOT NULL,
        
        CONSTRAINT pk_department PRIMARY KEY (id)
                
);

CREATE TABLE project
(
        id serial,
        name varchar(40) NOT NULL,
        start_date date NOT NULL,
        
        CONSTRAINT pk_project PRIMARY KEY (id)
);

CREATE TABLE job_title
(
        id serial,
        title varchar(30) NOT NULL,
        
        CONSTRAINT pk_job_title PRIMARY KEY (id)
);

CREATE TABLE employee_project
(
        employee_id int NOT NULL,
        project_id int NOT NULL,
        
        CONSTRAINT pk_employee_project_employee_id_project_id PRIMARY KEY (employee_id, project_id)
);   

BEGIN TRANSACTION;
ALTER TABLE employee
ADD FOREIGN KEY (department_id)
REFERENCES department(id);    

ALTER TABLE employee
ADD FOREIGN KEY (job_id)
REFERENCES job_title(id); 

ALTER TABLE employee_project  
ADD FOREIGN KEY (employee_id)
REFERENCES employee(id);

ALTER TABLE employee_project
ADD FOREIGN KEY (project_id)
REFERENCES project(id);
       
COMMIT;


BEGIN TRANSACTION;

INSERT INTO department (name) VALUES ('Legion Of Boom');
INSERT INTO department (name) VALUES ('Department of Stuff');
INSERT INTO department (name) VALUES ('Department of Important People');
        

INSERT INTO job_title (title) VALUES ('Boom Layer');
INSERT INTO job_title (title) VALUES ('Job That Does Stuff');
INSERT INTO job_title (title) VALUES ('Junior Boom Guy');
INSERT INTO job_title (title) VALUES ('Junior Job That Does Stuff');
INSERT INTO job_title (title) VALUES ('Slightly Important Person');
INSERT INTO job_title (title) VALUES ('Important Person');
INSERT INTO job_title (title) VALUES ('Very Important Person');
INSERT INTO job_title (title) VALUES ('Extremely Important Person');


INSERT INTO project (name, start_date) VALUES ('Project Uno', '01-01-2020');
INSERT INTO project (name, start_date) VALUES ('Project Dos', '01-01-2020');
INSERT INTO project (name, start_date) VALUES ('Project Tres', '01-01-2020');
INSERT INTO project (name, start_date) VALUES ('Project Cuatro', '01-01-2020'); 

COMMIT;
ROLLBACK;

BEGIN TRANSACTION;

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Boom',
        'Boom',
        'Male',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Legion Of Boom'),
        (SELECT id FROM job_title WHERE title = 'Boom Layer')
);  

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Bam',
        'Bam',
        'Male',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Legion Of Boom'),
        (SELECT id FROM job_title WHERE title = 'Boom Layer')
);  

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Junior',
        'Boom',
        'Male',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Legion Of Boom'),
        (SELECT id FROM job_title WHERE title = 'Boom Layer')
);   

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Mister',
        'Stuff',
        'Male',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Department of Stuff'),
        (SELECT id FROM job_title WHERE title = 'Junior Job That Does Stuff')
);   

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Miss',
        'Stuff',
        'Female',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Department of Stuff'),
        (SELECT id FROM job_title WHERE title = 'Job That Does Stuff')
);    

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Super',
        'Bigdeal',
        'Female',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Department of Important People'),
        (SELECT id FROM job_title WHERE title = 'Extremely Important Person')
);  

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Really',
        'Bigdeal',
        'Male',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Department of Important People'),
        (SELECT id FROM job_title WHERE title = 'Very Important Person')
);  

INSERT INTO employee 
(
        last_name,
        first_name,
        gender,
        date_of_birth,
        date_of_hire,
        department_id,
        job_id
)
VALUES   
(
        'Big',
        'Deal',
        'Female',
        '01-01-2000',
        '01-01-2018',
        (SELECT id FROM department WHERE name = 'Department of Important People'),
        (SELECT id FROM job_title WHERE title = 'Important Person')
);   

COMMIT;  

BEGIN TRANSACTION;

INSERT INTO employee_project (employee_id, project_id)
VALUES
(
        (SELECT id FROM employee WHERE first_name = 'Boom' AND last_name = 'Boom'),
        (SELECT id FROM project WHERE name = 'Project Uno')     
);

INSERT INTO employee_project (employee_id, project_id)
VALUES
(
        (SELECT id FROM employee WHERE first_name = 'Bam' AND last_name = 'Bam'),
        (SELECT id FROM project WHERE name = 'Project Dos')     
);

INSERT INTO employee_project (employee_id, project_id)
VALUES
(
        (SELECT id FROM employee WHERE first_name = 'Stuff' AND last_name = 'Miss'),
        (SELECT id FROM project WHERE name = 'Project Tres')     
);

INSERT INTO employee_project (employee_id, project_id)
VALUES
(
        (SELECT id FROM employee WHERE first_name = 'Deal' AND last_name = 'Big'),
        (SELECT id FROM project WHERE name = 'Project Cuatro')     
);

COMMIT;









