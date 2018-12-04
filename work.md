###  配置用户名：
    git config global user.name  ""
###  配置邮箱:
    git config global user.email ""
###  配置编码：
    git config --global gui.encoding utf-8
    git config --global core,quoteopath off
    git config --global core.ignorecase.false
###  git ssh key pair配置:
    ssh-keygen -t rsa -C
    回车
    在生成的目录下找到.ssh id_rsa id_rsa.pub(公有)
    复制密钥在github中添加
### git --version  获取版本信息
### git常用命令：
    git init 初始化创建本地仓库
    git add 文件名 添加到暂存区  git add . (添加所有)
    git commit - m "描述" 添加到本地仓库
    git status 查询工作区文件状态
    git log 查看commit提交
    git reset --hard committid 版本回退
    git branch 查看分支
    git checkout -b dev 创建并切换到dev分支
    git checkou 切换分支
    git pull 从远程仓库拉取
    分支合并: git merge branchname
###  github上创建项目：    
    git remote add origin + 远程仓库地址
    git remote rm origin 解除仓库关联 
    git push -u origin master 提交到远程仓库 
    git push origin master 非第一次提交   
    
##  分支写开发项目的代码，主干执行项目代码

###  .gitignore文件配置不需要提交的文件 
       *.x  忽略x结尾的文件
       !lib.a  lib.a除外都不提交
       /TODO仅仅忽略项目根目录下的 TODO 文件
       build/ 忽略 build/ 目录下的所有文件 
       
       
       
       
# 电商项目-需求分析

### 用户：
    实体类+数据库表
    登陆
    注册
    密码操作
    获取个人信息
    退出登陆    
### 商品
#### 后台
    商品显示
    商品修改
    商品删除
    商品上下架状态
#### 前台
    搜索商品
    商品详情
### 类别
    增/删/改商品
 #### 类别显示
    查看子类以及子类的子类(多级下拉选择功能)   
###  购物车
    商品操作——添加到购物车  
    商品数量 +或-
    商品移出购物车
    对商品操作  单选/多选/全选/取消选择
    显示购物车商品数量
### 地址
    用户信息其一
    订单创建时对地址的  添加/修改/删除
### 订单
#### 前台
    创建订单
    取消订单
    显示所有订单
    订单详情    
#### 后台
    订单显示
    订单详情
    发货
### 支付
    支付
    支付回调
    查看支付状态  
    
### 部署
    阿里云部署  
    
  
    
###  项目架构
    视图层  jsp
    控制层 Controller
    业务逻辑层  service ---接口 实现类 功能扩展
    Dao 层 
 #### 笔记   
    
    decimal(20，1) 20位数，整数位19 小数位1
    较大的数值用Bigint  对应Java long 类型  
    
    配置db.properties 文件 
    导入 mysql jar包
    generatorConfig,xml 配置 加载驱动的绝对路径
    通过${} 取db文件的 username password url driver
    开启注解需要扫码neuedu包下的所有类
    c3p0带有连接池的数据源 
    开启注解扫描controller
    json.MappingJackson2HttpMessageConverter 控制json数据返回到前端页面