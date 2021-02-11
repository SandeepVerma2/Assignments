class Assignment1Q2{
	public static void main (String [] args) {
		int min = 100;int max = 999;
    	 for (int k = min ; k <= max ; k++)
         {
           int n = k;int d = 0; int s = 0;
             while (n > 0)
               {
                 d = n % 10;
                 s = s + (d * d * d);
                 n = n / 10;
               }
             if (k == s)
            	 System.out.print(k +" ");
                     
          }
} 

}

