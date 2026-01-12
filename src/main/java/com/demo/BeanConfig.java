package com.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("com.demo")
public class BeanConfig {

    @Bean("email")
    public NotificationService email() {
        return new EmailNotificationService();
    }

    @Bean("sms")
    public NotificationService sms() {
        return new SmsNotificationService();
    }

    @Bean
    public NotificationManager notificationManager(@Qualifier("sms") NotificationService notificationService) {
        return new NotificationManager(notificationService);
    }

}