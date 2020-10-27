
class Actiivty_1_loop {
	
	public static void main(args){
		//prints 0 to 4
		5.times {println "Times + $it "}
		//prints 1 to 3
		1.upto(3) {println "Up + $it "}
		//prints 4 to 1
		4.downto(1) {println "Down + $it "}
		
		//Sum of 100 numbers
		def sum = 0
		1.upto(100) {sum += it}
		println "Sum = " + sum
	}
}
