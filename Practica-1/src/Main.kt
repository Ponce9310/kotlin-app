fun main(){
    val numeroEntero : Int =10
    val numeroDecimal : Double =2.5

    val suma = numeroEntero + numeroDecimal
    val resta = numeroEntero - numeroDecimal
    val multiplicacion = numeroEntero * numeroDecimal
    val division = numeroEntero / numeroDecimal

    println("La suma es: $suma")
    println("La resta es: $resta")
    println("La multiplicacion es: $multiplicacion")
    println("La division es: $division")


    println("\n--- PARTE 2: Seguridad ante Nulos ---")

    var miTexto: String? = "Hola a todos"
    println("La longitud del texto es: ${miTexto?.length}")

    miTexto = null
    println("La longitud ahora es: ${miTexto?.length}")

    println("\n--- Parte 3: Lógica condicional con when ---")

    val numeroDia: Int = 4

    val nombreDia = when (numeroDia){
        1-> "Lunes"
        2-> "Martes"
        3-> "Miercoles"
        4-> "Jueves"
        5-> "Viernes"
        6-> "Sábado"
        7-> "Domingo"
        else-> "Número inválido. Debe ser del 1 al 7."
    }
    println("El día número $numeroDia corresponde a $nombreDia")

    /*
--- PREGUNTAS DE REFLEXIÓN ---

1. ¿Qué diferencias y similitudes clave observaste entre Kotlin y Java en esta actividad?
- Similitudes: Las operaciones matemáticas funcionan exactamente igual y ambos lenguajes
  comparten la misma estructura de trabajo (carpeta src, uso de funciones principales).

- Diferencias: Kotlin es mucho más limpio y directo. No exige usar punto y coma (;) al final
  de cada línea, infiere el tipo de dato automáticamente, y reemplaza el extenso bloque 'switch'
  de Java por la estructura 'when', eliminando la necesidad de escribir la palabra 'break' en cada caso.

2. ¿Cómo podrías aplicar lo aprendido sobre la seguridad ante nulos (Null Safety) y la expresión when
    en futuros proyectos de desarrollo de aplicaciones móviles?

- Null Safety: Es vital en las apps móviles para evitar que la aplicación se cierre de golpe (crashes).
  Si la app consulta información a internet y un dato falla o llega vacío, el operador '?.' protegerá la
  pantalla, permitiendo mostrar un mensaje amigable al usuario en lugar de colapsar.
- when: Será la herramienta perfecta para gestionar los menús de navegación (ej. si toca el ícono 1 abrir 'Inicio',
  si toca el 2 abrir 'Perfil') y para manejar los estados visuales de una pantalla (Cargando, Éxito, Error) con un
  código muy fácil de leer.
*/
}