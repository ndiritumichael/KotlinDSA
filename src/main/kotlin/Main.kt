package org.devmike

import _2_cyclicrotation.cyclicRotation
import _2_cyclicrotation.oddOccurenceSolution


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
   val array: IntArray = intArrayOf(1,2,3,4,1,2,3,3,3)
    val shift = oddOccurenceSolution(array)

    println(" the shift is ${shift}")

//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
}