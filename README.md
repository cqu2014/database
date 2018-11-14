# database
<h2>数据库相关的操作</h2>

# gradle运行mybatis-generator
1. 在gradle加一个configurations 
    <p>
       configurations{
           mybatisGenerator
       }
    </p> 
                      
2. 然后在依赖中加入mybatisGenerator的依赖：
    <p>
    mybatisGenerator 'org.mybatis.generator:mybatis-generator-core:1.3.2'  
    mybatisGenerator 'mysql:mysql-connector-java:5.1.36'                   
    mybatisGenerator 'tk.mybatis:mapper:3.3.2'                             
   </p>   
3. 在grade了加入一个task，configfile的值为mybatis-generator的配置文件路径：
    <p>
    task mybatisGenerate << {
    ant.taskdef(
            name: 'mbgenerator',
            classname: 'org.mybatis.generator.ant.GeneratorAntTask',
            classpath: configurations.mybatisGenerator.asPath
    )
    ant.mbgenerator(overwrite: true,
            configfile: 'src/main/resources/generatorConfig.xml', verbose: true)
}
</p>

4. 配置mybatis-generator的配置文件generatorConfig.xml
    
