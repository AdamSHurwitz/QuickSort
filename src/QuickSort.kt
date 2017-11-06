class QuickSort {

    var c = 0

    /**
     * p is pivot
     * l is left most boundary used to calculate i (boundary of elements < and > than pivot) and j (newly seen elements)
     * r is right most boundary
     */
    fun quickSortFirst(a: ArrayList<Int>, l: Int, r: Int): Pair<ArrayList<Int>, Int> {
        var p = a[l]
        var i = l + 1
        var j = l + 1

        for (j in j..r) {
            if (a[j] < p) {
                swap(a, i, j)
                i++
            }
        }

        swap(a, l, i - 1)

        c += r - l

        if (r - l < 1) {
            return Pair(a, c)
        } else {

            //left side
            if (i - 1 > 0 && l != i - 2 && i - 2 > l) {
                println("nextLeft: " + l + " " + (i - 2))
                quickSortFirst(a, l, i - 2)
            }
            //right side
            if (i < r) {
                println("nextRight: " + (i) + " " + r)
                quickSortFirst(a, i, r)
            }
            return Pair(a, c)
        }
    }

    /**
     * p is pivot
     * l is left most boundary used to calculate i (boundary of elements < and > than pivot) and j (newly seen elements)
     * r is right most boundary
     */
    fun quickSortLast(a: ArrayList<Int>, l: Int, r: Int): Pair<ArrayList<Int>, Int> {
        var firstTemp = a[l]
        a[l] = a[r]
        a[r] = firstTemp

        var p = a[l]
        var i = l + 1
        var j = l + 1

        for (j in j..r) {
            if (a[j] < p) {
                swap(a, i, j)
                i++
            }
        }

        swap(a, l, i - 1)

        c += r - l

        if (r - l < 1) {
            return Pair(a, c)
        } else {

            //left side
            if (i - 1 > 0 && l != i - 2 && i - 2 > l) {
                println("nextLeft: " + l + " " + (i - 2))
                quickSortLast(a, l, i - 2)
            }
            //right side
            if (i < r) {
                println("nextRight: " + (i) + " " + r)
                quickSortLast(a, i, r)
            }
            return Pair(a, c)
        }
    }

    /**
     * p is pivot
     * l is left most boundary used to calculate i (boundary of elements < and > than pivot) and j (newly seen elements)
     * r is right most boundary
     */
    fun quickSortMedian(a: ArrayList<Int>, l: Int, r: Int): Pair<ArrayList<Int>, Int> {
        var getMedian = getMedian(a, l, r / 2, r)
        println("med: " + getMedian)

        var firstTemp = a[l]
        a[l] = getMedian.second
        a[getMedian.first] = firstTemp

        var p = a[l]
        var i = l + 1
        var j = l + 1

        for (j in j..r) {
            if (a[j] < p) {
                swap(a, i, j)
                i++
            }
        }

        swap(a, l, i - 1)

        c += r - (l + 1)

        if (r - l < 1) {
            return Pair(a, c)
        } else {

            //left side
            if (i - 1 > 0 && l != i - 2 && i - 2 > l) {
                println("nextLeft: " + l + " " + (i - 2))
                quickSortMedian(a, l, i - 2)
            }
            //right side
            if (i < r) {
                println("nextRight: " + (i) + " " + r)
                quickSortMedian(a, i, r)
            }
            return Pair(a, c)
        }
    }

    private fun swap(a: ArrayList<Int>, x: Int, y: Int) {
        var temp = a[x]
        a[x] = a[y]
        a[y] = temp
    }

    private fun getMedian(a: ArrayList<Int>, l: Int, m: Int, r: Int): Pair<Int, Int> {
        if (a[l] > a[m] && a[l] < a[r] || a[l] > a[r] && a[l] < a[m]) {
            return Pair(l, a[l])
        } else if (a[m] > a[l] && a[m] < a[r] || a[m] > a[r] && a[m] < a[l]) {
            return Pair(m, a[m])
        } else {
            return Pair(r, a[r])
        }
    }
}