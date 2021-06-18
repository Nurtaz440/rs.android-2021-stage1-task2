package subtask2










class Abbrivation {
    fun abbreviationFromA(a: String, b: String): String {
        // throw NotImplementedError("Not implemented")


        val aString = a.toCharArray().toMutableList()
        val bString = b.toCharArray().toMutableList()

        var i = 0
        for(num in bString) {
            while (aString.size != 0) {
                if (aString[0] == num || aString[0].toUpperCase() == num) {
                    i ++
                    break
                }
                aString.removeAt(0)
            }
        }

        return if (i == bString.size) {
            "YES"
        } else {
            "NO"
        }

}
}






