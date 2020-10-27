
class Exercise_1 {
	static void main(def args)
	{
		def x
		int y
		def arr=[1,2.0,"saranya",x,y]
		
		println arr
		arr.each{
			println it+" class of element "+it.getClass()
		}
		
	}
}
