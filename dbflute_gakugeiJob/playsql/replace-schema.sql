SET SESSION FOREIGN_KEY_CHECKS=0;

/* Create Tables */

CREATE TABLE enterprise
(
	enterprise_id int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'enterprise_id',
	user_id varchar(12) binary NOT NULL COMMENT 'user_id',
	name varchar(50) NOT NULL COMMENT 'name',
	founding_date varchar(20) COMMENT 'founding_date',
	founder_name varchar(20) COMMENT 'founder_name',
	address varchar(100) COMMENT 'address',
	capital varchar(20) COMMENT 'capital',
	president_name varchar(20) COMMENT 'president_name',
	num_of_employees varchar(20) COMMENT'num_of_employees',
	business varchar(20) COMMENT 'business',
	phone_number varchar(12) NOT NULL COMMENT 'phone_number',
	url varchar(100) COMMENT 'url',
	one_thing varchar(100) COMMENT 'one_thing',
	mail_address varchar(100) NOT NULL COMMENT 'mail_address',
	PRIMARY KEY (enterprise_id)
) COMMENT = 'enterprise';

CREATE TABLE school
(
	school_id int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'school_id', 
	user_id varchar(12) binary NOT NULL COMMENT 'user_id',
	name varchar(50) NOT NULL COMMENT 'name',
	kinds varchar(20) COMMENT 'kinds',
	phone_number varchar(12) NOT NULL COMMENT 'phone_number',
	mail_address varchar(100) NOT NULL COMMENT 'mail_address',	
	url varchar(100) COMMENT 'url',
	one_thing varchar(100) COMMENT 'one_thing',
	PRIMARY KEY (school_id)
) COMMENT = 'school';

CREATE TABLE student
(
	student_id int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'student_id',
	user_id varchar(12) binary NOT NULL COMMENT 'user_id',
	name varchar(10) COMMENT 'name',
	birthday datetime COMMENT 'birthday',
	sex int(1) COMMENT 'sex',
	phone_number varchar(12) COMMENT 'phone_number',
	mail_address varchar(50) COMMENT 'mail_address',
	address varchar(100) COMMENT 'address',
	PRIMARY KEY (student_id)
) COMMENT = 'student';

CREATE TABLE admin
(
	user_id varchar(12) binary NOT NULL COMMENT 'user_id',
	admin_pass1 varchar(256) NOT NULL COMMENT 'admin_pass1',
	admin_pass2 varchar(256) NOT NULL COMMENT 'admin_pass2',
	PRIMARY KEY (user_id)
) COMMENT = 'admin';

CREATE TABLE login
(
	user_id varchar(12) binary NOT NULL COMMENT 'user_id',
	user_pass varchar(256) NOT NULL COMMENT 'user_pass',
	role int(1) unsigned NOT NULL COMMENT 'role',
	PRIMARY KEY (user_id)
) COMMENT = 'login';

CREATE TABLE enterprise_offer
(
	job_offer_id int(10)unsigned NOT NULL AUTO_INCREMENT COMMENT 'job_offer_id',
	enterprise_id int(10) unsigned COMMENT 'enterprise_id',
	description varchar(1000) NOT NULL COMMENT 'description',
	office_name varchar(50) NOT NULL COMMENT 'office_name',
	address varchar(100) COMMENT 'address',
	station varchar(100) COMMENT 'station',
	period varchar(100) COMMENT 'period',
	holiday varchar(100) COMMENT 'holiday',
	working_time varchar(100) COMMENT 'working_time',
	salary varchar(100) NOT NULL COMMENT 'salary',
	qualification varchar(100) COMMENT 'qualification',
	welfare varchar(100) COMMENT 'welfare',
	one_thing varchar(100) COMMENT 'one_thing',
	favo int(10) unsigned COMMENT 'favo',
	registration_date datetime COMMENT 'registration_date',
	PRIMARY KEY (job_offer_id)
) COMMENT = 'enterprise_offer';

