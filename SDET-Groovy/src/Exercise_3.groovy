
class Exercise_3 {
	
	static void main(def args)
	{
		def a=0,b=1
		def arr
		for (i in 0..10){
		arr=a
		a=a+b
		(b,a)=[a,b]
		print arr+","
		}
		
	}
}
