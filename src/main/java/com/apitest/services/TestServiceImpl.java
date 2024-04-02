package com.apitest.services;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    @Override
    public String getAppName() {
        return "Hello from Test App Service";
    }
}
