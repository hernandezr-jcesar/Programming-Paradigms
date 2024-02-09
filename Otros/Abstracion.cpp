//ACTIVIDAD AUTONOMA 3 de Marzo
//Julio Cesar Hernandez Reyes
#include <iostream>
using namespace std;

struct USB{
	string nombre;
	int capacidad;
	int cantidad_de_uso;
	string Sistema_archivos;
};
	
struct Fecha{
	int dia;
	string mes;
	int NUMmes;
	int anio;
};
void formatear(USB &M, string SistArch, string NueviNombre);
void mostrarPropiedades(USB M);
void cambiarNombre(string NuevoNombre,USB &M);

void SiguienteDia(Fecha &f);
int NumdediasMes(Fecha f);
int esfindemes(Fecha f);
void mostrarFecha(Fecha f);
void guardarfecha(Fecha &f);

int main(){
		
		USB A;
		A.nombre = "kingston";
		A.capacidad = 16;
		A.cantidad_de_uso = 3;
		A.Sistema_archivos = "FAT";
		
		mostrarPropiedades(A);
		formatear(A,"NTFS","ADATA");
		mostrarPropiedades(A);
		cambiarNombre("hola",A);
		
		Fecha hoy;
		hoy.dia = 3;
		hoy.NUMmes = 3; 
		hoy.anio = 2021;
		guardarfecha(hoy);
		mostrarFecha(hoy);
		
		SiguienteDia(hoy);
		
		cout<< NumdediasMes(hoy); 
		cout<< " Dias\n";
		
		cout<< esfindemes(hoy);\
		
		mostrarFecha(hoy);
}

void formatear(USB &M, string SistArch, string NueviNombre){
	M.cantidad_de_uso = 0;
	M.Sistema_archivos = SistArch;
	M.nombre = NueviNombre;
	cambiarNombre(NueviNombre,M);
}
void mostrarPropiedades(USB M){
	cout << "\nNombre: " << M.nombre;
	cout << "\nCapacidad: " << M.capacidad;
	cout << "\nCantidad de uso: " << M.cantidad_de_uso;
	cout << "\nSistema de archivos: " << M.Sistema_archivos;
	cout << "\n";
}
void cambiarNombre(string NuevoNombre,USB &M){
	M.nombre = NuevoNombre;
}

void SiguienteDia(Fecha &f){
	if (f.dia < NumdediasMes(f) ){
		f.dia++;
	}
	else if(f.NUMmes < 12 && esfindemes(f)==1 ) {
		f.NUMmes++;
		f.dia = 1;
	}
	else if(f.NUMmes == 12 && f.dia==31){
		f.NUMmes = 1;
		f.dia = 1;
		f.anio++;
	}
	guardarfecha(f);
}
int NumdediasMes(Fecha f){
	if(f.mes == "Enero"){
		return 31;
	}
	if(f.mes == "Febrero"){
		return 28;
	}
	if(f.mes == "Marzo"){
		return 31;
	}
	if(f.mes == "Abril"){
		return 30;
	}
	if(f.mes == "Mayo"){
		return 31;
	}
	if(f.mes == "Junio"){
		return 30;
	}
	if(f.mes == "Julio"){
		return 31;
	}
	if(f.mes == "Agosto"){
		return 31;
	}
	if(f.mes == "Septiembre"){
		return 30;
	}
	if(f.mes == "Octubre"){
		return 31;
	}
	if(f.mes == "Noviembre"){
		return 30;
	}
	if(f.mes == "Diciembre"){
		return 31;
	}
	return 0;
}
int esfindemes(Fecha f){
	if (f.dia == NumdediasMes(f)){
		//cout << "Si es Fin de mes";
		return 1;
	}else{
		//cout << "No es Fin de mes";
		return 0;
	}
}
void mostrarFecha(Fecha f){
	cout << "\nDia: " << f.dia;
	cout << "\nMes: " << f.mes;
	cout << "\nNumero de Mes: " << f.NUMmes;
	cout << "\nAnio: " << f.anio;
	cout << "\nFecha completa:";
	cout << "\n"<< f.dia;
	cout << "-"<< f.NUMmes;
	cout << "-"<< f.anio; ;
	cout << "\n";
	cout << "\n";
}
void guardarfecha(Fecha &f){
	if(f.NUMmes == 1){
		f.mes = "Enero";
	}
	if(f.NUMmes == 2){
		f.mes = "Febreo";
	}
	if(f.NUMmes == 3){
		f.mes = "Marzo";
	}
	if(f.NUMmes == 4){
		f.mes = "Abril";
	}
	if(f.NUMmes == 5){
		f.mes = "Mayo";
	}
	if(f.NUMmes == 6){
		f.mes = "Junio";
	}
	if(f.NUMmes == 7){
		f.mes = "Julio";
	}
	if(f.NUMmes == 8){
		f.mes = "Agosto";
	}
	if(f.NUMmes == 9){
		f.mes = "Septiembre";
	}
	if(f.NUMmes == 10){
		f.mes = "Octubre";
	}
	if(f.NUMmes == 11){
		f.mes = "Noviembre";
	}if(f.NUMmes == 12){
		f.mes = "Diciembre";
	}
}
