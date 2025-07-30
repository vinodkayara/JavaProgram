package com.corejava;
   

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface Maths{
			void add();
		    void sub();
		}


			interface AdvMaths extends Maths{
				void mul();
				void div();
				
			
		}
			
			abstract class compute1 implements AdvMaths{
				public void add() {
					System.out.println("performing addition");
				}
				public void sub() {
					System.out.println("performing substraction");
				}
				public void mul() {
					System.out.println("performing multiplication");
				}
				
			}
			class compute2 extends compute1{
				public void div() {
					System.out.println("performing div");
				}
			}


	}

}
