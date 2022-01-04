insert into public.category (id, breaking, category_name, id_top_category) values (1,1,'Moda',	null	);
insert into public.category (id, breaking, category_name, id_top_category) values (2,1,'Elektronik',	null	);
insert into public.category (id, breaking, category_name, id_top_category) values (3,1,'Ev & Yaşam',	null	);
insert into public.category (id, breaking, category_name, id_top_category) values (4,2,'Elbise',	1	);
insert into public.category (id, breaking, category_name, id_top_category) values (5,2,'Gömlek',	1	);
insert into public.category (id, breaking, category_name, id_top_category) values (6,2,'Bilgisayar',	2	);
insert into public.category (id, breaking, category_name, id_top_category) values (7,3,'Dizüstü Bilgisayar',	6	);
insert into public.category (id, breaking, category_name, id_top_category) values (8,2,'Mobilya',	3	);
insert into public.category (id, breaking, category_name, id_top_category) values (9,3,'Sehpa',	8	);


insert into product (id, price, product_name, save_date, id_category) values (	1	,'Mavi Elbise',	200	, now(), 	4);
insert into product (id, price, product_name, save_date, id_category) values (	2	,'Kırmızı Elbise',	300	, now(), 	4);
insert into product (id, price, product_name, save_date, id_category) values (	3	,'Mavi Gömlek',	500	, now(), 	5);
insert into product (id, price, product_name, save_date, id_category) values (	4	,'Sarı Gömlek',	450	, now(), 	5);
insert into product (id, price, product_name, save_date, id_category) values (	6	,'MSI',	20000	, now(), 	7);
insert into product (id, price, product_name, save_date, id_category) values (	7	,'Orta Sehpa',	600	, now(), 	9);


insert into customer (id, email, first_name, last_name, phone) values (	1,'omer@omer','ÖMER', 'ÖZTÜRK','1234567891');
insert into customer (id, email, first_name, last_name, phone) values (	2,'customer1@deneme','customer1', 'customer2','1234567892');
insert into customer (id, email, first_name, last_name, phone) values (	3,'customer2@deneme','customer2', 'customer2','1234567893');


insert into product_comment (id, comment, comment_date, id_customer, id_product) values (1,'BU BİR DENEME YORUMUDUR1','2021-01-01',1,1);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (2,'BU BİR DENEME YORUMUDUR2','2021-01-01',1,2);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (3,'BU BİR DENEME YORUMUDUR3','2021-01-01',1,3);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (4,'BU BİR DENEME YORUMUDUR4','2021-01-01',2,1);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (5,'BU BİR DENEME YORUMUDUR5','2021-01-01',2,1);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (6,'BU BİR DENEME YORUMUDUR6','2021-01-01',2,2);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (7,'BU BİR DENEME YORUMUDUR7','2021-01-01',2,3);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (8,'BU BİR DENEME YORUMUDUR8','2021-01-01',2,4);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (9,'BU BİR DENEME YORUMUDUR9','2021-01-01',3,1);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (10,'BU BİR DENEME YORUMUDUR10','2021-01-01',3,2);
insert into product_comment (id, comment, comment_date, id_customer, id_product) values (11,'BU BİR DENEME YORUMUDUR11','2021-01-01',3,3);
