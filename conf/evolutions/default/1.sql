# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment (
  comment_id                    bigint not null,
  content                       varchar(255),
  pc_post_id                    bigint,
  uc_email                      varchar(255),
  constraint pk_comment primary key (comment_id)
);
create sequence comment_seq;

create table food (
  main                          varchar(31) not null,
  food_id                       bigint not null,
  food_name                     varchar(255),
  suitable                      varchar(255),
  kcal                          double,
  protein                       double,
  carbs                         double,
  fat                           double,
  main_macro                    varchar(255),
  constraint pk_food primary key (food_id)
);
create sequence food_seq;

create table food_meal (
  food_food_id                  bigint not null,
  meal_meal_id                  bigint not null,
  constraint pk_food_meal primary key (food_food_id,meal_meal_id)
);

create table meal (
  meal_id                       bigint not null,
  profile_profile_id            bigint,
  total_kcal                    double,
  total_carbs                   double,
  total_protein                 double,
  total_fat                     double,
  meal_no                       integer,
  constraint pk_meal primary key (meal_id)
);
create sequence meal_seq;

create table plike (
  like_id                       bigint not null,
  like_count                    integer,
  pl_post_id                    bigint,
  constraint uq_plike_pl_post_id unique (pl_post_id),
  constraint pk_plike primary key (like_id)
);
create sequence plike_seq;

create table post (
  post_id                       bigint not null,
  content                       varchar(255),
  date                          timestamp,
  up_email                      varchar(255),
  constraint pk_post primary key (post_id)
);
create sequence post_seq;

create table profile (
  profile_id                    bigint not null,
  u_email                       varchar(255),
  dob                           timestamp,
  gender                        varchar(255),
  height                        double,
  weight                        double,
  activity_level                double,
  primary_goal                  varchar(255),
  no_of_meal                    integer,
  daily_kcal                    double,
  constraint uq_profile_u_email unique (u_email),
  constraint pk_profile primary key (profile_id)
);
create sequence profile_seq;

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  surname                       varchar(255),
  password                      varchar(255),
  p_profile_id                  bigint,
  constraint uq_user_p_profile_id unique (p_profile_id),
  constraint pk_user primary key (email)
);

create table plike_user (
  user_email                    varchar(255) not null,
  plike_like_id                 bigint not null,
  constraint pk_plike_user primary key (user_email,plike_like_id)
);

alter table comment add constraint fk_comment_pc_post_id foreign key (pc_post_id) references post (post_id) on delete restrict on update restrict;
create index ix_comment_pc_post_id on comment (pc_post_id);

alter table comment add constraint fk_comment_uc_email foreign key (uc_email) references user (email) on delete restrict on update restrict;
create index ix_comment_uc_email on comment (uc_email);

alter table food_meal add constraint fk_food_meal_food foreign key (food_food_id) references food (food_id) on delete restrict on update restrict;
create index ix_food_meal_food on food_meal (food_food_id);

alter table food_meal add constraint fk_food_meal_meal foreign key (meal_meal_id) references meal (meal_id) on delete restrict on update restrict;
create index ix_food_meal_meal on food_meal (meal_meal_id);

alter table meal add constraint fk_meal_profile_profile_id foreign key (profile_profile_id) references profile (profile_id) on delete restrict on update restrict;
create index ix_meal_profile_profile_id on meal (profile_profile_id);

alter table plike add constraint fk_plike_pl_post_id foreign key (pl_post_id) references post (post_id) on delete restrict on update restrict;

alter table post add constraint fk_post_up_email foreign key (up_email) references user (email) on delete restrict on update restrict;
create index ix_post_up_email on post (up_email);

alter table profile add constraint fk_profile_u_email foreign key (u_email) references user (email) on delete restrict on update restrict;

alter table user add constraint fk_user_p_profile_id foreign key (p_profile_id) references profile (profile_id) on delete restrict on update restrict;

alter table plike_user add constraint fk_plike_user_user foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_plike_user_user on plike_user (user_email);

alter table plike_user add constraint fk_plike_user_plike foreign key (plike_like_id) references plike (like_id) on delete restrict on update restrict;
create index ix_plike_user_plike on plike_user (plike_like_id);


# --- !Downs

alter table comment drop constraint if exists fk_comment_pc_post_id;
drop index if exists ix_comment_pc_post_id;

alter table comment drop constraint if exists fk_comment_uc_email;
drop index if exists ix_comment_uc_email;

alter table food_meal drop constraint if exists fk_food_meal_food;
drop index if exists ix_food_meal_food;

alter table food_meal drop constraint if exists fk_food_meal_meal;
drop index if exists ix_food_meal_meal;

alter table meal drop constraint if exists fk_meal_profile_profile_id;
drop index if exists ix_meal_profile_profile_id;

alter table plike drop constraint if exists fk_plike_pl_post_id;

alter table post drop constraint if exists fk_post_up_email;
drop index if exists ix_post_up_email;

alter table profile drop constraint if exists fk_profile_u_email;

alter table user drop constraint if exists fk_user_p_profile_id;

alter table plike_user drop constraint if exists fk_plike_user_user;
drop index if exists ix_plike_user_user;

alter table plike_user drop constraint if exists fk_plike_user_plike;
drop index if exists ix_plike_user_plike;

drop table if exists comment;
drop sequence if exists comment_seq;

drop table if exists food;
drop sequence if exists food_seq;

drop table if exists food_meal;

drop table if exists meal;
drop sequence if exists meal_seq;

drop table if exists plike;
drop sequence if exists plike_seq;

drop table if exists post;
drop sequence if exists post_seq;

drop table if exists profile;
drop sequence if exists profile_seq;

drop table if exists user;

drop table if exists plike_user;

