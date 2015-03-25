package Exception;

public class ExceptionDemo {
	public static final String MESSAGE_DISPLAY = "Hello";
	public static void main(String[] args) {
		// MESSAGE_DISPLAY = "Change Massage";---->เปลี่ยนไม่ได้
		System.out.println( MESSAGE_DISPLAY);
		
		try {
			Long L1 = createNumber("1");
			System.out.println(1);
		} catch (NumberFormatException e) {
			System.out.println("Error : Cannot creat long number"+e.getMessage());
		}catch(IllegalArgumentException e){
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception eerror");
			
		}
		finally {

			System.out.println("Finish");
		}
	
	}

	private static Long createNumber(String str) throws Exception {
		// TODO Auto-generated method stub
		if("".equals(str)){
			//throw new Exception();
			throw new IllegalArgumentException();//--->จะเข้า Exception ถ้าเป็น ""
		}else if("100".equals(str)){
			throw new Exception("The number should not equals 100") ;
			
			
		}
		return new Long(str);
	}

}
