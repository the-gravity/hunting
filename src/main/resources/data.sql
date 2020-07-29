INSERT INTO t_user (id,name,password,email) VALUES ('0','admin','adminadmin','wangshiheng@qq.com');


INSERT INTO t_menus (id,name,path,parentid) VALUES (100, '大屏展示', 'show', 0);
INSERT INTO t_menus (id,name,path,parentid) VALUES (101, '态势大屏', 'situation', 100);
INSERT INTO t_menus (id,name,path,parentid) VALUES (110, '日志检索', 'search',0);
INSERT INTO t_menus (id,name,path,parentid) VALUES (111, 'ES检索', 'es',110);
INSERT INTO t_menus (id,name,path,parentid) VALUES (112, 'ClickHouse检索', 'ch', 110);
INSERT INTO t_menus (id,name,path,parentid) VALUES (120, '插件市场', 'plugin', 0);
INSERT INTO t_menus (id,name,path,parentid) VALUES (121, '插件市场', 'plugin', 120);
INSERT INTO t_menus (id,name,path,parentid) VALUES (130, '系统设置', 'setting', 0);
INSERT INTO t_menus (id,name,path,parentid) VALUES (131, 'ElasticSearch设置', 'setting_es', 130);
INSERT INTO t_menus (id,name,path,parentid) VALUES (132, 'ClickHouse设置', 'setting_ck', 130);
