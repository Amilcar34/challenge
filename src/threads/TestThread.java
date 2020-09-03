package threads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestThread implements Runnable {
  
  public static void main(String[] args){
	new Thread(new TestThread()).start();
  }
  
  public void run() throws ArithmeticException{
	int x = 0;
	System.out.println(x / 10);
  }
  
}