CREATE TABLE school_offer
(
	school_offer_id int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'school_offer_id',
	school_id int(10) unsigned COMMENT 'school_id',
	description varchar(1000) NOT NULL COMMENT 'description',
	salary varchar(100) NOT NULL COMMENT 'salary',
	work_schedule varchar(100) COMMENT 'work_schedule',
	period varchar(100) COMMENT 'period',
	address varchar(100) COMMENT 'address',
	station varchar(100) COMMENT 'station',
	qualification varchar(100) COMMENT 'qualification',
	welfare varchar(100) COMMENT 'welfare',
	one_thing varchar(100) COMMENT 'one_thing',
	favo int(10) unsigned COMMENT 'favo',
	registration_date datetime COMMENT 'registration_date',
	PRIMARY KEY (school_offer_id)
) COMMENT = 'school_offer';

CREATE TABLE enterprise_favo
(
	job_offer_id int(10) unsigned COMMENT 'job_offer_id',
	student_id int(10) unsigned COMMENT 'student_id',
	PRIMARY KEY (job_offer_id, student_id)
) COMMENT = 'enterprise_favo';

CREATE TABLE school_favo
(
	school_offer_id int(10) unsigned COMMENT 'school_offer_id',
	student_id int(10) unsigned COMMENT 'student_id',
	PRIMARY KEY (school_offer_id, student_id)
) COMMENT = 'school_favo';

CREATE TABLE enterprise_aplicant
(
	job_offer_id int(10) unsigned COMMENT 'job_offer_id',
	student_id int(10) unsigned COMMENT 'student_id',
	title varchar(100) COMMENT 'title',
	content varchar(400) COMMENT 'content',
	PRIMARY KEY (job_offer_id, student_id)
) COMMENT = 'enterprise_aplicant';

CREATE TABLE school_aplicant
(
	school_offer_id int(10) unsigned COMMENT 'school_offer_id',
	student_id int(10) unsigned COMMENT 'student_id',
	title varchar(100) COMMENT 'title',
	content varchar(400) COMMENT 'content',
	PRIMARY KEY (school_offer_id, student_id)
) COMMENT = 'school_aplicant';

/* Create Foreign Keys */

ALTER TABLE enterprise
	ADD FOREIGN KEY (user_id)
	REFERENCES login (user_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
;

ALTER TABLE school
	ADD FOREIGN KEY (user_id)
	REFERENCES login (user_id)
	ON UPDATE CASCADE
	ON DELETE CASCADE
;

ALTER TABLE student
	ADD FOREIGN KEY (user_id)
	REFERENCES login (user_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE admin
	ADD FOREIGN KEY (user_id)
	REFERENCES login (user_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE enterprise_offer
	ADD FOREIGN KEY (enterprise_id)
	REFERENCES enterprise (enterprise_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE school_offer
	ADD FOREIGN KEY (school_id)
	REFERENCES school (school_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE enterprise_favo
	ADD FOREIGN KEY (job_offer_id)
	REFERENCES enterprise_offer (job_offer_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE enterprise_favo
	ADD FOREIGN KEY (student_id)
	REFERENCES student (student_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE school_favo
	ADD FOREIGN KEY (school_offer_id)
	REFERENCES school_offer (school_offer_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE school_favo
	ADD FOREIGN KEY (student_id)
	REFERENCES student (student_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE enterprise_aplicant
	ADD FOREIGN KEY (job_offer_id)
	REFERENCES enterprise_offer (job_offer_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE enterprise_aplicant
	ADD FOREIGN KEY (student_id)
	REFERENCES student (student_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE school_aplicant
	ADD FOREIGN KEY (school_offer_id)
	REFERENCES school_offer (school_offer_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;

ALTER TABLE school_aplicant
	ADD FOREIGN KEY (student_id)
	REFERENCES student (student_id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;