create database MarsLearning;

use MarsLearning;

create table Admin (admin_id varchar(12) PRIMARY key,
                    password varchar(8) not null,
                    name varchar(max) not null,
                    email varchar(25) not null);

insert into admin values ('ML101','admin1@mL','Naga Priya','admin1@mlearn.com');

alter table admin
alter column password varchar(12) not null;

create table course (course_id varchar(12) PRIMARY key,
                    course_name varchar(120) not null unique,
                    course_desc varchar(500) not null,
                    course_resource varchar(500) not null,
                    fee decimal(8,2) not null);

insert into course values ('MLC1001','Machine Learning',
    'Basics of ML','https://en.wikipedia.org/wiki/Machine_learning',
    94.99);

create table mluser (userid varchar(12) primary key,
                    name varchar(max) not null,
                    email varchar(25) not null unique,
                    reg_date date not null, 
                    password varchar(12) not null,
                    address varchar(250) not null,
                    phone varchar(30) not null unique,
                    upload_photo varchar(2048) not null unique); 

insert into mluser values ('MLU1001','Anandi Tarun',
    'anandi@ml.com','2021-12-01','anandi@Tarun',
    '123 frmont,ca 94566','+1(234)123-1234','https://photos/anandi');

create table contact (userid varchar(12) references mluser(userid),
                    contact_id varchar(12) primary key,
                    name varchar(max) not null,
                    email varchar(25) not null unique,
                    message varchar(250) not null,
                    phone varchar(30) not null unique);

insert into contact values ('MLU1001', 'NU101','Vidya Prakash','vidya@gmail.com',
                    'Pursuing Data Analytics course in Udemy','+1(235)236-1234');

create table feedback (feedback_id varchar(12) primary key,
                    name varchar(max) not null,
                    email varchar(25) not null unique,
                    userid varchar(12) references mluser(userid),
                    message varchar(250) not null);

insert into feedback values ('FBK1001', 'Anandi','anandi@ml.com','MLU1001',
                    'Quality of handouts needs improvement');


select * from admin;
select * from course;
select * from mluser;
select * from contact;
select * from feedback;



