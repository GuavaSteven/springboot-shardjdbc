package com.cjw.springbootshardjdbc.config;


import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

@Component
public class OrderPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Date> {


    private static final String SPLITEER = "_";
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        SimpleDateFormat format = new SimpleDateFormat("YYYYMM");
        String tname = preciseShardingValue.getLogicTableName()+SPLITEER+format.format(preciseShardingValue.getValue());
        return tname;
    }
}
