# Kanghu Backend (Spring Boot Template)

这是为《康护智训》实训项目准备的后端模板（最小可运行样例）。

## 目录结构
- src/main/java/com/example/kanghu/kanghu: 主程序与控制器
- src/main/resources/application.yml: 配置文件
- pom.xml: Maven 配置

## 快速运行
1. 修改 `src/main/resources/application.yml` 中的数据库连接配置（url/username/password）。
2. 在项目根目录执行：
   ```bash
   mvn spring-boot:run
   ```
3. 访问示例接口：
   - `GET http://localhost:8080/api/users/hello`
   - `GET http://localhost:8080/api/courses/list`


