import java.util.Scanner;

class calcgpa{
		public static void main(String args[]){
				byte b1;
				Scanner scin = new Scanner(System.in);
				System.out.print("ENTER THE NUMBER : ");
				
				b1 = scin.nextByte();
				if (b1 >= 90){
				      System.out.println("  O GRADE  ");
				      }
				else if(b1>=80 && b1<= 90){
				      System.out.println("  A+ GRADE  ");				    
				    }
				else if(b1>=70 && b1<= 80){
				      System.out.println("  A GRADE  ");				    
				    }
				else if(b1>=60 && b1<= 70){
				      System.out.println("  B+ GRADE  ");				    
				    }
				else if(b1>=50 && b1<= 60){
				      System.out.println("  B GRADE  ");
				      }
				else if(b1>=40 && b1<= 50){
				      System.out.println("  C GRADE  ");				    
				    }
				else if(b1<= 40){
				      System.out.println("  F GRADE  ");				    
				    }
				else{
				      System.out.println("  ABSENT  ");				    
				    }
				}
		}
