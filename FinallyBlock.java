class FinallyBlock{
	public static void main(String args[]){
		try{
			int b=39/0;
			System.out.println(b);
		}
		catch(NullPointerException e){
				System.out.println(e);
			}
		finally{
		System.out.println("finally  block is always exectude:");
		System.out.println("rest of code:");
		}
	}
}
		
			