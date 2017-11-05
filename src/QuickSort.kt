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

        c += (r - l)

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

    //todo: run same algo as first, pre step swap first element with given pivot
    fun quickSortLast(a: ArrayList<Int>, l: Int, r: Int): Pair<ArrayList<Int>, Int> {
        var p = a[r]
        var i = l
        var j = l

        //println("p: " + p.toString() + " i: " +  i)

        for (j in j..r) {
            if (a[j] < p) {
                var temp = a[i]
                a[i] = a[j]
                a[j] = temp
                i++
            }
        }

        if (a[r] != a[i]) {
            var temp = a[r]
            a[r] = a[i]
            a[i] = temp
        }

        if (l > r) {
            c++
            var temp = a[l]
            a[l] = a[r]
            a[r] = temp
            return Pair(a, c)
        } else {
            //left side
            if (l >= 0 && i - 1 > 0) {
                c += i - 1 - l
                println("nextLeft: " + l + " " + (i - 1))
                quickSortLast(a, l, i - 1)
            }
            //right side
            if (r > 0 && i < r) {
                c += r - i + 1
                println("nextRight: " + (i + 1) + " " + r)
                quickSortLast(a, i + 1, r)
            }
            return Pair(a, c)
        }
    }

    /*fun quickSortMedian(a: ArrayList<Int>, l: Int, r: Int): Pair<ArrayList<Int>, Int> {
        var p = getMedian(a, l, r)
        var i = 0
        var j = 0

        for (j in j..r) {
            if (a[j] < p) {
                var temp = a[i]
                a[i] = a[j]
                a[j] = temp
                i++
            }
        }

        if (a[l] != a[i - 1]) {
            var temp = a[l]
            a[l] = a[i - 1]
            a[i - 1] = temp
        }

        if (l == r) {
            return Pair(a, c)
        } else {
            //left side
            if (l >= 0 && i - 2 > 0) {
                c += (i - 2 - l)
                quickSortMedian(a, l, i - 1)
            }
            //right side
            if (r > 0 && i < r) {
                c += (r - 1 - i)
                quickSortMedian(a, i, r)
            }
            return Pair(a, c)
        }
    }*/

    private fun getMedian(a: ArrayList<Int>, l: Int, r: Int): Int {
        var m = (r - 1) / 2
        if (a[l] > a[m] && a[l] < a[r] || a[l] > a[r] && a[l] < a[m]) {
            return l
        } else if (a[m] > a[l] && a[m] < a[r]) {
            return m
        } else {
            return r
        }
    }
}