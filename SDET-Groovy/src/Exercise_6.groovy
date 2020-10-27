
class Exercise_6 {
	static void main(def args)
	{
		def map=["1":"Cats", "2":"Dogs", "3":"Wolves", "4":"Horses", "5":"Donkeys"]
		def map_new=["9":"Animal","10":"Lion","11":"tiger"]
		for(def item : map) {
	
            println item.key+"value"+item.value
	
        }
		def newMap=map.plus(map_new)
		print newMap
		println newMap.values().sort()
	}
}
