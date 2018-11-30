fun hexStringToRGB(hexString: String): RGB {
    val r = hexString.substring(1,3).toInt(16)
    val g = hexString.substring(3,5).toInt(16)
    val b = hexString.substring(5,7).toInt(16)
    return RGB(r, g, b)
}