public class Histogram {
	 public static void main(String[] args) {
		 int i;
		 int num;
		 int repeat;
		 repeat = (50) + (int)(Math.random()* ( 100 - 50 + 1));
		  int [] anum = new int[10] ;
		  int [] histogram = new int [10];
		  for(i=0; i<repeat; i++) {
			  num = (int)(Math.random() * 100 + 1);
			  if(i%10 == 0)
				anum[1]=num;  
				  
			  if(num>=1 && num<=10)
				  histogram[0]++;
			  else if(num >=11 && num<=20)
				  histogram[1]++;
			  else if(num >=21 && num<=30)
				  histogram[2]++;
			  else if(num >=31 && num<=40)
				  histogram[3]++;
			  else if(num >=41 && num<=50)
				  histogram[4]++;
			  else if(num >=51 && num<=60)
				  histogram[5]++;
			  else if(num >=61 && num<=70)
				  histogram[6]++;
			  else if(num >=71 && num<=80)
				  histogram[7]++;
			  else if(num >=81 && num<=90)
				  histogram[8]++;
			  else 
				  histogram[9]++;
		  }  
			for(i=0; i<10; i++) {
				System.out.print((i*10+1)+" - "+((i+1)*10)+"  |   ");
				for(int j=0; j<histogram[i]; j++)
					System.out.print("*");
				System.out.println();
			}
			  
		  }
	 }
