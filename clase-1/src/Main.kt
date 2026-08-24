//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("INGRESE PRODUCTO: ")
    val producto = readln()

    println("INGRESE PRECIO: ")
    val precio = readln().toInt()

    println("INGRESE CANTIDAD: ")
    val cantidad = readln().toInt()

    val subtotal = precio * cantidad
    var descuento = 0

    if(subtotal > 50000) {
        descuento = (subtotal * 0.1).toInt()
    }


    var total = subtotal-descuento
    println("SUBTOTAL: $subtotal")
    println("DESCUENTO: $descuento")
    println("TOTAL A PAGAR: $total")
}