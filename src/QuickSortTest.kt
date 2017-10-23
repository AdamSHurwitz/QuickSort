import java.io.File
import java.io.InputStream

object QuickSortTest {
    var smallTest = arrayListOf<Int>(4, 3, 2, 1)
    var secondIterationTest = arrayListOf<Int>(3, 2, 1, 4)
    var thirdIterationTest = arrayListOf<Int>(2, 1, 3, 4)

    @JvmStatic
    fun main(args: Array<String>) {
        //test(smallTest)
        //test(secondIterationTest)
        //test(thirdIterationTest)

        var veryBigArray = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { veryBigArray.add(it.toInt()) }
        //test(veryBigArray.toTypedArray())
    }

    fun test(array: ArrayList<Int>) {
        var quickSort = QuickSort
        quickSort.quickSort(quickSort.initArray(array), quickSort.pivotByFirstElement())
        //quickSort.quickSort(quickSort.initArray(array), quickSort.pivotByFirstElement())
        //quickSort.quickSort(quickSort.initArray(array), quickSort.pivotByFirstElement())
        for (i in quickSort.a) {
            print(i)
        }
        println()
    }

}