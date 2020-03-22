package com.example.daocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaocloudApplicationTests {
    @Autowired
	Mysvc mysvc;

	@Test
	public void  addTest(){
    	int res = mysvc.add(11,22);
    	assert res == 33;
	}

	@Test
	public void  addTest2(){
		int res = mysvc.add(11,22);
		assert res == 33;
	}

	@Test
	public void  addTest3(){
		int res = mysvc.add(11,22);
		assert res == 33;
	}
//	@Test
//	public void  removeTest(){
//		int res = mysvc.remove(2,3);
//		assert  res == -1;
//	}

}
