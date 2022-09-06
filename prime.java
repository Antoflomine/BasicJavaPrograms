 class Main
{
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	        int n=23;
	        for(int i=0;i<=n;i++){
	            if(isPrime(i)){
	                System.out.print(i+" ");
	            }
	        }
	       
	}
}
