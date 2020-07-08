import javax.swing.JOptionPane;
class Slide77Exercicio3{
public static void main(String args[]){

String escolaridade="";
int totalMedio=0;
int totalSuperior=0;
int totalPos=0;
do{
	escolaridade=JOptionPane.showInputDialog("Digite a escolaridade").toUpperCase();
	if (escolaridade.equals("MEDIO")){
		totalMedio++;
	}else if (escolaridade.equals("SUPERIOR")){
		totalSuperior++;
	}else if (escolaridade.equals("POS")){
		totalPos++;
	}else{
		System.out.println("Opcao inválida!");
	}
}while(JOptionPane.showConfirmDialog(null, "?", "Titulo", JOptionPane.YES_NO_OPTION)==0);

if (totalMedio>totalSuperior && totalMedio>totalPos){
	System.out.println("O mais selecionado foi o Médio");
}else if(totalSuperior>totalPos){
	System.out.println("O mais selecionado foi o Superior");
}else{
	System.out.println("O mais selecionado foi o Pós");
}

}
}