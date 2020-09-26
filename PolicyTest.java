package com.bmsoft.dww.web;

import com.bmsoft.dww.common.requestdto.PolicyDto;
import com.bmsoft.dww.common.responsevo.ResultVO;
import com.bmsoft.dww.web.mapper.PolicyMapper;
import com.bmsoft.dww.web.mapper.PublicServiceMapper;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 法律法规测试类
 *
 * @author songfeng
 * @date 2020/09/05
 */
@SpringBootTest(classes = WebApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class PolicyTest {

  @Resource
  PolicyMapper policyMapper;


  @Test
  public void queryPolicyApp() {

    log.info("小程序" + policyMapper.searchPolicyApp("法律法规", "4"));

  }


  @Test
  public void topPolicy() {
    PolicyDto policyDto = new PolicyDto();
    policyDto.setId(2L);
    policyDto.setTopTime(new Date());
    log.info("一键置顶日志" + policyMapper.updatePolicy(policyDto));

  }


  @Test
  public void deletePolicy() {
    PolicyDto policyDto = new PolicyDto();
    policyDto.setId(2L);
    policyDto.setTopTime(new Date());
    log.info("删除日志" + policyMapper.deletePolicy("1"));

  }


  /**
   * 更新数据
   */
  @Test
  public void UpdataPolicy() {

    PolicyDto policyDto = new PolicyDto();
    policyDto.setId(2L);
    policyDto.setContent("4146465465456465466556");
    policyDto.setPolicyName("你是世界上最帅得帅哥");
    policyDto.setCreateTime(new Date());
    policyDto.setPublishTime(new Date());
    log.info("跟新日志" + policyMapper.updatePolicy(policyDto));

  }


  /**
   * 插入数据
   */
  @Test
  public void insertPolicy() {

    PolicyDto policyDto = new PolicyDto();
    policyDto.setContent("hahhh");
    policyDto.setPolicyName("法律法规");
    policyDto.setStatus("4");
    policyDto.setCreateTime(new Date());
    log.info("插入日志" + policyMapper.insertPolicy(policyDto));

  }


  @Test
  public void queryPolicyList() {

    log.info("查询日志" + policyMapper.queryPolicyList("", "", "哈哈", "2020-09-06", new ArrayList<>()));

  }
}