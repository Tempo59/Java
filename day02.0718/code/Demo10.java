class Demo10 
{
	public static void main(String[] args) 
	{
		/*
		2017年小明21，小强22岁
		2018年小明22，小强23
		*/
		int ageM = 21;
		int ageQ = 22;
		System.out.println("2018年，小明"+(++ageM)+"小强"+(ageQ++));
		System.out.println(ageM+","+ageQ);
	}
}
