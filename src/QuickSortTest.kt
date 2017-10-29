import java.io.File
import java.io.InputStream

object QuickSortTest {
    var smallTest = arrayListOf<Int>(4, 3, 2, 1)
    var secondIterationTest = arrayListOf<Int>(1, 3, 2, 4)
    var thirdIterationTest = arrayListOf<Int>(2, 1, 3, 4)

    var weirdTest = arrayListOf<Int>(5, 6, 1, 3, -1, 8)
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
        test(weirdTest10)

        /*var array10 = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray10.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { array10.add(it.toInt()) }
        test(array10)*/

        /*var array25 = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray25.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { array25.add(it.toInt()) }
        test(array25)*/

        /*var array35 = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray35.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { array35.add(it.toInt()) }
        test(array35)*/

        //todo: figure out how to scale
        /*var array50 = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray50.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { array50.add(it.toInt()) }
        test(array50)*/

        /*var array100 = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray100.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { array100.add(it.toInt()) }
        test(array100)*/

        /*var veryBigArray = arrayListOf<Int>()
        val inputStream: InputStream = File("src/integerarray.txt").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it) } }
        lineList.forEach { veryBigArray.add(it.toInt()) }
        test(veryBigArray)*/
    }

    //todo: base case length n is sorted
    fun test(arrayList: ArrayList<Int>) {
        //todo: set partition p
        //todo: recurse on everything lower than p and greater than p
        var quickSort = QuickSort.quickSort(arrayList, 0, arrayList.size - 1)
        for (i in quickSort) {
            println(i)
        }
        println()
    }

}