alter table u_user rename column created_time to create_time;
alter table u_user rename column updated_time to update_time;
alter table u_user add column create_by varchar(20);
alter table u_user add column update_by varchar(20);