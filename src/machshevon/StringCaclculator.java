

package machshevon;

public class StringCaclculator {

	
	public int add(String string) throws Exception 
	{
		
		String[] numbers = string.split(",|\n");
		
		if(string.isEmpty()){
		return 0;
		}
		else if(numbers.length == 1)
		{
			NegativeCheck(numbers);
			return StringToInt(numbers[0]);
		}
		NegativeCheck(numbers);
		return TowNumSum(numbers[0],numbers[1]);
	}

	
	public int StringToInt(String string){
		return Integer.parseInt(string);
	}
	
	public int TowNumSum(String fNum , String sNum) throws Exception
	{

		return StringToInt(fNum) + StringToInt(sNum);
	}
	
	public void NegativeCheck(String [] numbers) throws Exception
	{
		if(numbers.length != 0)
		{
			if(numbers.length == 1)
				if(StringToInt(numbers[0])<0 )
				{
					throw new Exception("negatives not allowed");
				}
			if(numbers.length == 2)
				if(StringToInt(numbers[0])<0 || StringToInt(numbers[1])<0)
				{
					throw new Exception("negatives not allowed");
				}
			}
	}
}
