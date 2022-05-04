package dallhyun.sunmit13;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//동물원 입장 or 나가기
		outer: while(true) {
			System.out.println("\n동물원 운영시간 09:00 ~ 18:00입니다.");
			System.out.println("1. 동물원입장 | 2. 나가기");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(sc.nextLine());
			
			// 들어가고싶은 곳 선택 
			if(command == 1) {
				while(true) {
					System.out.println("1. 사파리존 | 2. 펭귄 아일랜드 | 3. 팬더월드 | 4. 앵무새 집 | 5. 나가기");
					System.out.print(">>> ");
					int zooin = Integer.parseInt(sc.nextLine());
					
				 if(zooin == 1) {
					while(true) {
					System.out.println("사파리존 입장");
					System.out.println("1. 사자 | 2. 기린 | 3.얼룩말 | 4. 나가기");
					System.out.print(">>> ");
					int sapari = Integer.parseInt(sc.nextLine());
					
					//사자 이미지 
					if(sapari == 1) {
						System.out.println("사자 이미지");
					// 기린 이미지
					}else if (sapari == 2) {
						System.out.println("기린 이미지");
					//얼룩말 이미지
					}else if (sapari == 3) {
						System.out.println("얼룩말 이미지");
					}else if(sapari == 4) {
						break;
					}
					
					}
					
				}else if(zooin == 2) {
					while(true) {
						System.out.println("펭귄아일랜드 입장");
						System.out.println("1. 황제 펭귄 | 2. 젠투펭귄 | 3. 마카로니펭귄 | 4. 나가기");
						System.out.print(">>> ");
						int sapari = Integer.parseInt(sc.nextLine());
						
						//황제펭귄 이미지 
						if(sapari == 1) {
							System.out.println("황제펭귄 이미지 ");
						// 전투펭귄 이미지
						}else if (sapari == 2) {
							System.out.println("전투펭귄 이미지");
						//마카로니펭귄 이미지
						}else if (sapari == 3) {
							System.out.println("마카로니펭귄 이미지");
						// 나가기
						}else if(sapari == 4) {
							break;
						}
						
						}
					
					
				}else if(zooin == 3) {
					while(true) {
						System.out.println("팬더월드 입장");
						System.out.println("1. 자이언트팬더 | 2. 래서팬더 | 3. 불곰 | 4. 나가기");
						System.out.print(">>> ");
						int sapari = Integer.parseInt(sc.nextLine());
						
						//자이언트팬더 이미지 
						if(sapari == 1) {
							System.out.println("자이언트팬더");
						// 래서팬더 이미지
						}else if (sapari == 2) {
							System.out.println("래서팬더 이미지");
						//불곰 이미지
						}else if (sapari == 3) {
							System.out.println("불곰 이미지");
						// 나가기
						}else if(sapari == 4) {
							break;
						}
						
						}
					
					
				}else if(zooin == 4) {
					while(true) {
						System.out.println("앵무새집 입장");
						System.out.println("1. 마카우 앵무 | 2. 회색앵무 | 3. 아마존앵무 | 4. 나가기");
						System.out.print(">>> ");
						int sapari = Integer.parseInt(sc.nextLine());
						
						//마카우앵무 이미지 
						if(sapari == 1) {
							System.out.println("마카우앵무 이미지 ");
						// 회색앵무 이미지
						}else if (sapari == 2) {
							System.out.println("회색앵무 이미지");
						//아마존앵무 이미지
						}else if (sapari == 3) {
							System.out.println("아마존앵무 이미지");
						// 나가기
						}else if(sapari == 4) {
							break;
						}
						
						}
				}else if(zooin == 5) {
					break;
				}
				 
				 
				 
				 
				 
				 
				 
					
					
					
					
					
					
					
				
				
				
				}
				
			}else if(command == 2) {
				System.out.println("다음에 또 오세요!!");
				break;
			}		
		
			
			
		
		
			
		
		}
	
		
	}
	
}

