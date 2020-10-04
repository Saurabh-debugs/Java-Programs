package Allprogram;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Time {
	public static void main(String[] args) {    
  Time dtf = Time.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
  }
