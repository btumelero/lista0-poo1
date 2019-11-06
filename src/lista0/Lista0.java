package lista0;

/**
 *
 * @author Bruno
 */
public class Lista0 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    /* Questao 1
     * Classe classe = new Classe();
     * Organização do código de forma mais coerente e o reaproveitamento do código, por exemplo.
     */
    
    /* Questão 2
     * Classe classe = new Classe();
     * Classe classe = new Classe(true, "Bruno");
     * Contrutures tornam necessário cumprir certos requerimentos (a inicialização de um atributo, p.e.)
     * para que possa ser possível que um objeto seja instaciado, caso ele seja definido pelo usuário.
     */
    
    /* Questão 3
     * int idade = 18;
     * classe.maiorIdade(idade);
     * atributos permitem o armazenamento de informações para posterior manipulação, e métodos
     * são úteis no reaproveitamento de código, p.e.
     */
    
    /* Questão 4
     * public class SubClasse extends Classe
     *                        implements Interface
     * Em java, não há herança múltipla, mas é possível implementar múltiplas interfaces.
     * O que não for privado será herdado. 
     * "extends" e "implements"
     */
    
    /* Questão 5
     * if (algo instanceof Classe)
     * Tanto Classes quanto SubClasses serão aceitas na checagem, pois todas as SubClasses também são
     * Classes. Isso significa que um objeto pode ter mais do que uma forma (polimorfismo)
     */
    
    /* Questão 6
     * private int idade;
     * protected boolean maiorIdade;
     * Permitem ao programador impedir a modificação do valor armazenado em um atributo de forma inadequada,
     * ou o uso de métodos que ele deseja que seja de uso exclusivo de uma classe, p.e.
     */
    
    /* Questão 7
     * private int idade;
     * public void setIdade (int idade)
     * public void getIdade ()
     * SETs são usados para validações antes da atribuição de um valor para um atributo, enquanto
     * GETs permitem a obtenção de valores de atributos que normalmente não estariam disponíveis
     */
    
    /* Questão 8
     * public static int numero;
     * public static boolean maiorIdade (int idade)
     * static permite que um atributo pertença a classe, ao invés do objeto, enquanto atributos podem
     * ser utilizados sem que um objeto Classe seja instanciado, p.e.
     */
    
    /* Questão 9
     * public final double pi = 3,14;
     * public final maiorIdade (int idade)
     * final torna um atributo uma constante, fazendo com que o valor dele não possa ser alterado 
     * após a primeira atribuição, enquanto em métodos ele proíbe a sobreescrita
     */
    
    /* Questão 10
     * public abstract class Classe 
     * public abstract boolean maiorIdade (int idade)
     * classes abstratas não podem ser instaciadas e são usadas geralmente quando não faz sentido
     * permitir a instaciação de um objeto p.e.. Nelas podem estar contidos métodos cuja implementação
     * se tornará obrigatória nas subclasses
     */
    
    /* Questão 11
     * public interface Interface
     * Em java, foram criadas para driblar a impssibilidade da herança múltipla. Elas tornam obrigatória
     * a implementação de qualquer método contido nelas em classes que a implementem
     */
    
    /* Questão 12
     * @Override
     * permite que uma subclasse modifique um método de uma superclasse sobreescrevendo-o de acordo
     * com a necessidade do programador
     */
    
    /* Questão 13
     * .get(Object o);
     * .get(int index, Object o)
     * permite que um mesmo método possua assinaturas diferentes, adequando-os a situações diferentes, p.e.
     */
    
    /* Questão 14
     * super.maiorIdade()
     * super(int idade)
     * permite a chamada de um método/atributo de uma superclasse, p.e.
     */
  }
  
}
