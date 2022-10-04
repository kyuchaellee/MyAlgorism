package org.zerock.w0930.dao;

import lombok.Getter;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

@Getter
public enum MyBatisUtil {
    // enum class 인스턴스의 갯수를 제한하고
    // 단 하나의 인스턴스인 INSTANCE를 만드므로써 싱글톤 구현
    INSTANCE;

    private SqlSessionFactory sqlSessionFactory;

    MyBatisUtil() {
        try{
            // mybatis-config.xml에 추가되어있는 mapper들을 통해 결과 객체등을
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
