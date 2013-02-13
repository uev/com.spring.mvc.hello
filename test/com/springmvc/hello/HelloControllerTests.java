package com.springmvc.hello;

import static org.junit.Assert.*;

import org.junit.Test;

import org.springframework.web.servlet.ModelAndView;

import com.springmvc.hello.HelloController;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
    }
}