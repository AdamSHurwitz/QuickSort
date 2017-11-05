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
                var temp = a[i]
                a[i] = a[j]
                a[j] = temp
                i++
            }
        }

        var temp = a[l]
        a[l] = a[i - 1]
        a[i - 1] = temp

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
                var temp = a[i]
                a[i] = a[j]
                a[j] = temp
                i++
            }
        }

        var temp = a[l]
        a[l] = a[i - 1]
        a[i - 1] = temp

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
        var firstTemp = a[l]
        a[l] = getMedian(a, l, r)
        a[r] = firstTemp

        var p = a[l]
        var i = l + 1
        var j = l + 1

        for (j in j..r) {
            if (a[j] < p) {
                var temp = a[i]
                a[i] = a[j]
                a[j] = temp
                i++
            }
        }

        var temp = a[l]
        a[l] = a[i - 1]
        a[i - 1] = temp

        c += r - l

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

    private fun getMedian(a: ArrayList<Int>, l: Int, r: Int): Int {
        var m = (r) / 2
        if (a[l] > a[m] && a[l] < a[r] || a[l] > a[r] && a[l] < a[m]) {
            return l
        } else if (a[m] > a[l] && a[m] < a[r] || a[m] > a[r] && a[m] < a[l]) {
            return m
        } else {
            return r
        }
    }
}