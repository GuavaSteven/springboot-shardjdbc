package com.cjw.springbootshardjdbc.model;

import lombok.Data;

import java.util.Date;

@Data
public class TOrder {
    private Date tradeTime;
    private long orderId;
    private int status;
}
