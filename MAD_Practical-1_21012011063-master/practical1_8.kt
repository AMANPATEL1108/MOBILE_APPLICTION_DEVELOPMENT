import java.util.Arrays

fun main(){
    println("Create array using arrayof method:")
    var a1= arrayOf(10,25,45,62,35,36)
    println(a1.contentDeepToString())
    print("Print Using for loop:")
    for (i in 0..a1.size-1){
        print(" "+a1[i])
    }
    println("\nCreate array using array<>() method:")
    var a2=Array<Int>(6){0}
    println(Arrays.deepToString(a2))

    println("\nCreate array using Array<>() and lamda function:")
    var a3=Array<Int>(8){i:Int->i}
    println(Arrays.deepToString(a3))

    println("\nCreate array using IntArray():")
    var a4=IntArray(5){0}
    println(a4.contentToString())

    println("\nCreate array using intArrayof():")
    var a5= intArrayOf(12,51,23,56,84,24)
    println(a5.joinToString(" "))

    println("\nCreate 2D array using arrayof() and intArrayof():")
    var a6= arrayOf(intArrayOf(1,5), intArrayOf(5,9), intArrayOf(6,4), intArrayOf(70,15))
    println(a6.contentDeepToString())

    println("\nCreate array using user input:")
    println("Enter the values of Array:")
    var a7= Array<Int>(5){ readLine()!!.toInt() }
    print("Entered Array is:")
    println(a7.contentDeepToString())

    println("\nSort array using built-in function:")
    a7.sort()
    print("Sorted array is:")
    println(a7.contentDeepToString())

    println("\nSort array with-out built-in function:")
    for (i in 0..a7.size-1){
        for (j in i+1..a7.size-1){
            var tmp=0
            if (a7[i]>a7[j]){
                tmp=a7[i]
                a7[i]=a7[j]
                a7[j]=tmp
            }
        }
    }
    print("Sorted array is:" )
    for (i in 0..a7.size-1) {
        print(" "+a7[i])
    }
}