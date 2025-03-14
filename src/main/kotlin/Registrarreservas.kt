package org.example

class Registrarreservas {


    var idResrvas : Int = 0
    var idHuespedes : Int = 0
    var nombreHuesped : String =  ""
    var numHabitacion : Int = 0
    var tipoHbitacion: String =  ""
    var precio : Int = 0
    var cantidadNoches : Int = 0

    constructor()
    constructor(
        idHuespedes: Int,
        idResrvas: Int,
        nombreHuesped: String,
        numHabitacion: Int,
        tipoHbitacion: String,
        precio: Int,
        cantidadNoches: Int,
    ) {
        this.idHuespedes = idHuespedes
        this.idResrvas = idResrvas
        this.nombreHuesped = nombreHuesped
        this.numHabitacion = numHabitacion
        this.tipoHbitacion = tipoHbitacion
        this.precio = precio
        this.cantidadNoches = cantidadNoches
    }

    override fun toString(): String {
        return "Registrarreservas(idResrvas=$idResrvas, idHuespedes=$idHuespedes, nombreHuesped='$nombreHuesped', numHabitacion=$numHabitacion, tipoHbitacion='$tipoHbitacion', precio=$precio, cantidadNoches=$cantidadNoches)"
    }


    fun reservahab (habitacion : Int){
        if(habitacion ==numHabitacion ){
            println("la habitacion esta ocupada")
        }
        else{
            println("la habitacion no esta ocupada")

        }

    }

    fun eliminarreserva (idreserva :Int){

        if(idreserva ==idResrvas){

        }


    }

    fun mostrar () {

        val montototal = precio*cantidadNoches

        println("idResrvas=$idResrvas, idHuespedesmo=$idHuespedes, nombreHuesped='$nombreHuesped', numHabitacion=$numHabitacion, tipoHbitacion='$tipoHbitacion', precio=$precio, cantidadNoches=$cantidadNoches")
        println("el monto total es de "+montototal)
    }

    fun eliminarreserva (idreserva: Int, reservas: MutableList<Registrarreservas>) {
        val ite = reservas.iterator()
        var Numreserva = false

        while (ite.hasNext()) {
            val reserva = ite.next()
            if (reserva.idResrvas == idreserva) {
                ite.remove() // Elimina la reserva de la lista
                println(" la reserva realizada Numero: $idreserva , ha sido eliminada con exito!")
                Numreserva = true

            }
            else{
                println("no se realizo la eliminacion de la reserva")
            }
        }


        }

}

