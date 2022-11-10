package com.tourist;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.tourist.controller.TouristController;
import com.tourist.entity.Tourist;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class TouristApplicationTests {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    TouristController touristController;
	
    @Test
    public void testCreate() {
       Tourist t=new Tourist();
       t.setId(100);
       t.setFirstName("adi");
       t.setLastName("don");
       t.setAge(33);
       t.setGender("male");
       t.setFromPlace("nagpur");
       t.setNumberOfdays(10);
       touristController.saveTourist(t);
       assertNotNull(touristController.findById(100));
       
       
}
    @Test
    public void testcreate() {
       Tourist t=new Tourist();
       t.setId(101);
       t.setFirstName("meena");
       t.setLastName("devakatte");
       t.setAge(33);
       t.setGender("female");
       t.setFromPlace("nagpur");
       t.setNumberOfdays(10);
       touristController.saveTourist(t);
       assertNotNull(touristController.findById(101));
    
}
}
