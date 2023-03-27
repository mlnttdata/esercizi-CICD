
public class Bambino implements Comparabile{
        private String nome;
        private int eta;
        public Bambino(String nome, int eta){
            this.nome = nome;
            this.eta = eta;
        }

        public String toString(){
            return "Nome: "+nome+", Eta': "+eta;
        }
        public boolean maggioreDi(Object x){
            Bambino b = (Bambino) x;
            if(this.eta > b.eta){
                return true;
            }
            else{
                return false;
            }
        }
    }
