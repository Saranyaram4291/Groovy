
class Exercise_5 {
	static void main(def args)
	{
		def list=[11,2,19,5,"Mango","Apple","Test"]
		def intList=[],stringList=[]
		for(values in list)
		{
			//println(type of(values.getClass))
			 if(values.getClass().equals("class java.lang.Integer"))
			 {
				 println("Integer value"+values)
				 intList.add(values)
			 }
			 if(values.getClass()=="class java.lang.String")
			{
						 stringList.add(values)
			 }
		}
		println( "Integer values"+intList)
		println( "String values"+stringList)
	}
}
