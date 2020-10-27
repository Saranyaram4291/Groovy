
class Exercise_7 {
	static void main(def args)
	{
		File file=new File("C:\\Users\\SaranyaRamamoorthy\\Desktop\\Project\\SDET\\src.txt")
		file.createNewFile()	
		file.write('''A quick brown Fox jumped over the lazy 12 Cow\nJohn Jimbo jingeled happily ever after\nTh1$ 1$ v3ry c0nfus1ng''')
		def text=file.getText()
		println(text)
		file.eachLine { line -> if(line==~/.*Cow$/)
			{
			println "Match is successful1"
			println line
			}
		}
		file.eachLine { line -> if(line==~/(.)*^J.*/)
			 {
			println("Match is successful")
			println line
			 }
			} 
			
		file.eachLine { line->if(line==~/.*(\d\d).*/)
		{
			println("Match is successful2")
			println line
			
		}
		}	
		def match1 = file.getText() =~ /\S+er/
		println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
		
		def match2 = file.getText() =~ /\S*\d\W/
		println "String(s) matching  are: ${match2.findAll()}"
		
		
		
	}
}