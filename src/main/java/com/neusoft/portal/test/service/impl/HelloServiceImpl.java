package com.neusoft.portal.test.service.impl;

import com.neusoft.portal.test.dao.HelloDao;
import com.neusoft.portal.test.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    HelloDao helloDao;

    @Override
    public Map<String, Object> selectHello() {
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String localTimeNew = localDateTime.format(dateTimeFormatter);

        String aaa = "2019-12-31 12:59:59";
        LocalDateTime parse = LocalDateTime.parse(aaa, dateTimeFormatter);
        return helloDao.selectHello();
    }
}
