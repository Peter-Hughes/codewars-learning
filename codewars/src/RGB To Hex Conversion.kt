fun rgb(r: Int, g: Int, b: Int) = convertToHex(r) + convertToHex(g) + convertToHex(b)

fun convertToHex(x: Int): String {
     when {
         x < 0 -> return "00"
         x > 255 -> return "FF"
     }
    val hex = java.lang.Integer.toHexString(x).toUpperCase()
    return when {
        hex.length == 1 && !hex[0].isLetter() -> "0$hex"
        else -> hex
    }
}

fun main() {
    rgb(0, 12, 255)

}