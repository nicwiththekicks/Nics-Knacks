// Nicolas Dmitriev Period 2 Number Methods
	public class NumberMethods {
		public static boolean isPrime(int n) {
			
			boolean prime = false;
			int count = 0;
			
			for(int i = 1; i < n; i++) {
			
					if(n % i == 0) {
			       count++; }
		    
			        if(count == 1) {
			       prime = true; 
			       }
			}
			return prime;
		}
		public static int divisorSum(int n) {
			int sum = 0;
			for (int i = 1; i<n; i++) {
				
				if(n%i==0) {
					sum = sum + i;
				}
			}
			return sum;
		}
		public static boolean isStrong(int n) {
			boolean strong = false;
			boolean prime = isPrime(n);
			int sum = divisorSum(n);
			
			    if(sum < n && prime == false) {
				 strong = true;
			}

			return strong;
		}
		public static void printDivisors(int n) {
			String divisors = "All divisors of " + n + " : ";
			for (int i = 1; i<n; i++) {
				if(n%i==0) {
					divisors += i + " ";
				}
			}
			System.out.println(divisors);;
		}
		public static void printPrimes(int n) {
			String primes = "All prime numbers less than " + n + " : ";
			for (int i = 2; i <= n; i++) {
				if (isPrime(i) == true) {
					primes = primes + String.valueOf(i) + " ";
				   }
				}
			System.out.println(primes); 
		}
		public static void printComposites(int n) {
			String composites = "All composite numbers less than " + n + " : ";
			for (int i = 2; i<n; i++) {
				if(!isPrime(i)) {
					composites += i + " ";
				}
			}
			System.out.println(composites);
		}
		public static void printStrong(int n) {
				String strong = "All strong numbers less than " + n + " : ";
				for (int i = 2; i<n; i++) {
					if(isStrong(i)) {
						strong += i + " ";
					}
				}
				System.out.println(strong);	
		}
		public static void printWeak(int n) {
			String weak = "All weak numbers less than " + n + " : ";
			for (int i = 2; i<n; i++) {
				if(!isStrong(i) && !isPrime(i)) {
					weak += i + " ";
				}
			}
			System.out.println(weak);
		}
		public static void main(String[] args) {
			printComposites(30);
			printPrimes(30);
			printStrong(30);
			printWeak(30);
		}
}
