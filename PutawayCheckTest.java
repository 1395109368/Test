package com.bmsoft.dww.web;

import com.bmsoft.dww.common.responsevo.PutawayCheckVO;
import com.bmsoft.dww.web.mapper.PutawayCheckMapper;
import java.util.ArrayList;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 上架审核测试类
 *
 * @author songfeng
 * @date 2020/09/04
 */

@SpringBootTest(classes = WebApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class PutawayCheckTest {

  @Resource
  PutawayCheckMapper putawayCheckMapper;

  @Test
  public void queryPutawayCheckList() {
    PutawayCheckVO putawayCheckVO = new PutawayCheckVO();
    putawayCheckVO.setModule("");

   log.info("上架审核模块"+putawayCheckMapper.queryPutawayList(putawayCheckVO,new ArrayList<>()));
  }

}
