
public class StringCalculator {
	
	
	
		
	public static int add(String numbers) {
			
			
			int returnVal=0;
			String[] numbersArray = numbers.split(",|\n");
					
			for(String number : numbersArray) {
				
				if( !number.trim().isEmpty()) {
					
					if(Integer.parseInt(number) < 0) {
						
						throw new RuntimeException("Negative Number will through Exception");
					}
					
					if(Integer.parseInt(number) <1000) {
				
						returnVal=returnVal+Integer.parseInt(number.trim());
					
					}
				}
				
			}
				
			return returnVal;
		}

	}



