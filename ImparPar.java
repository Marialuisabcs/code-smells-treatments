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

