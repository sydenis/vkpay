const val KOPEEK_V_RUBLE = 100U;
const val TAX_PERCENT = 0.0075;
const val MIN_TAX = 3500U;

fun main() {
    print("Сумма перевода в рублях: ")
    val transfer: UInt = (readln().toDouble() * KOPEEK_V_RUBLE.toDouble()).toUInt()

    val tax_value: Double = transfer.toDouble() * TAX_PERCENT

    val amount: UInt = if (tax_value < MIN_TAX.toDouble()) MIN_TAX else tax_value.toUInt()

    println("Комиссия: ${amount / KOPEEK_V_RUBLE} руб ${amount % KOPEEK_V_RUBLE} коп")
}