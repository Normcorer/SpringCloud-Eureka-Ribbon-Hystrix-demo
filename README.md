# SpringCloud-Eureka-Ribbon-Hystrix-demo

#服务模块介绍
Eurekademo：服务注册中心，微服务的核心和基础模块，实现各服务的自动化注册与发现。
ServiceA、ServiceB：具体的微服务，提供特定的服务，为了实现负载均衡，a、b两个服务具有相同的实例名SERVICE-AB（也可以只创建一个服务SERVICE-AB，同时启动不同的实例）。
sc-customer：微服务消费服务，调用负载均衡客户端调用SERVICE-AB服务。

#运行过程
服务启动并注册成功后，调用Customer的‘consumer’会交替调用ServiceA和ServiceB，返回
hello SerivceB 和  hello SerivceA，如果调用出错的话会由容错机制返回Error!!!
