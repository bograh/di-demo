package com.demo;

public class SmsNotificationService implements NotificationService {

    @Override
    public void send() {
        System.out.println("Sending sms notification");
    }
}