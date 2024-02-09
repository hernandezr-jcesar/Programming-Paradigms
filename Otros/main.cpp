#include <iostream>

using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void comprarpeli (int NP, float &Saldito); 


int main(int argc, char** argv) {
	
	/*int a=10;
	//variable de referencia (alias/apodo)
	int &w=a;
	
	w++;
	
	cout<<a;*/
	
	float Saldo=500.00F;
	
	comprarpeli(2,Saldo);
	
	cout<<Saldo;
	
	return 0;
}
//                      paso por referencia   
void comprarpeli (int NP, float &Saldito){
	
	Saldito-=NP*50.0F;
	
}
