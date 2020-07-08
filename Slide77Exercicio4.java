import javax.swing.JOptionPane;
class Slide77Exercicio4{

public static void main(String args[]){

String nome="";
int idade=0;
String nomeMaisExperiente="";
int idadeMaisExperiente=0;
String nomeMaisNova="";
int idadeMaisNova=0;
int qtdeMaioresIdade=0;
int totalIdades=0;
int qtdePessoas=0;
char resposta=0;
do{
	nome=JOptionPane.showInputDialog("Digite o nome");
	idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
	totalIdades+=idade;
	qtdePessoas++;
	if (idade>=18){
		qtdeMaioresIdade++;
	}

	if (qtdePessoas==1){
		idadeMaisExperiente=idade;
		nomeMaisExperiente=nome;
		idadeMaisNova=idade;
		nomeMaisNova=nome;		
	}else{
		if (idade>idadeMaisExperiente){
			idadeMaisExperiente=idade;
			nomeMaisExperiente=nome;
		}
		if (idade<idadeMaisNova){
			idadeMaisNova=idade;
			nomeMaisNova=nome;
		}	
	}
	resposta=JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0);
}while(resposta=='S');

System.out.println(nomeMaisExperiente + " eh a pessoa mais experiente com " + idadeMaisExperiente + " anos.");
System.out.println(nomeMaisNova + " eh a pessoa mais nova com " + idadeMaisNova + " anos.");
System.out.println("Total de pessoas maiores de idade: "  + qtdeMaioresIdade);
System.out.println("Média: " + (totalIdades/ qtdePessoas));
}

}