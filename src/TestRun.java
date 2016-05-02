import java.util.Scanner;

import account.Account1;
import datastore.DS;
import factory.AbstractFactory;
import factory.FactoryProducer;
import state.MDA_EFSM;

public class TestRun {

	public static void main(String[] args) {

		System.out.println("================================== ");

		System.out.println("1. Account1");

		System.out.println("2. Account2");

		System.out.println("0. Exit");

		System.out.print("Enter Your Choice: ");

		Scanner s=new Scanner(System.in);

		int ac=s.nextInt();



		if(ac==1){

			AbstractFactory factory=FactoryProducer.getFactory("ACCOUNT1FACTORY");

			MDA_EFSM m=new MDA_EFSM(factory);

			DS ds1=new factory.Account1Factory().getDataStore();

			System.out.println("==================ACCOUNT 1=================== ");

			System.out.println("1. Open");

			System.out.println("2. Login");

			System.out.println("0. Exit");

			int sel=-1;

			while(sel!=0){
				
				System.out.println("\n");

				System.out.print("Enter Your Choice: ");

				sel=s.nextInt();

				switch (sel) {

				case 1: System.out.println("OPENNING ACCOUNT IN AC 1");
				m.open();

				break;

				case 2: System.out.println("LOGIN ACCOUNT IN AC 1");
				m.login();					

				break;

				}

			}

		}

		if(ac==2){

			System.out.println("==================ACCOUNT 2=================== ");

			System.out.println("1. Open");

			System.out.println("0. Exit");

			int sel=-1;

			while(sel!=0){

				System.out.print("Enter Your Choice: ");

				sel=s.nextInt();

				switch (sel) {

				case 1: System.out.println("OPENNING ACCOUNT IN AC 2");

				break;

				}

			}

		}


	}

}
