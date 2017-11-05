import java.io.File
import java.io.FileInputStream
import java.io.InputStream

object QuickSortTest {

    @JvmStatic
    fun main(args: Array<String>) {
        //test(arrayListOf<Int>(1, 2, 3, 4))
        //test(arrayListOf<Int>(4, 3, 2, 1))
        //test(arrayListOf(3, 8, 2, 5, 1, 4, 7, 6))
        //test(arrayListOf<Int>(11, 16, 2, 8, 1, 9, 4, 7))
        //test(arrayListOf<Int>(2, 1, 4))
        //test(arrayListOf<Int>(16, 9, 11, 8))
        //test(arrayListOf<Int>(1, 3, 2, 4))
        //test(arrayListOf<Int>(5, 6, 1, 3, -1, 8))
        //test(arrayListOf<Int>(1, 4, 3))
        //test(arrayListOf<Int>(5, 6, 1, 3, 10, -7, 0))
        //test(arrayListOf<Int>(5, 6, 1, -33, 10, -7, 0, 2, 3, -1))
        //testFile(File("src/integerarray10.txt").inputStream())
        //testFile (File("src/integerarray25.txt").inputStream())
        //test(arrayListOf<Int>(9, 7, 3, 6))
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
        var listSortFirst = ArrayList(arrayList.toTypedArray().copyOf().asList())
        printTest(QuickSort().quickSortFirst(listSortFirst, 0, listSortFirst.size - 1))

        var listSortLast = ArrayList(arrayList.toTypedArray().copyOf().asList())
        printTest(QuickSort().quickSortLast(listSortLast, 0, listSortLast.size - 1))

        /*var listSortMedian = ArrayList(arrayList.toTypedArray().copyOf().asList())
        printTest(QuickSort().quickSortMedian(listSortMedian, 0, listSortMedian.size - 1))*/
    }

    private fun printTest(result: Pair<ArrayList<Int>, Int>) {
        for (i in result.first) {
            println(i)
        }
        println("Comparisons: " + result.second)
        println()
    }

}