
class Exercise_4 {
	static void main(def args)
	{
		def str="This is a Groovy language"
		println("Reverse string value "+str.reverse())
		
		println("Sub string value "+str.substring(9))
		
		def arr=str.split(" ")
		println(arr)
		def str1=str
		println("Removal of string"+str1.minus("Groovy"))
		
		println("Upper case"+str.toUpperCase())
		str.sub
		
		println("Lower case"+str.toLowerCase())
		
		//matches()
		
			def matchStatus = str.matches("(.*)Groovy(.*)")
		
			if(matchStatus) { println "String matches" }
		
			
		
			//replaceAll()
		
			def replaceWith = "very Groovy"
		
			println(str.replaceAll("Groovy", replaceWith))
		
			//Notice that the original string is not changed
		
			println str
	}
}
