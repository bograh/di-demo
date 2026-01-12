package com.demo;

public class EmailNotificationService implements NotificationService {

    @Override
    public void send() {
        System.out.println("Sending email notification");
    }
}