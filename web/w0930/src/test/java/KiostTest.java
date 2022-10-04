import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.zerock.w0930.dao.MyBatisUtil;
import org.zerock.w0930.dto.ProductDTO;

import java.util.List;

@Log4j2
public class KiostTest {

    @Test
    public void selectProductTest() {
        SqlSession session
                = MyBatisUtil.INSTANCE.getSqlSessionFactory().openSession(true);

        List<ProductDTO> dtoList = session.selectList("org.zerock.w0930.dao.KioskMapper.selectProduct");
        dtoList.forEach(todoDTO -> log.info(todoDTO));
    }
}
