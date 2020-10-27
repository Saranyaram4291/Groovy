
class Example_2 {
	static void main(def args)
	{
		def arr=[90,80,70,45,55]
		def sum=0,avg=0
		arr.each { 
			sum+=it
		}
		avg=sum/arr.size() as Integer
		println "Maximum mark is "+arr.max()
		println "Miniumu mark is "+arr.min()
		println avg
		
		switch(avg)
		{
			case 90..100:
				println "Grade is A"
				break
			case 80..90:
				println "Grade is B"
				break
			case 70..80:
				println "Grade is C"
				break
			case 50..69:
				println "Grade is D"
				break
			case 50..1:
				println "Grade is E"
				break
		}
	}
}
