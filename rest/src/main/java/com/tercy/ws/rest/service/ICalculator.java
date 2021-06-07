package com.tercy.ws.rest.service;

import javax.xml.ws.Response;

public interface ICalculator {
    Response add(int a, int b);
    Response minus(int a, int b);
    Response devide(int a, int b);
    Response multiply(int a, int b);
}
