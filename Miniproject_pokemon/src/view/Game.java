package view;

import java.util.Random;
import java.util.Scanner;

import controller.Controller;
import model.EnemyDAO;
import model.PM;
import model.PMDAO;
import model.MyPM;
import model.PokeArt1;
import model.PokeArt2;
import model.YourPM;

public class Game {

	public static void game(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		PMDAO pmdao = new PMDAO();
		Controller con = new Controller();
		PM mypm = new PM();
		EnemyDAO edao = new EnemyDAO();

		
		System.out.println("++++++++++ 환영 합니다.! +++++++++");
		System.out.println("********** 주  의  ********** ");
		System.out.println(">>>> 게임에서 패배시 당신은 태초마을로 돌아가 처음부터 다시 시작합니다. "); 
		System.out.println(">>>> 게임을 시작하시겠습니까 ? "); 
		System.out.println("=================== [1]예  [2]아니오 ============= ");
		int menu = sc.nextInt();
		if (menu == 1) {
			con.playbattle();
			System.out.println("당신은 포켓몬 마스터가 되기 위해");
			System.out.println("4개의 스테이지와 챔피언에게 도전을 시작합니다.");
			;
			System.out.println("");
			for (int i = 0; i <5; i = i) {
				System.out.println("□■■■■■□□□□□□■■□□□■■■■■■■□■■■■■■■□□■□□□□□□■■■■■■\r\n"
						+ "□■□□□■■□□□□□■■■□□□□□■□□□□□□□■□□□□□■□□□□□□■□□□□□\r\n"
						+ "□■□□□■■□□□□■■■■□□□□□■□□□□□□□■□□□□□■□□□□□□■□□□□□\r\n"
						+ "□■■■■■■□□□□■■□■■□□□□■□□□□□□□■□□□□□■□□□□□□■□□□□□\r\n"
						+ "□■□□□□■■□□■■□□■■□□□□■□□□□□□□■□□□□□■□□□□□□■■■■■■\r\n"
						+ "□■□□□□□■□□■■■■■■□□□□■□□□□□□□■□□□□□■□□□□□□■□□□□□\r\n"
						+ "□■□□□□□■□□■□□□□■■□□□■□□□□□□□■□□□□□■□□□□□□■□□□□□\r\n"
						+ "□■□□□□■■□■■□□□□■■□□□■□□□□□□□■□□□□□■□□□□□□■□□□□□\r\n"
						+ "□■■■■■■□□■■□□□□□■■□□■□□□□□□□■□□□□□■■■■■■□■■■■■■");
				con.playbattle();
				if(i==4) {System.out.println(
						"□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■□□□■■■■■■□□□□■■■■■□□■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
						+ "□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■□■■■□□■■■■■■■■□□□■■■□□□□■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
						+ "□□□■■□□□□□□■■□□□□□□■■□□□□□□□■■□□■■□□■■□□□□■■■□■■□□□□□■■□□□□□□□□□□□□■■□□□□□□■■□□□□□□■■□□\r\n"
						+ "□■■■■■■□□■■■■■■□□■■■■■■□□□□□■■■■■■□□■■□□□□□■■□□■■□□□□□■■□□□□□□□□□■■■■■■□□■■■■■■□□■■■■■■\r\n"
						+ "□□■■■■□□□□■■■■□□□□■■■■□□□□□□■■■■■□□■■□□□□□□■■□□■■■■□□□■■■■□□□□□□□□■■■■□□□□■■■■□□□□■■■■□\r\n"
						+ "□□■■■■□□□□■■■■□□□□■■■■□□□□□□■■■■■■□■■□□□□□□■■□□□□■■■□□□□■■■□□□□□□□■■■■□□□□■■■■□□□□■■■■□\r\n"
						+ "□□■■■■□□□□■■■■□□□□■■■■□□□□□□■■□□■■□□■■□□□□□■■□□□□□■■■□□□□■■■□□□□□□■■■■□□□□■■■■□□□□■■■■□\r\n"
						+ "□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■□□■■□□■■□□□□■■■□□□□□□■■□□□□□■■□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
						+ "□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■□□■■■■■■■■□□□□□■■■■□□□■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n"
						+ "□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■□□□■■■■■■□□□■■■■■■□■■■■■■□□□□□□□□□□□□□□□□□□□□□□□□□□□□");}
			
				System.out.println(" ");
				System.out.println(">>>>>>> " + (i +1) + "STAGE에 입장하셨습니다.");
				System.out.println(" ");
				

				System.out.println("==============사용할 포켓몬을 선택합니다.=============");
				System.out.println("==============포켓몬 타입을 선택하세요.=============");
				for (int j = 0; j < j + 1; j++) {

					System.out.println("========== [1]불꽃 [2]물 [3]풀 [4]전기 [5]땅 =========== ");
					int typenum = sc.nextInt();
					System.out.println("      <<< 포켓몬별 공격력은 비공개 >>>    ");
					con.pmjoin(typenum);
					System.out.println("======  선택할 포켓몬의 이름 입력   =======");

					System.out.println("=====다른 타입리스트를 보려면 [0]을 입력  =======");
					String choice = sc.next();
					mypm = pmdao.Choice(choice);
					if (mypm.getAttack() > 0) {
//					System.out.println(mypm.toString());

						System.out.println("");

						break;
					}

				}
				MyPM my = new MyPM(mypm);
				YourPM your = new YourPM(edao.enemypoke().get(i));

				con.balacne(my, your);
				// 밸런스 반영

				PokeArt2.art(your);

				System.out.println("====================VS==================");
				PokeArt1.art(my);
				System.out.println("");
				System.out.println(">>> " + your.toString());
				System.out.println(">>> " + my.toString());

				int yourhp = 100;
				int myhp = 100;
				
				while (true) {
					System.out.println(" ");
					System.out.println("공격권을 정합니다. 동전의 앞면 뒷면을 맞추세요.");
					System.out.print("====== [1]앞면    [2]뒷면 ======>  ");
					int coin1 = sc.nextInt();
					int coin2 = rd.nextInt(2) + 1;
					if (coin1 == coin2) {
						if( coin2==1) {
						System.out.print("드르륵..!! 앞면이다!! 맞췄다!");}
						else { 
							System.out.print("드르륵..!! 뒷면이다!! 맞췄다!");}
						System.out.println("");
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
						System.out.println("");
						System.out.println("당신의 공격!!");
						con.playattack();
						System.out.println(my.getName() + " 이(가)" + my.getSkill() + "를 사용했다.");
						System.out.println("");
						yourhp -= my.getAttack();
						System.out.print("내 포켓몬 체력 : " + myhp);
						System.out.println("  vs 적 포켓몬 체력 : " + yourhp);
						System.out.println("");
						System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
						System.out.println("");
						if (yourhp <= 0) {
							con.stop();
						con.playdown();
							System.out.println("================== 승리하셨습니다. ===============");
							System.out.println(" ");
							i++;
							
							 if (i == 5) {
									
									Ending.Ending(args);
									
									
								}break;
								
							}
							
							
						
							
						
					}
					

					else {if( coin2==1) {
						System.out.print("드르륵..!! 앞면이다!! 틀렸다!");}
						else { 
							System.out.print("드르륵..!! 뒷면이다!! 틀렸다!");}
						System.out.println("");
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
						System.out.println("");
						con.playattack();
						System.out.println(your.getName() + " 이(가)" + your.getSkill() + "를 사용했다.");
						System.out.println("");
						myhp -= your.getAttack();
						System.out.print("내 포켓몬 체력 : " + myhp);
						System.out.println(" vs 적 포켓몬 체력 : " + yourhp);
						System.out.println("");
						System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
						System.out.println("");
						if (myhp <= 0) {
							con.stop();
							con.playdown();
							System.out.println("당신은 패배하였습니다.");
							System.out.println("당신은 태초마을로 돌아갑니다. 처음부터 다시 시작하세요");
							 Main.main(args);
						
							 break;

						}
						
					}

				}
			}

		}
		
		if (menu == 2) {
			Main.main(args);
		}

	}

}
