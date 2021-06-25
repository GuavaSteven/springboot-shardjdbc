package com.cjw.springbootshardjdbc;

import com.cjw.springbootshardjdbc.mapper.TOrderMapper;
import com.cjw.springbootshardjdbc.mapper.TUserMapper;
import com.cjw.springbootshardjdbc.model.TOrder;
import com.cjw.springbootshardjdbc.model.TUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SpringbootShardjdbcApplicationTests {
    @Autowired
    private TOrderMapper tOrderMapper;
    @Autowired
    private TUserMapper tUserMapper;

    @Test
    void contextLoads() {
        for(int i=0;i<20;i++) {
            TOrder order = new TOrder();
            order.setStatus(1);
            order.setTradeTime(new Date());
            order.setOrderId(1212121212121L);
            tOrderMapper.insert(order);
            TUser user = new TUser();
            user.setUsername("aa"+i);
            user.setPassword("bb"+i);
            tUserMapper.insert(user);
        }
    }

}
