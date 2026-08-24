/*
fun main() {
    print("Ingrese su nota: ")
    val nota = readln().toDouble()

    if(nota >= 1.0 && nota <= 7.0){
        if(nota < 4.0){
            println("REPROBADO")
        }else if(nota >= 4.0 && nota <= 4.9){
            println("APROBADO")
        }else if(nota >= 5.0 && nota <= 5.9){
            println("BUEN DESEMPEÑO")
        }
    }else{
        println("NOTA NO VALIDA")
    }

}


fun main(){
    print("Ingrese su nota: ")
    val nota = readln().toDouble()

    if(nota in 1.0..7.0){
        when(nota){
            in 1.0.. 3.9 -> println("REPROBADO")
            in 4.0 .. 4.9 -> println("APROBADO")
            in 5.0 .. 5.9 -> println ("BUENO")
            else -> println("EXCELENTE")
        }
    }else{
        println("NOTA NO VÁLIDA")
    }
}

*/

fun main(){
    var opcion = ""

    while (opcion != "4") {
        println("==============")
        println(" MENÚ PRINCIPAL ")
        println("==============")
        println("1. Tabla de multiplicar")
        println("2. Determinar par o impar")
        println("3. Comparar dos números")
        println("4. Salir")
        print("INGRESE OPCIÓN: ")
        opcion = readln()

        when (opcion){
            "1"->{
                print("INGRESE NÚMERO: ")
                val numero = readln().toInt()

                for (i in 1 .. 10 ){
                    println("$numero x $i = ${numero * i}")
                }
            }

            "2" ->{
                print("INGRESE NÚMERO: ")
                val numero = readln().toInt()

                if(numero%2 == 0){
                    println("SU NÚMERO ES PAR")
                }else{
                    println("SU NÚMERO ES IMPAR")
                }
            }

            "3" ->{
                print("INGRESE PRIMER NÚMERO: ")
                val numUno = readln().toInt()

                print("INGRESE SEGUNDO NÚMERO: ")
                val numDos = readln().toInt()

                if(numUno > numDos){
                    println("$numUno es mayor que $numDos")
                } else if(numDos > numUno){
                    println("$numDos es mayor que $numUno")
                }else{
                    println("AMBOS NÚMEROS SON IGUALES")
                    }
                }
            "4"-> println("GRACIAS POR UTILIZAR ...")
            else-> println("OPCIÓN NO VÁLIDA")
        }
    }
}




















