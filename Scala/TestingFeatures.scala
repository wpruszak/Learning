
object TestingFeatures extends App {

	def ranges(): Unit = {

		val range0 = 1 to 10
		val range1 = 1 to 15 by 3
		val range2 = 1 until 10 by 2

		printf("%s\n", range0.toList.toString)

		range1.foreach { x => printf("%d, ", x) }

		printf("\n")
		println(range2.toList)
	}

	def names(): Unit = {

		val strs = Vector("Sue", "Jude", "Setzo", "Kevin", "Nick", "Kate", "Rick")

		for (name <- strs if name.startsWith("S") && name.endsWith("o"))
			println(name)
	}

	def strings(): Unit = {

		val setReverse = "Setzo".reverse
		val setCapital = "Setzo".capitalize
		val setx7 = "Setzo" * 4
		val x = "500".toInt

		printf("%s\n%s\n%s\n%d\n", setReverse, setCapital, setx7, x)
	}

	def rangeFilter(): Unit = {

		val range = 1 to 10

		val biggerThan7 = range.filter { _ > 7 }
		println(biggerThan7)

		val multiRange = range.map { _ * 2 }
		println(multiRange)
	}

	ranges

	names

	strings

	rangeFilter
}
