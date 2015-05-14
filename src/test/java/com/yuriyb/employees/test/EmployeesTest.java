package com.yuriyb.employees.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.*;
import org.mockito.verification.*;

import static org.mockito.Mockito.*;

import com.yuriyb.employees.*;

//@RunWith(MockitoJUnitRunner.class)
public class EmployeesTest {
	
	//@Mock
	//Department dp;
	
	@Before
	public void initialization(){
		//MockitoAnnotations.initMocks(this);
	}
	
	@Test(timeout=10000)
	public void testEmployeeCreation(){
		
		Department dp = mock(Department.class);	
		when(dp.getDeptName()).thenReturn("X");
		when(dp.getDeptBossName()).thenReturn("Joe");
		dp.setDeptName("Finance");
		
		Employee emp = new Employee("Some guy", dp);
		
		assertEquals(dp.getDeptName(), "X");
		assertEquals(emp.getId(), 1);
		
		System.out.println(dp.getDeptName());
		System.out.println(emp.getDpName());
		Mockito.verify(dp, times(3)).getDeptName();
		Mockito.verify(dp, times(1)).setDeptName(anyString());
		
		//throw new RuntimeException();
	}

}
