//todo: QuickSort
//1) Choose pivot element
//2) Partition array around pivot - smaller elements to pivot moved to left, larger to right
// • keep track of i (current partition position) and j (border of unlooked at elements)
// • j++, if element < pivot, swap element with leftmost larger than pivot element i++
// • if element > pivot, j++
// • swap pivot into correct place in the array with right most value smaller than pivot
//3) Call QuickSort on both sides <p, and >p

// Psuedo Code
//quickSort(array (A), left most index (l), right most index (r))
//p = A[l]
//i = l + 1
//for j = l + 1 to r
//if A[j] < p
//swap A[j] and A[i]
//i++
//swap A[l] and A[i-1]

object QuickSort {
    var a: ArrayList<Int>

    init {
        a = arrayListOf<Int>()
    }

    fun quickSort(a: List<Int>, p: Int) {
        var i = p
        var j = i + 1
        if (a.size > 1) {
            while (j < a.size) {
                if (a[i] > a[j]) {
                    var temp = a[i]
                    this.a[i] = a[j]
                    this.a[j] = temp
                    i++
                    j++
                } else {
                    j++
                }
            }
        }
        if(!a.isEmpty()){
            quickSort(this.a.subList(0, a.size - 1), p)
        }
    }

    fun initArray(a: ArrayList<Int>): ArrayList<Int> {
        this.a = a
        return a
    }

    fun pivotByFirstElement(): Int {
        return 0
    }
}