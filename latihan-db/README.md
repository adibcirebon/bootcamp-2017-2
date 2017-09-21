# Database dengan Postgresql

* Untuk koneksi menggunakan program psql

```bash 
psql -h localhost -U postgres

# password yang isi pass install postgresql database
```

* Untuk membuat user `bootcamp_2`

```sql 
# password yang ini bikin baru
create user bootcamp_2 with login password 'bootcamp_2'
```

* Untuk membuat database `bootcamp_2`

```sql
create database bootcamp_2 with owner bootcamp_2
```

* Membuat table `s_user`

```sql


```

* Membuat table `role`


```sql

```

* Membuat table `user_roles`

```sql 

```

* Menambahkan constraint fereign key `fk_user_id` dan `fk_role_id` 

```sql 
alter table user_roles
add constraint fk_user_id foreign key (user_id) 
references s_user (id);
```

```sql 
alter table user_roles
add constraint fk_role_id foreign key (role_id)
references role(id);
```

* Input data `s_user`

```sql
insert into s_user (uname, fullname, tanggal_lahir, email) values 
('admin', 'Administrator', '1991-08-01', 'tabledata@gmail.com');
```

* Input data `role`

```sql
insert into role (name) values ('ROLE_ADMIN'), ('ROLE_OPERATOR');
```

* Input data `user_roles`

```sql
insert into user_roles (user_id, role_id) values (1, 1), (1,2);
```

* Select with join all tables `s_user`, `role` `user_rolse`

```sql
select * from s_user join user_roles roles on (s_user.id = roles.user_id) join role role on (roles.role_id = role.id);
```


Metode login normalisasi database

* Normalisasi 
* ORM


