// code by cwcoleman tritechsc.github.io * * * * * * * " *
class DecBin{
   public static void main (String a[]){
   
   int n; 
   String bin; String hex;
   
   for (n = 128; n < 256; n ++){
		if (n % 2 == 0){
			bin = Integer.toBinaryString(n);
			System.out.print(n+" "+bin+"\n");
		}
		n++;
   }
}
}
