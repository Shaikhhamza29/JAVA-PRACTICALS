import java.util.Scanner;

class positive{
		public static void main(String args[]){
				byte b1;
				Scanner scin = new Scanner(System.in);
				System.out.print("ENTER THE NUMBER : ");
				
				b1 = scin.nextByte();
				if (b1 >= 0){
				      System.out.println("!! POSITIVE NUMBER !!");
				      }
				else{
				      System.out.println("!! NOT AN POSITIVE NUMBER !!");
				      }
				}
		}
