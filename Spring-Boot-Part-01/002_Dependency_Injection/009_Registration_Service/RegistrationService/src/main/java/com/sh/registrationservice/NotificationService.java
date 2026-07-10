package com.sh.registrationservice;

public interface NotificationService {
    void send(String message, String recipientEmail);
}
