# SpringBoot Practice

## Throw Exception & Write a ExceptionHandle class

Return error code and error msg instead of tracing log to client.    
Provide a normalized response API for other developers  


## resources

application.yml  
application-dev.yml  
application-prod.yml  

## AOP 

Extract common logic from business logic  

@Aspect  
@Component  
@Pointcut("execution(public * com.imooc.controller.GirlController.*(..))")  
@Before("")   
@After("")  
@AfterReturning(returning = "object", pointcut = "log()")  


## Enumeration

Constant Dictionary: <code, msg>  

## @RestController
@RestController = @Controller + @ResponseBody  

  
 



return code and msg to clients instead of error trace log.

