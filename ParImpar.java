// 2d - remoção das bibliotecas não utilizadas
import java.util.ArrayList;

public class ParImpar{
  // 1d - Utilização de nome de variáveis e métodos mais legíveis a fim de eliminar comentários desnecessários
  // 5d - Classe pode ser única e os atributos globais foram reduzidos;
  public static ArrayList<Integer> pares = new ArrayList<Integer>();
  public static ArrayList<Integer> impares = new ArrayList<Integer>();

  // 1d - extração de método e nomeamento explícito
  public static void inserirNumero(int num){
    // 4d - utilizando métod ao invés de consulta local e/ou variável temporária
    if(pariedade(num))
      pares.add(num);
    else
      impares.add(num);
  }
  
  // 4d - consulta que retorna a natureza do número evita variáveis temporárias e facilita reutilização
  public static boolean pariedade(int num){
    return num%2 == 0;
  }

  // 1d - extração de método e nomeamento explícito
  // 2d - remoção das váriveis redundantes que guardavam a quantidades
  public static int qtdPares(){
    return pares.size();
  }

  // 1d - extração de método e nomeamento explícito
  // 2d - remoção das váriveis redundantes que guardavam a quantidades
  public static int qtdImapares(){
    return impares.size();
  }

  // 1d - extração de método e nomeamento explícito
  // 3d - Divisão do método em funções menores print() -> mostrarPares() e mostrarImpares()
  // 2d - remoção de parâmetros desnecessários
  public static void mostraPares(){
    for (int par : pares)
	      { 		      
	           System.out.print("\t"+par); 		
	      }
  }

  // 1d - extração de método e nomeamento explícito
  // 3d - Divisão do método em funções menores print() -> mostrarPares() e mostrarImpares()
  // 2d - remoção de parâmetros desnecessários
  public static void mostrarImpares(){
    for (int impar : impares)
	      { 		      
	           System.out.print("\t"+impar); 		
	      }
  }
  
  public static void main(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 65, 2, 7, 5, 3, 1};
    for (int num: numeros){
      inserirNumero(num);
    }

    System.out.printf("%d Numeros pares:\n", qtdPares());
    mostraPares();

    System.out.printf("\n%d Numeros impares:\n", qtdImapares());
    mostrarImpares();


  }

}


/*
  1)
      a- Comments

      b- 
      //loop para contar os pares e ímpares
        for(int i=0;i<10;i++){
            if(num%2==0){
                p[pc] = num;
                pc++;
            }

            else{
                im[impc] = num;
                impc++;
            }
            
        }
      
        //imprime todos os valores ímpares
        impc=0;
        for(int i=0; i<im.length; i++){
            if(im[i]!=0){
                impc++;
                System.out.println("impar["+i+"] = "+im[i]);}
        }
        //imprime a quantidade de ímpares
        System.out.println(impc);
        
        
        //imprime todos os valores pares
        pc=0;
        for(int i=0; i<p.length; i++){
            if(p[i]!=0){
                pc++;
                System.out.println("par["+i+"] = "+p[i]);}
        }
          //imprime a quantidade de pares
        System.out.println(pc);

    c- Extração de métodos, renomeamento de variáveis.

    d- indicações no código refatorado.

  2)
    a- Dead code

    b-
        int qtdimp, qtdp;
        impc=0;
        //imprime a quantidade de ímpares
        qtdimp = impc;
        System.out.println(qtdimp);
        pc=0;
        //imprime a quantidade de pares
        qtdp = pc;
        System.out.println(pc);

        import java.util.Scanner;
        Scanner entrada = new Scanner(System.in);

    c- remoção do código redundante não utilizável e remoção de parâmetros
    d- indicações no código refatorado

  3)
    a- Long method

    b-
        public void print(){
        //imprime todos os valores ímpares
        impc=0;
        for(int i=0; i<im.length; i++){
            if(im[i]!=0){
                impc++;
                System.out.println("impar["+i+"] = "+im[i]);
            }
        }
        //imprime a quantidade de ímpares
        qtdimp = impc;
        System.out.println(qtdimp);
        
       
        //imprime todos os valores pares
        pc=0;
        for(int i=0; i<p.length; i++){
            if(p[i]!=0){
                pc++;
                System.out.println("par["+i+"] = "+p[i]);
            }
        }
        //imprime a quantidade de pares
        qtdp = pc;
        System.out.println(pc);
        }
    
    c- Extralçao de métodos menores
    d- Indicações no código refatorado

  4)
    a- Duplicate code

    b-
        boolean y;
        //loop para contar os pares e ímpares
        for(int i=0;i<num.length;i++){
            y = num[i]%2 == 0;
            if(y){
                p[pc] = num[i];
                pc++;
            }

            else if(y){
                im[impc] = num[i];
                impc++;
            }   
        }

    c- trocar a váriavel temporária por uma consulta

    d-  indicações no código refatorado

  5)
    a- Lazy Class

    b-
      public class ImparPar {
        //cria um array de números ímpares
        int[] im;
        //cria um array de números pares
        int[] p;
        int[] nums;
        //guarta a quantidade total de pares e ímpares
        int qtdimp, qtdp;

        public ImparPar(int[] nums){
            this.im = new int[10];
            this.p = new int[10];
            this.nums = nums;
        }

        public int[] getIm() {
          return im;
        }

        public int[] getNums() {
          return nums;
        }
        public int[] getP() {
          return p;
        }

        public int getQtdimp() {
          return qtdimp;
        }

        public int getQtdp() {
          return qtdp;
        }

        public void setIm(int[] im) {
          this.im = im;
        }

        public void setNums(int[] nums) {
          this.nums = nums;
        }

        public void setP(int[] p) {
          this.p = p;
        }

        public void setQtdimp(int qtdimp) {
          this.qtdimp = qtdimp;
        }

        public void setQtdp(int qtdp) {
          this.qtdp = qtdp;
        }
    }

    c- reduzir a hierarquia

    d- indicações no código refatorado
*/