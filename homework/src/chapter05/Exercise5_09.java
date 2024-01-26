package chapter05;

public class Exercise5_09 {
	public static void main(String[] args) {

		//주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오
		//**
		//**
		//*****
		//*****

		//****
		//****
		//**
		//**
		//**
		
		//(0,0) => (0,3)    (1,0) => (0,2)    (2,0) => (0,1)
		//(0,1) => (1,3)    (1,1) => (1,2)    (2,1) => (1,1)
		//(0,2) => (2,3)    (1,2) => (2,2)    (2,2) => (2,1)
		//(0,3) => (3,3)    (1,3) => (3,2)    (2,3) => (3,1)
		//(0,4) => (4,3)    (1,4) => (4,2)    (2,4) => (4,1)    ....
		
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];  //90도 회전한 배열
		
		//회전 전 기존 배열 출력
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		//시계방향 90도 회전한 좌표 패턴을 활용해 result배열 데이터 넣기
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				result[j][3 - i] = star[i][j];
			}
		}
		//90도 회전 후 배열 출력
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}
}
