import java.io.File
import java.io.InputStream

object QuickSortTest {
    var smallTest = arrayListOf<Int>(4, 3, 2, 1)
    var secondIterationTest = arrayListOf<Int>(1, 3, 2, 4)
    var thirdIterationTest = arrayListOf<Int>(2, 1, 3, 4)

    var weirdTest = arrayListOf<Int>(5, 6, 1, 3)
    var weirdTest7 = arrayListOf<Int>(5, 6, 1, 3, 10, -7, 0)
    var weirdTest10 = arrayListOf<Int>(5, 6, 1, -33, 10, -7, 0, 2, 3, -1)
    var weirdSecondIterationTest = arrayListOf<Int>(1, 4, 3)

    @JvmStatic
    fun main(args: Array<String>) {
        //test(smallTest)
        //test(secondIterationTest)
        //test(thirdIterationTest)

        //test(weirdTest)
        //test(weirdSecondIterationTest)
        //test(weirdTest7)
        //test(weirdTest10)

        var veryBigArray = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { veryBigArray.add(it.toInt()) }
        //test(veryBigArray)
    }

    //todo: base case length n is sorted
    fun test(arrayList: ArrayList<Int>) {
        //todo: set partition p
        //todo: recurse on everything lower than p and greater than p
        var quickSort = QuickSort.quickSort(arrayList, 0, arrayList.size - 1)
        //var quickSort2 = QuickSort.quickSort(quickSort, 0, arrayList.size - 1)
        //var quickSort3 = QuickSort.quickSort(quickSort2, 1, arrayList.size - 1)
        //var quickSort4 = QuickSort.quickSort(quickSort3, 2, arrayList.size - 4)
        for (i in quickSort) {
            println(i)
        }
        println()
    }

}