//todo: QuickSort

object QuickSort {

    /**
     * p is pivot
     * l is left most boundary used to calculate i (boundary of elements < and > than pivot) and j (newly seen elements)
     * r is right most boundary
     */
    fun quickSort(a: ArrayList<Int>, l: Int, r: Int): ArrayList<Int> {

        //todo: return if l >= length or r <=0
        /*if (r <= 0 || l >= a.size - 1) {
            return a
        }*/

        var p = a[l]
        var i = l + 1
        var j = l + 1

        //println("r - l: " + r + " - " + l)
        //todo: if r - l < 1, check swap
        if (r - i == 1 && a[r] < a[i]) {
            var temp = a[i]
            a[i] = a[r]
            a[r] = temp
        }

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

        if (/*e*/ i - 2 <= 0) {
        } else {
            //left side
            println("nextLeft | B: " + 0 + " E: " + (i - 2))
            quickSort(a, 0, i - 2)
        }

        if (/*b*/ i >= r) {
        } else {
            //right side
            println("nextRight | B: " + i + " E: " + r)
            //quickSort(a, i + 1, r)
        }

        return a
    }

}