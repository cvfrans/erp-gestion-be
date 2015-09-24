package com.fvc.erp.gestion.be.service.utils;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fvc.erp.gestion.be.service.config.ServiceConfigTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { H2ServiceConfigTest.class })
@ContextConfiguration(classes = { ServiceConfigTest.class })
@Ignore
public class MainServiceTest {

}
