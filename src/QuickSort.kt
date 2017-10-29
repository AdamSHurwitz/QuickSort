object QuickSort {

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
                c+= (i - 2 - l)
                quickSortFirst(a, l, i - 1)
            }
            //right side
            if (r > 0 && i < r) {
                c+= (r - 1 - i)
                quickSortFirst(a, i, r)
            }
            return Pair(a, c)
        }
    }

    fun quickSortLast(a: ArrayList<Int>, l: Int, r: Int): Pair<ArrayList<Int>, Int> {
        var p = a[r]
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
                c+= (i - 2 - l)
                quickSortFirst(a, l, i - 1)
            }
            //right side
            if (r > 0 && i < r) {
                c+= (r - 1 - i)
                quickSortFirst(a, i, r)
            }
            return Pair(a, c)
        }
    }

    fun quickSortMedian(a: ArrayList<Int>, l: Int, r: Int): Pair<ArrayList<Int>, Int> {
        var p = getMedian(a, l, r)
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
                c+= (i - 2 - l)
                quickSortFirst(a, l, i - 1)
            }
            //right side
            if (r > 0 && i < r) {
                c+= (r - 1 - i)
                quickSortFirst(a, i, r)
            }
            return Pair(a, c)
        }
    }

    private fun getMedian(a: ArrayList<Int>, l: Int, r: Int): Int {
        var m = (r - 1) / 2
        if (a[l] > a[m] && a[l] < a[r] || a[l] > a[r] && a[l] < a[m]) {
            return l
        } else if (a[m] > a[l] && a[m] < a[r]){
            return m
        } else {
            return r
        }
    }

}