import java.util.Scanner;
public class parImparOperadores extends ImparPar{

  public parImparOperadores(int[] nums) {
    super(nums);
  }

  public void cont(int pc, int impc){
      // variável que gurada se o número é par ou ímpar
      boolean y;
      //loop para contar os pares e ímpares
      for(int i=0;i<nums.length;i++){
          y = nums[i]%2 == 0;
          if(y){
              p[pc] = nums[i];
              pc++;
          }

          else if(y){
              im[impc] = nums[i];
              impc++;
          }   
      }
  }  

  public void print(int pc, int impc){
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

  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int[] nums = {1, 2, 3, 4, 5, 6};
    //cria contadores auxiliares para contar os pares e ímpares
    int impc = 0, pc = 0;
    ImparPar ip = new ImparPar(nums);
    parImparOperadores x = new parImparOperadores(ip.getNums());
    x.cont(impc, pc);
    x.print(impc, pc);
    
  
    
  }

}