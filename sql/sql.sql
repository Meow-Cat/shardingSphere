drop table if exists sys_oper_log_get;
create table sys_oper_log_get (
                                  oper_id           bigint(20)      not null auto_increment    comment '日志主键',
                                  title             varchar(50)     default ''                 comment '模块标题',
                                  business_type     int(2)          default 0                  comment '业务类型（0其它 1新增 2修改 3删除）',
                                  method            varchar(100)    default ''                 comment '方法名称',
                                  request_method    varchar(10)     default ''                 comment '请求方式',
                                  operator_type     int(1)          default 0                  comment '操作类别（0其它 1后台用户 2手机端用户）',
                                  oper_name         varchar(50)     default ''                 comment '操作人员',
                                  dept_name         varchar(50)     default ''                 comment '部门名称',
                                  oper_url          varchar(255)    default ''                 comment '请求URL',
                                  oper_ip           varchar(128)    default ''                 comment '主机地址',
                                  oper_location     varchar(255)    default ''                 comment '操作地点',
                                  oper_param        varchar(2000)   default ''                 comment '请求参数',
                                  json_result       varchar(2000)   default ''                 comment '返回参数',
                                  status            int(1)          default 0                  comment '操作状态（0正常 1异常）',
                                  error_msg         varchar(2000)   default ''                 comment '错误消息',
                                  oper_time         datetime                                   comment '操作时间',
                                  primary key (oper_id)
) engine=innodb auto_increment=100 comment = 'get操作日志记录';

drop table if exists sys_oper_log_post;
create table sys_oper_log_post (
                                   oper_id           bigint(20)      not null auto_increment    comment '日志主键',
                                   title             varchar(50)     default ''                 comment '模块标题',
                                   business_type     int(2)          default 0                  comment '业务类型（0其它 1新增 2修改 3删除）',
                                   method            varchar(100)    default ''                 comment '方法名称',
                                   request_method    varchar(10)     default ''                 comment '请求方式',
                                   operator_type     int(1)          default 0                  comment '操作类别（0其它 1后台用户 2手机端用户）',
                                   oper_name         varchar(50)     default ''                 comment '操作人员',
                                   dept_name         varchar(50)     default ''                 comment '部门名称',
                                   oper_url          varchar(255)    default ''                 comment '请求URL',
                                   oper_ip           varchar(128)    default ''                 comment '主机地址',
                                   oper_location     varchar(255)    default ''                 comment '操作地点',
                                   oper_param        varchar(2000)   default ''                 comment '请求参数',
                                   json_result       varchar(2000)   default ''                 comment '返回参数',
                                   status            int(1)          default 0                  comment '操作状态（0正常 1异常）',
                                   error_msg         varchar(2000)   default ''                 comment '错误消息',
                                   oper_time         datetime                                   comment '操作时间',
                                   primary key (oper_id)
) engine=innodb auto_increment=100 comment = 'post操作日志记录';

drop table if exists sys_oper_log_put;
create table sys_oper_log_put (
                                  oper_id           bigint(20)      not null auto_increment    comment '日志主键',
                                  title             varchar(50)     default ''                 comment '模块标题',
                                  business_type     int(2)          default 0                  comment '业务类型（0其它 1新增 2修改 3删除）',
                                  method            varchar(100)    default ''                 comment '方法名称',
                                  request_method    varchar(10)     default ''                 comment '请求方式',
                                  operator_type     int(1)          default 0                  comment '操作类别（0其它 1后台用户 2手机端用户）',
                                  oper_name         varchar(50)     default ''                 comment '操作人员',
                                  dept_name         varchar(50)     default ''                 comment '部门名称',
                                  oper_url          varchar(255)    default ''                 comment '请求URL',
                                  oper_ip           varchar(128)    default ''                 comment '主机地址',
                                  oper_location     varchar(255)    default ''                 comment '操作地点',
                                  oper_param        varchar(2000)   default ''                 comment '请求参数',
                                  json_result       varchar(2000)   default ''                 comment '返回参数',
                                  status            int(1)          default 0                  comment '操作状态（0正常 1异常）',
                                  error_msg         varchar(2000)   default ''                 comment '错误消息',
                                  oper_time         datetime                                   comment '操作时间',
                                  primary key (oper_id)
) engine=innodb auto_increment=100 comment = 'put操作日志记录';

drop table if exists sys_oper_log_delete;
create table sys_oper_log_delete (
                                     oper_id           bigint(20)      not null auto_increment    comment '日志主键',
                                     title             varchar(50)     default ''                 comment '模块标题',
                                     business_type     int(2)          default 0                  comment '业务类型（0其它 1新增 2修改 3删除）',
                                     method            varchar(100)    default ''                 comment '方法名称',
                                     request_method    varchar(10)     default ''                 comment '请求方式',
                                     operator_type     int(1)          default 0                  comment '操作类别（0其它 1后台用户 2手机端用户）',
                                     oper_name         varchar(50)     default ''                 comment '操作人员',
                                     dept_name         varchar(50)     default ''                 comment '部门名称',
                                     oper_url          varchar(255)    default ''                 comment '请求URL',
                                     oper_ip           varchar(128)    default ''                 comment '主机地址',
                                     oper_location     varchar(255)    default ''                 comment '操作地点',
                                     oper_param        varchar(2000)   default ''                 comment '请求参数',
                                     json_result       varchar(2000)   default ''                 comment '返回参数',
                                     status            int(1)          default 0                  comment '操作状态（0正常 1异常）',
                                     error_msg         varchar(2000)   default ''                 comment '错误消息',
                                     oper_time         datetime                                   comment '操作时间',
                                     primary key (oper_id)
) engine=innodb auto_increment=100 comment = 'delete操作日志记录';