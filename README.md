# sw
spring事务的传播性测试

事务有7种传播行为配置，下面介绍两种

1.默认，@Transactional(propagation = Propagation.REQUIRES）,外层事务调用内层事务的时候默认使用外层事务

2.@Transactional(propagation = Propagation.REQUIRES_NEW),新建事务，如果内层有事务，外层事务会先暂停，内层事务执行完之后外层事务再继续执行，但是要注意要是针对不同表进行操作
