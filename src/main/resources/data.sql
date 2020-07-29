INSERT INTO t_user (id,name,password,email) VALUES ('0','admin','adminadmin','wangshiheng@qq.com');


INSERT INTO t_menus (id,name,path,parentid) VALUES (100, '大屏展示', '/show', null);
INSERT INTO t_menus (id,name,path,parentid) VALUES (101, '态势大屏', '/show/situation', 100);
INSERT INTO t_menus (id,name,path,parentid) VALUES (110, '日志检索', '/search',null);
INSERT INTO t_menus (id,name,path,parentid) VALUES (111, 'ES检索', '/search/es',110);
INSERT INTO t_menus (id,name,path,parentid) VALUES (112, 'ClickHouse检索', '/setting/ch', 110);
INSERT INTO t_menus (id,name,path,parentid) VALUES (120, '系统设置', '/setting', null);
INSERT INTO t_menus (id,name,path,parentid) VALUES (121, 'ElictSearch设置', '/setting/es', 120);
INSERT INTO t_menus (id,name,path,parentid) VALUES (122, 'ClickHouse设置', '/setting/ck', 120);