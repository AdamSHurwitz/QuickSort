import java.io.File
import java.io.FileInputStream
import java.io.InputStream

object QuickSortTest {

    @JvmStatic
    fun main(args: Array<String>) {
        //test(arrayListOf<Int>(1, 2, 3, 4))
        //test(arrayListOf<Int>(4, 3, 2, 1))
        //test(arrayListOf<Int>(1, 3, 2, 4))
        //test(arrayListOf<Int>(5, 6, 1, 3, -1, 8))
        //test(arrayListOf<Int>(1, 4, 3))
        //test(arrayListOf<Int>(5, 6, 1, 3, 10, -7, 0))
        //test(arrayListOf<Int>(5, 6, 1, -33, 10, -7, 0, 2, 3, -1))
        //testFile(File("src/integerarray10.txt").inputStream())
        //testFile(File("src/integerarray25.txt").inputStream())
        //testFile(File("src/integerarray35.txt").inputStream())
        //testFile(File("src/integerarray50.txt").inputStream())
        //testFile(File("src/integerarray100.txt").inputStream())
        testFile(File("src/integerarray.txt").inputStream())
    }

    private fun testFile(inputStream: FileInputStream) {
        var arrayList = arrayListOf<Int>()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { arrayList.add(it.toInt()) }
        test(arrayList)
    }

    fun test(arrayList: ArrayList<Int>) {
        printTest(QuickSort.quickSortFirst(arrayList, 0, arrayList.size - 1))
        //printTest(QuickSort.quickSortLast(arrayList, 0, arrayList.size - 1))
        //printTest(QuickSort.quickSortMedian(arrayList, 0, arrayList.size - 1))
    }

    private fun printTest(result: Pair<ArrayList<Int>, Int>) {
        for (i in result.first) {
            println(i)
        }
        println()
        print("Comparisons: " + result.second)
    }

}