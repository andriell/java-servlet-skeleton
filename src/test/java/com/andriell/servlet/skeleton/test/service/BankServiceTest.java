package com.andriell.servlet.skeleton.test.service;

import com.andriell.servlet.skeleton.service.BankService;
import com.andriell.servlet.skeleton.test.config.TestDataBaseConfig;
import com.andriell.servlet.skeleton.test.util.BankUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@DirtiesContext // говорит что ApplicationContext Spring будет связан с тестовым классом;
@RunWith(SpringJUnit4ClassRunner.class) //  говорит JUnit-у что для запуска тестов нужно использовать спринговый ранер;
@ContextConfiguration(classes = TestDataBaseConfig.class) // с помощью этой аннотации мы указываем какую конфигурацию контекста использовать, можно указывать несколько.
@WebAppConfiguration // используется для тестирования контроллеров например, чтобы иметь доступ к веб-ресурсам.
public class BankServiceTest {

    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;

    @Resource
    private BankService bankService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testSaveBank() throws Exception {
        bankService.addBank(BankUtil.createBank());
    }
}
