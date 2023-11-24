#include <iostream>
#include <stdlib.h>
#include <conio.h>

using namespace std;

int main(int argc, char *argv[]){
	system("mode con: cols=80 lines=25");
	int i, x, vcand, tvotos=0, cand1=0, cand2=0, cand3=0, cand4=0;
	char opc;
	textbackground(15);
	clrscr();
	textcolor(1);
	
	for(i=6; i<=74; i++){
		gotoxy(i,7);printf("%c",220);
		gotoxy(i,11);printf("%c",220);
		gotoxy(i,15);printf("%c",220);
	}
	gotoxy(20,7);printf("nota: borra este mensaje y es tuyo :v :v :v");
	gotoxy(29,9);printf("Proceso electoral 2019");
	gotoxy(30,10);printf("Votacion electr%cnica",162);
	gotoxy(20,13);printf("Desarrollado por: Sistemas Inform%cticos",160);
	gotoxy(32,14);printf("UDENAR - Ipiales");
	textcolor(9);
	gotoxy(6,18);printf("Cargando datos, espere porfavor.....");
	
	for(i=6; i<=74;i++){
		for(x=0; x<=300; x++){
			gotoxy(i,20);printf("%c",177);
		}
	}
   	gotoxy(6,24);system("PAUSE");
   	do{
			textbackground(0);
  			clrscr();
		do{
			
  			clrscr();
			
  			textcolor(11);/////LETRA V/////
  			for(i=3; i<=11; i++){
				gotoxy(6,i);printf("%c",219);
				gotoxy(12,i);printf("%c",219);
				
  			}
  			for(i=9; i<=11; i++){
				gotoxy(7,3);printf("%c",219);
				gotoxy(7,i);printf("%c",219);
				gotoxy(11,3);printf("%c",219);
				gotoxy(11,i);printf("%c",219);
  			}
  			for(i=3; i<=8; i++){
				gotoxy(8,i);printf("%c",219);
				gotoxy(8,10);printf("%c",219);
				gotoxy(8,11);printf("%c",219);
				gotoxy(10,i);printf("%c",219);
				gotoxy(10,10);printf("%c",219);
				gotoxy(10,11);printf("%c",219);
  			}
  			for(i=3; i<=9; i++){
				gotoxy(9,i);printf("%c",219);
				gotoxy(9,11);printf("%c",219);
  			}
  			textcolor(13);/////LETRA O/////
  			for(i=3; i<=11; i++){
				gotoxy(13,i);printf("%c",219);
				gotoxy(19,i);printf("%c",219);
  			}
  			for(i=3; i<=4; i++){
				gotoxy(14,i);printf("%c",219);
				gotoxy(14,(i+7));printf("%c",219);
				gotoxy(18,i);printf("%c",219);
				gotoxy(18,(i+7));printf("%c",219);
  			}
  			for(i=5; i<=9; i++){
				for(x=15; x<=17; x++){
					gotoxy(x,3);printf("%c",219);
					gotoxy(x,i);printf("%c",219);
					gotoxy(x,11);printf("%c",219);
				}
  			}
  			textcolor(14);/////LETRA T/////
  			for(i=3; i<=11; i++){
				gotoxy(20,i);printf("%c",219);
				gotoxy(26,i);printf("%c",219);
  			}
  			for(i=5; i<=11; i++){
				for(x=21; x<=22; x++){
					gotoxy(x,3);printf("%c",219);
					gotoxy(x,i);printf("%c",219);
					gotoxy((x+3),3);printf("%c",219);
					gotoxy((x+3),i);printf("%c",219);
				}
				gotoxy(23,3);printf("%c",219);
				gotoxy(23,11);printf("%c",219);	
  			}
  			textcolor(12);/////LETRA A/////
  			for(i=3; i<=11; i++){
				gotoxy(27,i);printf("%c",219);
				gotoxy(33,i);printf("%c",219);
				
  			}
  			for(i=3; i<=5; i++){
				gotoxy(28,11);printf("%c",219);
				gotoxy(28,i);printf("%c",219);
				gotoxy(32,11);printf("%c",219);
				gotoxy(32,i);printf("%c",219);
  			}
  			for(i=9; i<=11; i++){
				gotoxy(29,i);printf("%c",219);
				gotoxy(30,3);printf("%c",219);
				gotoxy(30,i);printf("%c",219);
				gotoxy(31,i);printf("%c",219);
				for(x=3; x<=4; x++){
					gotoxy(29,x);printf("%c",219);
					gotoxy(29,(x+3));printf("%c",219);
					gotoxy(31,x);printf("%c",219);
					gotoxy(31,(x+3));printf("%c",219);
				}
  			}
  			for(i=5; i<=7; i++){
				gotoxy(30,i);printf("%c",219);
  			}
  			textcolor(1);/////EXCALAMACIÓN/////
  			for(i=3; i<=11; i++){
				for(x=34; x<=36; x++){
					gotoxy(x,i);printf("%c",219);
					gotoxy((x+4),i);printf("%c",219);
				}
				gotoxy(37,3);printf("%c",219);
				gotoxy(37,9);printf("%c",219);
				gotoxy(37,11);printf("%c",219);
				
  			}
   			textcolor(10);
   			gotoxy(6,13);printf("Bienvenido a su sistema de votaci%cn electr%cnico",162,162);
   			gotoxy(6,14);printf("Para votar escriba el n%cmero de su candidato",163);
   			gotoxy(6,15);printf("Solamente son v%clidos los n%cmeros del 1 al 4",160,163);
   	
   			textcolor(11);
   			gotoxy(6,19);printf("De paso, tambien borra este mensaje :v :v");
   			gotoxy(6,17);clreol();printf("Ingrese su elecci%cn: ",162);scanf("%d",&vcand);
   			
   			if(vcand<1||vcand>4){
				textcolor(12);
				for(i=3; i<=14; i++){
					for(x=66; x<=67; x++){
						gotoxy(x,i);printf("%c",219);
						gotoxy((x+10),i);printf("%c",219);
					}
				}
				for(i=6; i<=11; i++){
					gotoxy(68,3);printf("%c",219);
					gotoxy(68,i);printf("%c",219);
					gotoxy(68,14);printf("%c",219);
					gotoxy(69,3);printf("%c",219);
					gotoxy(69,8);printf("%c",219);
					gotoxy(69,9);printf("%c",219);
					gotoxy(69,14);printf("%c",219);
					gotoxy(74,3);printf("%c",219);
					gotoxy(74,8);printf("%c",219);
					gotoxy(74,9);printf("%c",219);
					gotoxy(74,14);printf("%c",219);
					gotoxy(75,3);printf("%c",219);
					gotoxy(75,i);printf("%c",219);
					gotoxy(75,14);printf("%c",219);
				}
				for(i=3; i<=5; i++){
					gotoxy(70,i);printf("%c",219);
					gotoxy(70,(i+9));printf("%c",219);
					gotoxy(73,i);printf("%c",219);
					gotoxy(73,(i+9));printf("%c",219);
				}
				for(i=3; i<=7; i++){
					gotoxy(71,i);printf("%c",219);
					gotoxy(71,(i+7));printf("%c",219);
					gotoxy(72,i);printf("%c",219);
					gotoxy(72,(i+7));printf("%c",219);
				}
				
				gotoxy(40,17);printf("Candidato no registrado");
				textcolor(15);
				gotoxy(6,24);system("PAUSE");
   			}
   		
		}while(vcand<1||vcand>4);
		
		tvotos++;
		switch(vcand){
			case 1:{
				textcolor(2);
				for(i=3; i<=14; i++){
					for(x=66; x<=67; x++){
						gotoxy(x,i);printf("%c",219);
						gotoxy((x+10),i);printf("%c",219);
					}
				}
				for(i=6; i<=11; i++){
					for(x=68; x<=70; x++){
						gotoxy(x,3);printf("%c",219);
						gotoxy(x,i);printf("%c",219);
						gotoxy(x,14);printf("%c",219);
					}
				}
				for(i=3; i<=11; i++){
					for(x=73; x<=75; x++){
						gotoxy(71,3);printf("%c",219);
						gotoxy(71,14);printf("%c",219);
						gotoxy(72,3);printf("%c",219);
						gotoxy(72,14);printf("%c",219);
						gotoxy(x,14);printf("%c",219);
						gotoxy(x,i);printf("%c",219);
					}
				}
				cand1++;
				break;
			}
			case 2:{
				textcolor(11);
				for(i=3; i<=14; i++){
					for(x=66; x<=67; x++){
						gotoxy(x,i);printf("%c",219);
						gotoxy((x+10),i);printf("%c",219);
					}
				}
				for(i=6; i<=11; i++){
					for(x=68; x<=69; x++){
						gotoxy(x,3);printf("%c",219);
						gotoxy(x,6);printf("%c",219);
						gotoxy(x,7);printf("%c",219);
						gotoxy(x,14);printf("%c",219);
						gotoxy((x+6),3);printf("%c",219);
						gotoxy((x+6),10);printf("%c",219);
						gotoxy((x+6),11);printf("%c",219);
						gotoxy((x+6),14);printf("%c",219);
					}
				}
				for(i=70; i<=73; i++){
					gotoxy(i,3);printf("%c",219);
					gotoxy(i,6);printf("%c",219);
					gotoxy(i,7);printf("%c",219);
					gotoxy(i,10);printf("%c",219);
					gotoxy(i,11);printf("%c",219);
					gotoxy(i,14);printf("%c",219);
				}
				cand2++;
				break;
			}
			case 3:{
				textcolor(12);
				for(i=3; i<=14; i++){
					for(x=66; x<=67; x++){
						gotoxy(x,i);printf("%c",219);
						gotoxy((x+10),i);printf("%c",219);
					}
				}
				for(i=6; i<=11; i++){
					for(x=68; x<=70; x++){
						gotoxy(x,i);printf("%c",219);
						gotoxy(x,3);printf("%c",219);
						gotoxy(x,14);printf("%c",219);
						gotoxy((x+3),3);printf("%c",219);
						gotoxy((x+3),6);printf("%c",219);
						gotoxy((x+3),7);printf("%c",219);
						gotoxy((x+3),10);printf("%c",219);
						gotoxy((x+3),11);printf("%c",219);
						gotoxy((x+3),14);printf("%c",219);
					}
				}
				for(i=74; i<=75; i++){
					gotoxy(i,3);printf("%c",219);
					gotoxy(i,14);printf("%c",219);
					
				}
				cand3++;
				break;
			}
			case 4:{
				textcolor(13);
				for(i=3; i<=14; i++){
					for(x=66; x<=67; x++){
						gotoxy(x,i);printf("%c",219);
						gotoxy((x+10),i);printf("%c",219);
					}
				}
				for(i=10; i<=14; i++){
					for(x=68; x<=69; x++){
						gotoxy(x,3);printf("%c",219);
						gotoxy(x,i);printf("%c",219);
						gotoxy((x+6),3);printf("%c",219);
						gotoxy((x+6),14);printf("%c",219);
					}
				}
				for(i=3; i<=7; i++){
					for(x=70; x<=73; x++){
						gotoxy(x,i);printf("%c",219);
						for(int z=10; z<=14; z++){
							gotoxy(x,z);printf("%c",219);
						}	
					}
				}
				cand4++;
				break;
			}
		}
	
		textcolor(15);
		gotoxy(6,24);system("PAUSE");
		textcolor(10);
				for(i=3; i<=14; i++){
					gotoxy(66,i);clreol();printf("%c",219);
					gotoxy(78,i);printf("%c",219);
					
				}
				for(i=3; i<=8; i++){
					gotoxy(67,i);printf("%c",219);
					gotoxy(73,i);printf("%c",219);
					for(x=10; x<=14; x++){
						gotoxy(67,x);printf("%c",219);
						gotoxy(73,x);printf("%c",219);
					}	
				}
				for(i=3; i<=9; i++){
					gotoxy(68,i);printf("%c",219);
					gotoxy(72,i);printf("%c",219);
					for(x=11; x<=14; x++){
						gotoxy(68,x);printf("%c",219);
						gotoxy(72,x);printf("%c",219);
					}	
				}
				for(i=3; i<=10; i++){
					gotoxy(69,i);printf("%c",219);
					gotoxy(71,i);printf("%c",219);
					for(x=12; x<=14; x++){
						gotoxy(69,x);printf("%c",219);
						gotoxy(71,x);printf("%c",219);
					}	
					gotoxy(70,i);printf("%c",219);
					gotoxy(70,11);printf("%c",219);
					gotoxy(70,13);printf("%c",219);
					gotoxy(70,14);printf("%c",219);
				}
				for(i=3; i<=7; i++){
					gotoxy(74,i);printf("%c",219);
					gotoxy(74,(i+6));printf("%c",219);
					gotoxy(74,14);printf("%c",219);
				}
				for(i=3; i<=6; i++){
					gotoxy(75,i);printf("%c",219);
					gotoxy(75,(i+5));printf("%c",219);
					for(x=12; x<=14; x++){
						gotoxy(75,x);printf("%c",219);
					}
				}
				for(i=3; i<=5; i++){
					gotoxy(76,i);printf("%c",219);
					gotoxy(76,(i+4));printf("%c",219);
					for(x=10; x<=14; x++){
						gotoxy(76,x);printf("%c",219);
					}
				}
				for(i=3; i<=4; i++){
					gotoxy(77,i);printf("%c",219);
					gotoxy(77,(i+3));printf("%c",219);
					for(x=8; x<=14; x++){
						gotoxy(77,x);printf("%c",219);
					}
				}
				
		textcolor(7);
		gotoxy(6,17);printf("Su voto ha sido registrado exitosamente");
		gotoxy(6,18);printf("Gracias por participar");
		gotoxy(6,20);printf("Hay mas votantes S/N: ");fflush(stdin);scanf("%c",&opc);
		
	}while(toupper(opc)=='S');
	
	clrscr();
	textcolor(1);
	for(i=6; i<=74; i++){
		for(x=3; x<=19; x+=2){
			gotoxy(i,x);printf("%c",220);
		}
	}
	textcolor(13);
	gotoxy(8,4);printf("Los valores obtenidos durante la votaci%cn fueron",162);
	gotoxy(8,6);printf("Total de votantes %d", tvotos);
	gotoxy(8,8);printf("Votos por el candidato(a) 1 ==> %d", cand1);
	gotoxy(8,10);printf("Votos por el candidato(a) 2 ==> %d", cand2);
	gotoxy(8,12);printf("Votos por el candidato(a) 3 ==> %d", cand3);
	gotoxy(8,14);printf("Votos por el candidato(a) 4 ==> %d", cand4);
	textcolor(10);
	if(cand1>cand2&&cand3&&cand4){
		gotoxy(8,16);printf("El primer lugar es del candidato(a) 1 con un total de %d votos", cand1);
		if(cand2>cand3&&cand4){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 2 con un total de %d votos", cand2);
		}
		else if(cand3>cand2&&cand4){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 3 con un total de %d votos", cand3);
		}
		else if(cand4>cand2&&cand3){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 4 con un total de %d votos", cand4);
		}	
	}
	else if(cand2>cand1&&cand3&&cand4){
		gotoxy(8,16);printf("El primer lugar es del candidato(a) 2 con un total de %d votos", cand2);
		if(cand1>cand3&&cand4){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 1 con un total de %d votos", cand1);
		}
		else if(cand3>cand1&&cand4){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 3 con un total de %d votos", cand3);
		}
		else if(cand4>cand1&&cand3){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 4 con un total de %d votos", cand4);
		}
	}
	else if(cand3>cand1&&cand2&&cand4){
		gotoxy(8,16);printf("El primer lugar es del candidato(a) 3 con un total de %d votos", cand3);
		if(cand1>cand2&&cand4){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 1 con un total de %d votos", cand1);
		}
		else if(cand2>cand1&&cand4){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 2 con un total de %d votos", cand2);
		}
		else if(cand4>cand1&&cand3){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 4 con un total de %d votos", cand4);
		}
	}
	else if(cand4>cand1&&cand2&&cand3) {
		gotoxy(8,16);printf("El primer lugar es del candidato(a) 4 con un total de %d votos", cand4);
		if(cand1>cand2&&cand3){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 1 con un total de %d votos", cand1);
		}
		else if(cand2>cand1&&cand3){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 2 con un total de %d votos", cand2);
		}
		else if(cand3>cand1&&cand2){
			gotoxy(8,18);printf("El segundo lugar es del candidato(a) 3 con un total de %d votos", cand3);
		}	
	}
	gotoxy(8,20);printf("El tercer lugar es para :v :v :v ");
   	
	
   	
   	gotoxy(6,24);system("PAUSE");  	
   	return 0;
}
