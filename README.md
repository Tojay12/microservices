微服务项目

需要使用validation-and-exception-starter项目需要在使用项目中定义Enum枚举实现BusinessExceptionAssert接口，例如：
`@Getter
 @AllArgsConstructor
 public enum ResponseEnum implements BusinessExceptionAssert {
 
     /**
      *
      */
     BAD_LICENCE_TYPE(7001, "Bad licence type."),
     /**
      *
      */
     LICENCE_NOT_FOUND(7002, "Licence not found.")
 
     ;
 
     /**
      * 返回码
      */
     private int code;
     /**
      * 返回消息
      */
     private String message;
 }
 
 `
项目结构如下：
`microsevices -- 父项目，公共依赖
 │  ├─commons -- 通用工具一级工程
 │  │  ├─log-spring-boot-starter -- 封装log日志通用操作逻辑
 │  │  ├─swagger-spring-boot-starter -- 封装Swagger通用操作逻辑 
 │  │  ├─validation-and-exception-starter -- 封装统一校验和异常通用操作逻辑 
 
 `

