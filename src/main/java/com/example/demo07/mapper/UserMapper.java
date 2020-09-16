package com.example.demo07.mapper;


import com.example.demo07.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//表示这是一个mybatis的mapper类；或者在启动类上面加MapperScan("扫描包路径")
@Mapper
@Repository
public interface UserMapper {
    List<User> getList();
}
