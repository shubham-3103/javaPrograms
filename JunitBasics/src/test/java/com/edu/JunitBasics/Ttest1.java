package com.edu.JunitBasics;

import org.junit.Ignore;
import org.junit.Test;

public class Ttest1 {
	
//	@Ignore
	@Test(timeout = 100)
	public void ttest() {
		Ttest.MyConnection();
	}
}
