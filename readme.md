<h1>Part 02</h1>
<h3>one to one</h3>
<p>Hibernate: create table Author (author_id varchar(255) not null, author_name varchar(255), gmail varchar(255), primary key (author_id)) engine=InnoDB
Hibernate: create table Book (booK_id varchar(255) not null, isbm varchar(255), title varchar(255), author_author_id varchar(255), primary key (booK_id)) engine=InnoDB
Hibernate: alter table Book drop index UK_mc2m408py751ddhdtad6ytgyl
Hibernate: alter table Book add constraint UK_mc2m408py751ddhdtad6ytgyl unique (author_author_id)
Hibernate: alter table Book add constraint FKiq79tc8bl1pqa4v6knfsswe1n foreign key (author_author_id) references Author (author_id)
<h3>Aave Book And Author</h3>
Hibernate: insert into Author (author_name,gmail,author_id) values (?,?,?)
Hibernate: insert into Book (author_author_id,isbm,title,booK_id) values (?,?,?,?)
saveBookAndAuthor okay .... 😊😊 ...

Select Option : 2
Hibernate: update Author set author_name=?,gmail=? where author_id=?
Hibernate: update Book set author_author_id=?,isbm=?,title=? where booK_id=?
updateBookAndAuthor okay .... 😊😊 ...</p>