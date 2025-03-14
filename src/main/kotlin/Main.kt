package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val reservas = mutableListOf<Registrarreservas>()

    var opc: Int


    do{
        /*Dado un ID de reserva, se debe eliminar completamente la reserva del
sistema.
3. Mostrar todas las reservas activas:
o Debe mostrar todas las reservas registradas junto con el monto total a
pagar (precio por noche * noches reservadas).*/

        println(
            """
                
           Menu 
           1. Registrar reserva
           2. eliminar noche
           3. mostrar reservas activas
           0. salir
           
           
            """.trimIndent()
        )
        print("Seleccione una opción: ")
        opc = readln().toInt()

        when (opc) {

            1 -> {
                print("Seleccione la habitacion: ")
                val reservah = readln().toInt()
                val produc = reservas.find {it.numHabitacion == reservah}

                if (produc != null ) {

                println("Registrar:")
                print(" Ingresar el id de la reserva: ")
                val idReserva = readln().toInt()
                print(" Ingresar el id de los huespedes: ")
                val idHuespedes = readln().toInt()
                print("Ingresar el nombre de los huespedes : ")
                val nombre = readln()
                print(" Ingresar el  numero de habitacion: ")
                val numHabitacion = readln().toInt()
                print(" Ingresar el  el tipo de habitacion: ")
                val tipoHabitacion = readln()
                print(" Ingresar el  precio de la habitacion: ")
                val precio = readln().toInt()
                print(" Ingresar la cantidad de noches : ")
                val cantidadNoches = readln().toInt()
                val datosre = Registrarreservas (idReserva,idHuespedes,nombre, numHabitacion,tipoHabitacion,precio, cantidadNoches)
                reservas.add(datosre)
                println(" su usuario a sido creado con exito !")
            }else {
                println("habitacion ocupada!")
            }
            }
         2->{
             println("eliminar reserva")


         }
         3->{
             println("mostrar")
             reservas.forEach{

             }
         }

        }

    }while (opc !=0)
}