class LowToMinCWC{
	public static void main (String args[]){
			double random;
			double minValue = -1;
			double nextValue = -1;
			int count = 0;
			int acount = 0; //ascending count
			int maxacount = 0;
				boolean done = false;
			
			//while (count < 1000000)
			for(int j = 0;j < 1000000;j++){
				done = false;
				minValue = Math.random();
				acount = 0;
				/////////////////////////////
				while(!done){
					nextValue = Math.random();
					if(minValue < nextValue){
							acount++;
					}else {
					     done = true;
					}
					//System.out.println(minValue+" "+nextValue);
					minValue = nextValue;	
				}//end while done
				///////////////////////////
				if (acount > maxacount)
				{maxacount = acount;						
						System.out.println(" * "+maxacount+" * ");
				}
			//count++;
		}//end while count < 1000000
	}
}
