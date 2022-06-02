/* OBSERVAÇÕES PARA CRIAR AS CLASSES
    AGREGAÇÃO -  Quando um objeto é instanciado num atributo
    ASSOCIAÇÃO - Quando um objeto é instanciado no corpo da classe
    COMPOSIÇÃO - Quando um objeto está no construtor do objeto principal
*/


package MODEL;

import java.util.ArrayList;

public abstract class Pessoa {
        
    //ATRIBUTOS
    
        private String nome;
        private int cpf;
        private int ID;
        public static ArrayList<String> ListaTarefas;
       
    //GERADORES

        Pessoa (){
        

        }  

        Pessoa (String nome, int cpf, int ID){
            
        }
        
    //MÉTODOS
    

    //GETTERS AND SETTERS

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCpf() {
            return this.cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public int getID() {
            return this.ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        /*public void MostrarTarefas(ArrayList Lista) {
            Lista.toString();
        }

        public void setListaTarefas(ArrayList<String> ListaTarefas) {
            this.ListaTarefas = ListaTarefas;
        }

*/
}
