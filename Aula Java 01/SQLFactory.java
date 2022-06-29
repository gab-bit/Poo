public class SQLFactory{
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        aluno.id=1;
        aluno.nome="";
        aluno.cidade="";

        Database.executarSQL(aluno.insertSQL());
        
        if (Database.abrir(aluno, 1)) {
            System.out.println(aluno.nome);
        }
    }
}