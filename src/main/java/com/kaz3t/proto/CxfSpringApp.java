package com.kaz3t.proto;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CxfSpringApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final ApplicationContext ac = new ClassPathXmlApplicationContext(
                new String[] { "ac.xml" });
        final JAXRSServerFactoryBean factory = (JAXRSServerFactoryBean)ac.getBean("jaxRsFactory");
        /*final JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        SpringBusFactory busFactory = new SpringBusFactory(ac);
        Bus bus = busFactory.createBus();
        factory.setBus(bus);
        factory.setAddress("http://localhost:7777");
        factory.setResourceClasses(HelloRestService.class);
        factory.setResourceProvider(HelloRestService.class,
                new SingletonResourceProvider(new HelloRestService()));*/
        System.out.println("Server is starting...");
        final Server server = factory.create();

        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                System.out.println("Server is stopping...");
                server.destroy();
                ((ConfigurableApplicationContext) ac).close();
            }

        });
    }

}
