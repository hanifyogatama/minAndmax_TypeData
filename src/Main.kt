// integer
private var integerMin:Int = Int.MIN_VALUE
private var integerMax:Int = Int.MAX_VALUE

fun main (args:Array<String>) {

    println("Nilai minimal integer adalah ${integerMin}")
    println("Nilai maksimal integer adalah ${integerMax}")
    println("----------------------------------------")

    // byte
    val isFloat = showFloat()
    isFloat.testFloat()
    println("----------------------------------------")

    //long
    val isLong = showLong()
    isLong.testLong()
    println("----------------------------------------")

    //Double
    val isDouble = showDouble()
    isDouble.testDouble()
    println("----------------------------------------")

    //String
}

// form floatNumber.kt
class showFloat:floatNumber(){
    fun testFloat () {
        println("Nilai minimal float adalah ${floatMin}")
        println("Nilai maksimal float adalah ${floatMax}")
    }
}

// Long
 open class longNumber() {
    internal val longMin:Long = Long.MIN_VALUE
    internal val longMax:Long = Long.MAX_VALUE
}

class showLong:longNumber(){
    fun testLong(){
        println("Nilai minimal long adalah ${longMin}")
        println("Nilai maksimal long adalah ${longMax}")
    }
}

// Double
open class doubleNumber() {
    protected var doubleMin:Double = Double.MIN_VALUE
    protected var doubleMax:Double = Double.MAX_VALUE
}

class showDouble:doubleNumber(){
    fun testDouble(){
        println("Nilai minimal double adalah ${doubleMin}")
        println("Nilai maksimal double adalah ${doubleMax}")
    }
}


